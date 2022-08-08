package org.fdmgroup;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void thisisjustatest(){
        Basket basket = new Basket();

        ArrayList<Book> list = basket.getBookinBasket();

        assertEquals(0, list.size());
    }
}