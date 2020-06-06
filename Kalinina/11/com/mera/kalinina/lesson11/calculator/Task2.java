package com.mera.kalinina.lesson11.calculator;

/*
Задание 2.Расширяемый калькулятор
Создать класс Calculator, который может выполнять операции на двумя числами.
определить метод calculate(String operationName, Double number1, Double number2);

Операции могут быть разными и хранятся внутри калькулятора.

Определите интерфейс
interface Operation {
       Double doOperation(Double number1, Double number2) throw ArithmeticException;
}

в классе калькудятор создайте метод, который добавляет новыую операцию в калькулятор:
void addOperation(String operationName, Operation implementation);

Добавьте в калькулятор операции:
Умножение
Деление
Сложение
Вычитание
Возведение в степень
Извлечение корня степени n

Для опредления тела операции используйте лямбда выражения
Например:
Calculator calc = new Calculator();
calc.add("sum", (a,b) -> a+b);
calc.calculate("sum",2,3);// выводит 5

 */

public class Task2 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.addOperation("sum", (a,b) -> a+b);
        calc.addOperation("diff", (a,b) -> a-b);
        calc.addOperation("mult", (a,b) -> a*b);
        calc.addOperation("div", (a,b) -> a/b);
        calc.addOperation("power", (a,n) -> Math.pow(a,n));
        calc.addOperation("root", (a,n) -> Math.pow(a,1.0/n));


        calc.calculateToString("sum",2.0,3.0);
        calc.calculateToString("diff",5.0,3.0);
        calc.calculateToString("mult",2.0,3.0);
        calc.calculateToString("div",4.0,2.0);
        calc.calculateToString("power",2.0,3.0);
        calc.calculateToString("root",8.0,3.0);
    }
}
