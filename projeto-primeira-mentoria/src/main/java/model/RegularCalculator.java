package model;

import model.mathoperations.*;

import java.util.List;

import static utils.Utils.readValue;

public class RegularCalculator implements Calculator {

    private final String name = "Standard Calculator";
    private final List<MathOperation> operations = List.of(new Sum(),
            new Subtract(),
            new Multiply(),
            new Divide(),
            new Power());

    @Override
    public Double calculate(Integer operationIndex) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(readValues());
        } catch (IndexOutOfBoundsException e) {
            throw new UnsupportedOperationException("Unsupported operation");
        }
    }

    public Double[] readValues() {
        Double[] values = new Double[2];
        System.out.println("Insira o primeiro valor: ");
        values[0] = readValue();
        System.out.println("Insira o segundo valor: ");
        values[1] = readValue();
        return values;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<MathOperation> getOperations() {
        return operations;
    }
}
