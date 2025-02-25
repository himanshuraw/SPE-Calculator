package com.himanshu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ScientificCalculatorTest {
    ScientificCalculator calculator = new ScientificCalculator();

    @Test
    public void testSqrt() {
        assertEquals(4.0, calculator.sqrt(16.0), 0.001);
        assertEquals(3.0, calculator.sqrt(9.0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testNaturalLog(){
        assertEquals(0.0, calculator.naturalLog(1.0), 0.001);
        assertEquals(1.609, calculator.naturalLog(5.0), 0.001);
    }

    @Test
    public void testPower(){
        assertEquals(4.0, calculator.power(2, 2), 0.001);
        assertEquals(1.0, calculator.power(8, 0), 0.001);
    }
}
