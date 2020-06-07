package com.katepopkova;

import java.util.ArrayList;

public class Calculator {
    private static final String SUM = "sum";
    private static final String MULTIPLICATION =  "multiplication";
    private static final String DIVISION = "division";
    private static final String SUBTRACTION = "subtraction";
    private static final String EXPONENTATION = "exponentation";
    private static final String ROOT = "root";
    private static final String OPERATION = "\" operation.";
    private static final String CALCULATOR_DOES_NOT_HAVE = "The calculator does not have \"";

    private ArrayList<String> operationList = new ArrayList();

    public Double calculate(String operationName, Double firstNumber, Double secondNumber) throws  IllegalOperationException{
        Double result = null;

            if(operationList.contains(operationName)) {
                switch (operationName) {
                    case SUM:
                        result = firstNumber + secondNumber;
                        break;
                    case MULTIPLICATION:
                        result = firstNumber * secondNumber;
                        break;
                    case DIVISION:
                        result = firstNumber / secondNumber;
                        break;
                    case SUBTRACTION:
                        result = firstNumber - secondNumber;
                        break;
                    case EXPONENTATION:
                        result = Math.pow(firstNumber, secondNumber);
                        break;
                    case ROOT:
                        result = Math.exp(Math.log(firstNumber) / secondNumber);
                        break;
                }
            }
            else {
                throw new IllegalOperationException(CALCULATOR_DOES_NOT_HAVE + operationName + OPERATION);
            }

        return result;
    }

    public void addOperation(String operationName, Operation implementation) {
        operationList.add(operationName);
    }
}