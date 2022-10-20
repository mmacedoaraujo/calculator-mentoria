package model;

import model.mathoperations.CircleOperation;
import model.mathoperations.MathOperation;
import model.mathoperations.RectangleOperation;
import model.mathoperations.SquareOperation;

import java.util.List;

import static utils.Utils.readValue;

public class AreaCalculator implements Calculator {

    private final String name = "CALCULADORA DE ÁREA";

    private final List<MathOperation> operations = List.of(new CircleOperation(),
            new RectangleOperation(),
            new SquareOperation());

    @Override
    public Double calculate(Integer operationIndex) {
        try {
            MathOperation operation = this.operations.get(operationIndex);
            return operation.execute(readValues(operationIndex));
        } catch (IndexOutOfBoundsException e) {
            throw new UnsupportedOperationException("Operação não suportada.");
        }

    }

    public Double[] readValues(Integer operationIndex) {
        Double[] values = new Double[2];
        if (operationIndex == 0) {
            System.out.println("Por favor insira o valor do raio: ");
            values[0] = readValue();
        } else {
            System.out.println("Please insert the first value: ");
            values[0] = readValue();
            System.out.println("Now insert the second value: ");
            values[1] = readValue();
        }
        return values;
    }
}