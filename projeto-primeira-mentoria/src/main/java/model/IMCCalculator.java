package model;

import model.mathoperations.IMCOperation;
import model.mathoperations.MathOperation;

import java.util.List;

import static utils.Utils.readValue;

public class IMCCalculator implements Calculator {

    private final String name = "IMC CALCULATOR";

    public final List<MathOperation> operations = List.of(new IMCOperation());

    @Override
    public Double calculate(Integer operationIndex) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(readValues());
        } catch (IndexOutOfBoundsException e) {
            throw new UnsupportedOperationException("Operação não suportada.");
        }
    }

    public Double[] readValues() {
        Double[] values = new Double[2];
        System.out.println("Digite o valor do peso: ");
        values[0] = readValue();
        System.out.println("Digite o valor da altura: ");
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
