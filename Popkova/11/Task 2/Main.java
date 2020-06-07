package com.katepopkova;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final String SUM_VALUE = "sum";
    private static final String MULTIPLICATION_VALUE = "multiplication";
    private static final String DIVISION_VALUE = "division";
    private static final String SUBTRACTION_VALUE = "subtraction";
    private static final String EXPONENTATION_VALUE = "exponentation";
    private static final String ROOT_VALUE = "root";
    private static final String SOME_OPERATION_VALUE = "some operation";
    private static final String SUM_STRING = "Sum = ";
    private static final String MULTIPLICATION_STRING = "Multiplication = ";
    private static final String QOTIENT_STRING = "Qotient = ";
    private static final String DIFFERENCE_STRING = "Difference = ";
    private static final String EXPONENTATION_STRING = "Exponentation = ";
    private static final String ROOT_STRING= "Root = ";
    private static final String SOME_OPERATION_STRING = "Some operation = ";
    private static final String ENTER_FIRST_NUMBER = "Enter the first number: ";
    private static final String ENTER_SECOND_NUMBER = "Enter the second number: ";
    private static final String NOT_DIGIT_ARGUMENGTS = "Provided arguments are not digits.";

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(ENTER_FIRST_NUMBER);
            Double firstNum = scanner.nextDouble();
            System.out.println(ENTER_SECOND_NUMBER);
            Double secondNum = scanner.nextDouble();

            calculator.addOperation(SUM_VALUE, (firstNumber, secondNumber) -> firstNumber + secondNumber);
            System.out.println(SUM_STRING + calculator.calculate(SUM_VALUE, firstNum, secondNum));

            calculator.addOperation(MULTIPLICATION_VALUE, (firstNumber, secondNumber) -> firstNumber * secondNumber);
            System.out.println(MULTIPLICATION_STRING + calculator.calculate(MULTIPLICATION_VALUE, firstNum, secondNum));

            calculator.addOperation(DIVISION_VALUE, (firstNumber, secondNumber) -> firstNumber / secondNumber);
            System.out.println(QOTIENT_STRING + calculator.calculate(DIVISION_VALUE, firstNum, secondNum));

            calculator.addOperation(SUBTRACTION_VALUE, (firstNumber, secondNumber) -> firstNumber - secondNumber);
            System.out.println(DIFFERENCE_STRING + calculator.calculate(SUBTRACTION_VALUE, firstNum, secondNum));

            calculator.addOperation(EXPONENTATION_VALUE, (firstNumber, secondNumber) -> Math.pow(firstNumber, secondNumber));
            System.out.println(EXPONENTATION_STRING + calculator.calculate(EXPONENTATION_VALUE, firstNum, secondNum));

            calculator.addOperation(ROOT_VALUE, (firstNumber, secondNumber) -> Math.exp(Math.log(firstNumber) / secondNumber));
            System.out.println(ROOT_STRING + calculator.calculate(ROOT_VALUE, firstNum, secondNum));

            System.out.println(SOME_OPERATION_STRING + calculator.calculate(SOME_OPERATION_VALUE, firstNum, secondNum));
        }
        catch(IllegalOperationException | InputMismatchException ex) {
            if(ex instanceof IllegalOperationException) {
                System.out.println(ex.getMessage());
            }
            else {
                System.out.println(NOT_DIGIT_ARGUMENGTS);
            }
        }
    }
}