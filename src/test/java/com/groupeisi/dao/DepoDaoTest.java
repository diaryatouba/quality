package com.groupeisi.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepoDaoTest {

    private DepoDao depoDao;
    @BeforeEach
    void setUp() {
        depoDao = new DepoDao();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void message() {
        assertEquals("Hello", depoDao.message());
    }
}