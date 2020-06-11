package com.mera.training.dorovskikh.lambda;

import java.util.HashMap;

import static java.lang.StrictMath.pow;

/**
 * Создать класс Calculator, который может выполнять операции на двумя числами.
 * определить метод calculate(String operationName, Double number1, Double number2);
 *
 * Операции могут быть разными и хранятся внутри калькулятора.
 *
 * Определите интерфейс
 * interface Operation {
 *        Double doOperation(Double number1, Double number2) throw ArithmeticException;
 *  }
 *
 *  в классе калькудятор создайте метод, который добавляет новыую операцию в калькулятор:
 *  void addOperation(String operationName, Operation implementation);
 *
 *  Добавьте в калькулятор операции:
 *  Умножение
 *  Деление
 *  Сложение
 *  Вычитание
 *  Возведение в степень
 *  Извлечение корня степени n
 *
 *  Для опредления тела операции используйте лямбда выражения
 *  Например:
 *  Calculator calc = new Calculator();
 *  calc.add("sum", (a,b) -> a+b);
 *  calc.calculate("sum",2,3);// выводит 5
 */
public class Calculator {

    private HashMap<String, Operation> operations;

    public Calculator() {
        operations = new HashMap<>();
    }

    public static void main(String ... args) {
        Calculator calc = new Calculator();
        calc.addOperation("sum", (a,b) -> a+b);
        calc.calculate("sum",2.0,3.0);// выводит 5
        calc.addOperation("mul", (a,b) -> a*b);
        calc.calculate("mul",2.0,3.0);// выводит 6
        calc.addOperation("div", (a,b) -> a/b);
        calc.calculate("div",12.0,3.0);// выводит 4
        calc.addOperation("dif", (a,b) -> a-b);
        calc.calculate("dif",12.0,3.0);// выводит 9
        calc.addOperation("pow", (a,b) -> pow(a,b));
        calc.calculate("pow",2.0,10.0);// выводит 1024
        calc.addOperation("degreeRoot", (a,b) -> pow(a, 1/b));
        calc.calculate("degreeRoot",8.0,3.0);// выводит 2
    }

    public void addOperation(String operationName, Operation implementation)
    {
        operations.put(operationName, implementation);
    }

    public void calculate(String operationName, Double number1, Double number2)
    {
        System.out.println(operations.get(operationName).doOperation(number1, number2));
    }
}

