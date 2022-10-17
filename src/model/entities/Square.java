package model.entities;

public class Square {

    private Double squareSide;

    public Square() {
    }

    public Square(Double squareSide) {
        this.squareSide = squareSide;
    }

    public Double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(Double squareSide) {
        this.squareSide = squareSide;
    }


    @Override
    public String toString() {
        return "Square{" +
                "squareSide=" + squareSide +
                '}';
    }
}
