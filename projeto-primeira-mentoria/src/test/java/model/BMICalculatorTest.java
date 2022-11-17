package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class BMICalculatorTest {


    @Test
    void calculateBMI() {
        Locale.setDefault(Locale.US);
        IMCCalculator bmiCalculator = new IMCCalculator();
        Assertions.assertEquals("23.1", String.format("%.1f", bmiCalculator.calculateBMI(70.0, 1.74)));
    }
}