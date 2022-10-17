package model.calculators;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class AreaCalculatorTest {

    @Test
    void calculateSquareArea() {
        Square square = new Square(2.0);
        AreaCalculator areaCalculator = new AreaCalculator();
        Assertions.assertEquals(4.0, areaCalculator.calculateSquareArea(square));
    }

    @Test
    void calculateCircleArea() {
        Locale.setDefault(Locale.US);
        Circle circle = new Circle(3.0);
        AreaCalculator areaCalculator = new AreaCalculator();
        Assertions.assertEquals("28.27433", String.format("%.5f", areaCalculator.calculateCircleArea(circle)));
    }

    @Test
    void calculateRectangleArea() {
        Locale.setDefault(Locale.US);
        Rectangle rectangle = new Rectangle(3.5, 3.6);
        AreaCalculator areaCalculator = new AreaCalculator();
        Assertions.assertEquals("12.6", String.format("%.1f", areaCalculator.calculateRectangleArea(rectangle)));
    }
}