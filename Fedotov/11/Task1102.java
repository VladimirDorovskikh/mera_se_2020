package com.mera.training.task1102;

public class Task1102 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.addOperation("sum", (a, b) -> a + b);
        calc.calculate("sum",2d,3d);

        calc.addOperation("diff", (a, b) -> a - b);
        calc.calculate("diff",2d,3d);

        calc.addOperation("mult", (a, b) -> a * b);
        calc.calculate("mult",2d,3d);

        calc.addOperation("div", (a, b) -> a / b);
        calc.calculate("div",2d,3d);

        calc.addOperation("power", (a, b) -> Math.pow(a, b));
        calc.calculate("power",2d,3d);

        calc.addOperation("root", (a, b) -> Math.pow(a, 1d / b));
        calc.calculate("root",2d,3d);
    }
}
