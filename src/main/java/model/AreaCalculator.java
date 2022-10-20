package model;

import model.mathoperations.MathOperation;

import java.util.List;

import static utils.Utils.readValue;

public class AreaCalculator implements Calculator{

    private final String name = "CALCULADORA DE ÁREA";

    private final List<MathOperation> operations = List.of(new CircleOperation(),
            new RectangleOperation(),
            new SquareOperation());
    @Override
    public Double calculate(Integer operationIndex) {
        MathOperation operation = this.operations.get(operationIndex);
        operation.execute(readValues());
    }

    public Double[] readValues() {
        Double[] values = new Double[2];
        System.out.println("Please insert the first value: ");
        values[0] = readValue();
        System.out.println("Now insert the second value: ");
        values[1] = readValue();
        return values;
    }
}
