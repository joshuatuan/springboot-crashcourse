package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;
    @BeforeEach
    void setUp() {
        product = new Product("Demo Product", 500.0);
        product.setId(21L);
    }

    @Test
    void getId() {
        assertEquals(21L, product.getId());
    }

    @Test
    void shouldGetCorrectName() {
        assertEquals("Demo Product", product.getName());
    }

    @Test
    void shouldGetCorrectPrice() {
        assertEquals(500.0, product.getPrice());
    }

    @Test
    void shouldChangeId() {
        product.setId(33L);
        assertEquals(33L, product.getId());
    }

    @Test
    void shouldChangeName() {
        product.setName("New Product Name");
        assertEquals("New Product Name", product.getName());
    }

    @Test
    void shouldChangePrice() {
        product.setPrice(34.0);
        assertEquals(34.0, product.getPrice());
    }

    @Test
    void shouldReturnProperToStringPrintFormat() {
        Product product = new Product(1L, "Laptop", 1200.00);
        String expected = "Product{id=1, name='Laptop', price=1200.0}";

        assertEquals(expected, product.toString());
    }

    @Test
    void equalsShouldReturnTrueForIdenticalProducts() {
        Product p1 = new Product(1L, "Laptop", 1200.00);
        Product p2 = new Product(1L, "Laptop", 1200.00);

        assertTrue(p1.equals(p2));
    }

    @Test
    void equalsShouldReturnFalseForNonIdenticalProducts() {
        Product p1 = new Product(1L, "Laptop", 1200.00);
        Product p2 = new Product(2L, "Laptop", 1200.00);

        assertFalse(p1.equals(p2));
    }

    @Test
    void hashCodeShouldBeEqualForEqualObjects() {
        Product p1 = new Product(1L, "Laptop", 1200.00);
        Product p2 = new Product(1L, "Laptop", 1200.00);

        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    void hashCodeShouldNotBeEqualForNonEqualObjects() {
        Product p1 = new Product(1L, "Laptop", 1200.00);
        Product p2 = new Product(2L, "Laptop", 1200.00);

        assertNotEquals(p1.hashCode(), p2.hashCode());
    }
}