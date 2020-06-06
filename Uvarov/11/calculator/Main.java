package mera.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addOperation("sum", (a, b) -> a + b);
        calculator.addOperation("subtract", (a, b) -> a - b);
        calculator.addOperation("multiply", (a, b) -> a * b);
        calculator.addOperation("divide", (a, b) -> a / b);
        calculator.addOperation("pow", (a, b) -> Math.pow(a, b));
        calculator.addOperation("sqrtN", (a, b) -> Math.pow(a, 1.0 / b));

        System.out.println(calculator.calculate("sum", 3d, 5d));
        System.out.println(calculator.calculate("subtract", 3d, 5d));
        System.out.println(calculator.calculate("multiply", 3d, 5d));
        System.out.println(calculator.calculate("divide", 30d, 5d));
        System.out.println(calculator.calculate("pow", 2d, 5d));
        System.out.println(calculator.calculate("sqrtN", 32d, 5d));

    }
}