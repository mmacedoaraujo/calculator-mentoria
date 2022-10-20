package model.mathoperations;

public class IMCOperation implements MathOperation {
    @Override
    public double execute(Double[] values) {
        return values[0] / Math.pow(values[1], 2);
    }

    @Override
    public String getName() {
        return "Cálculo IMC";
    }
}
