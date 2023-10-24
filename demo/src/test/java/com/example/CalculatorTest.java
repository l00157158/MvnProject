// CalculatorTest.java
package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(3, 2);

        assertEquals("The sum should be 5", 5, sum);
    }

    @Test
    public void testAddFailure() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);

        // This will fail because 2 + 2 is 4, not 5
        assertEquals("The sum should be 5", 5, sum);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int diff = calculator.substract(6,5);
        assertEquals("Diff should be 1", 1, diff);
          }
}
