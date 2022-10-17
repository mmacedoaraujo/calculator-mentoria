package model.calculators;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Square;

public class AreaCalculator {


    public Double calculateSquareArea(Square square) {
        return Math.pow(square.getSquareSide(), 2);
    }

    public Double calculateCircleArea(Circle circle) {
        return Math.PI * (Math.pow(circle.getRadius(), 2));
    }

    public Double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }
}
