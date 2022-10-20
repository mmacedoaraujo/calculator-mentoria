package model;

import model.mathoperations.MathOperation;

import java.util.List;

public interface Calculator {

    Double calculate(Integer operationIndex);

    List<MathOperation> getOperations();

    String getName();
}
