package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5));
    }
}
