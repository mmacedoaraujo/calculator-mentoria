package model.calculators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {


    @Test
    void calculateBMI() {
        Locale.setDefault(Locale.US);
        BMICalculator bmiCalculator = new BMICalculator();
        Assertions.assertEquals("23.1", String.format("%.1f", bmiCalculator.calculateBMI(70.0, 1.74)));
    }
}