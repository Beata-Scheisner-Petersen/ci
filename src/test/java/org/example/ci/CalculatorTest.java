package org.example.ci;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
        var calc = new Calculator();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }
}
