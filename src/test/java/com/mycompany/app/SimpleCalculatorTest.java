package com.mycompany.app;
//archivo con el chmod -w SimpleCalculatorTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result, "2 + 2 should equal 4, but got " + result);
    }

    @Test
    public void threePlusSevenShouldEqualTen() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(3, 7);
        assertEquals(10, result, "3 + 7 should equal 10, but got " + result);
    }
}
