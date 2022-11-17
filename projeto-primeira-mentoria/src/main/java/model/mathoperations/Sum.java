package model.mathoperations;

public class Sum implements MathOperation {
    @Override
    public double execute(Double[] values) {
        return values[0] + values[1];
    }

    @Override
    public String getName() {
        return "Sum";
    }
}
