package model.calculators;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Square;

public class AreaCalculator extends RegularCalculator {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;


    public Double calculateSquareArea() {
        return Math.pow(square.getSquareSide(), 2);
    }

    public Double calculateCircleArea() {
        return Math.PI * (Math.pow(circle.getRadius(), 2));
    }

    public Double calculateRectangleArea() {
        return rectangle.getHeight() * rectangle.getWidth();
    }
}
