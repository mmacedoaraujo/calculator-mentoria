package model.calculators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularCalculatorTest {

    @Test
    void getFirstNumber() {
        RegularCalculator calculator = new RegularCalculator(8.0, 5.0);
        Assertions.assertEquals(8.0, calculator.getFirstNumber());
    }

    @Test
    void setFirstNumber() {
        RegularCalculator calculator = new RegularCalculator(2.0, 2.0);
        calculator.setFirstNumber(12.0);
        Assertions.assertEquals(12.0, calculator.getFirstNumber());
    }

    @Test
    void getSecondNumber() {
        RegularCalculator calculator = new RegularCalculator(2.0, 5.0);
        Assertions.assertEquals(5.0, calculator.getSecondNumber());
    }

    @Test
    void setSecondNumber() {
        RegularCalculator calculator = new RegularCalculator(2.0, 2.0);
        calculator.setSecondNumber(4.0);
        Assertions.assertEquals(4.0, calculator.getSecondNumber());

    }

    @Test
    void sum() {
        RegularCalculator calculator = new RegularCalculator(2.0, 2.0);
        Assertions.assertEquals(4, calculator.sum(calculator));
    }

    @Test
    void subtraction() {
        RegularCalculator calculator = new RegularCalculator(2.0, 2.0);
        Assertions.assertEquals(0, calculator.subtraction(calculator));
    }

    @Test
    void division() {
        RegularCalculator calculator = new RegularCalculator(4.0, 2.0);
        Assertions.assertEquals(2, calculator.division(calculator));
    }

    @Test
    void multiply() {
        RegularCalculator calculator = new RegularCalculator(2.0, 2.0);
        Assertions.assertEquals(4, calculator.multiply(calculator));
    }

    @Test
    void power() {
        RegularCalculator calculator = new RegularCalculator(2.0, 2.0);
        Assertions.assertEquals(4, calculator.power(calculator));
    }
}