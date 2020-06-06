package com.mera.training.task1102;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String, Operation> operations = new HashMap<>();

    public void calculate(String operationName, Double number1, Double number2) {
        System.out.println(operationName + "(" + number1 + ", " + number2 + ") = " +
            operations.get(operationName).doOperation(number1, number2));
    }

    void addOperation(String operationName, Operation implementation) {
        operations.put(operationName, implementation);
    }
}
