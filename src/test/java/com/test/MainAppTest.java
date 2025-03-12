package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.MainApp;

public class MainAppTest {
    MainApp map = null;

    @Before
    public void before() {
        map = new MainApp();
    }

    @After
    public void after() {
        map = null;
    }

    @Test
    public void testAdditionWithPositiveNumbers() {
        assertEquals(14, map.addition(8, 6));
    }

    @Test
    public void testMultiplicationWithPositiveNumbers() {
        assertEquals(48, map.multiply(8, 6));
    }
}
