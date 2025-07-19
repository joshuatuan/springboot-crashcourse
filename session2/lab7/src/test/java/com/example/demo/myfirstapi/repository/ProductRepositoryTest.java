package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    void shouldReturnAllProducts() {
        Product[] expectedProducts = {
                new Product(1L, "Laptop", 1200.00),
                new Product(2L, "Mouse", 25.50),
                new Product(3L, "Keyboard", 75.00)
        };

        Product[] actualProducts = productRepository.findAll().toArray(new Product[0]);

        assertArrayEquals(expectedProducts, actualProducts);
    }

    @Test
    void shouldFindProductById() {
        Product expectedProduct = new Product(1L, "Laptop", 1200.00);
        Optional<Product> actualProduct = productRepository.findById(1L);

        assertTrue(actualProduct.isPresent());
        assertEquals(expectedProduct, actualProduct.get());
    }

    @Test
    void shouldSaveNewProduct() {
        Product newProduct = new Product("New Product", 15.00);
        Product savedProduct = productRepository.save(newProduct);
        Optional<Product> retrievedProduct = productRepository.findById(savedProduct.getId());

        assertTrue(retrievedProduct.isPresent());
        assertEquals(savedProduct, retrievedProduct.get());
    }

    @Test
    void shouldUpdateExistingProduct() {
        Product originalProduct = productRepository.findById(1L).orElseThrow();
        Product updatedProduct = new Product(1L, "Updated Product", 15.00);

        productRepository.save(updatedProduct);
        Optional<Product> retrievedProduct = productRepository.findById(1L);

        assertTrue(retrievedProduct.isPresent());
        assertNotEquals(originalProduct, updatedProduct);
        assertEquals(updatedProduct, retrievedProduct.get());
    }
}