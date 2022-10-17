package model.calculators;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Square;

public class AreaCalculator {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;


    public Double calculateSquareArea(Double squareSide) {
        return Math.pow(squareSide, 2);
    }

    public Double calculateCircleArea(double firstNumber) {
        return Math.PI * (Math.pow(firstNumber, 2));
    }

    public Double calculateRectangleArea(Double height, Double width) {
        return height * width;
    }
}
