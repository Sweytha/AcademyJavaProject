package com.bptn.course.week4.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FactorialCalculatorTest {
    private FactorialCalculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void beforeEach() {
        calculator = new FactorialCalculator();
        System.out.println("Before each test");
    }

    @Test
    void factorialOf0Is1() {
        int result = calculator.factorial(0);
         assertEquals(1, result);
    }

    @Test
    void factorialOf5Is120() {
        int result = calculator.factorial(5);
         assertEquals(120, result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all tests");
    }
}
