package com.mera.kalinina.lesson11.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String, Operation> operations = new HashMap<>();

    public Double calculate(String operationName, Double number1, Double number2) {
        return operations.get(operationName).doOperation(number1, number2);
    }

    public void calculateToString(String operationName, Double number1, Double number2) {
        System.out.println(operationName + "(" + number1 + ", " + number2 + ") = " +
                calculate(operationName, number1, number2));
    }

    void addOperation(String operationName, Operation implementation) {
        operations.put(operationName, implementation);
    }
}
