package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    @DisplayName("test addiction")
    void add() {

        assertEquals(8, Calculator.add(2, 6));
    }

    @Test
    @DisplayName("test subtraction")
    void subtract() {
        assertEquals(2, Calculator.subtract(6, 4));
    }

    @Test
    @DisplayName("test quotient")
    void divide() throws IllegalArgumentException {
        assertEquals(2, Calculator.divide(8, 4));
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(7, 0));
    }

    @Test
    @DisplayName("test product")
    void multiply() {
        assertEquals(30, Calculator.multiply(10, 3));
    }
}