package mera.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String,Operation> operations = new HashMap<>();

    public Double calculate(String operationName, Double number1, Double number2) {
        return operations.get(operationName).doOperation(number1, number2);
    }

    public void addOperation(String operationName, Operation implementation) {
        if(operations.keySet().contains(operationName)){
            throw new IllegalArgumentException("Operation already exists: " + operationName);
        }else {
            operations.put(operationName, implementation);
        }
    }

}