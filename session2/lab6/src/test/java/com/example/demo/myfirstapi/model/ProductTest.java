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
    void testEquals() {

    }

    @Test
    void testHashCode() {
    }
}