package model.mathoperations;

public class CircleOperation implements MathOperation{
    @Override
    public double execute(Double[] values) {
        return Math.PI * Math.pow(values[0], 2);
    }

    @Override
    public String getName() {
        return "Área do círculo";
    }
}
