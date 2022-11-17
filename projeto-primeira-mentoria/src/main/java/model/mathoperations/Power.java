package model.mathoperations;

public class Power implements MathOperation{
    @Override
    public double execute(Double[] values) {
        return Math.pow(values[0], values[1]);
    }

    @Override
    public String getName() {
        return "Power";
    }
}
