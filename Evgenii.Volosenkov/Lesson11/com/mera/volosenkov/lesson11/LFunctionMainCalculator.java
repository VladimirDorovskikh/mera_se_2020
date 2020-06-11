package com.mera.volosenkov.lesson11;

import com.mera.volosenkov.lesson11.Calculator.Calculator;

public class LFunctionMainCalculator {
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.addOperations("Add", (v1, v2) ->v1+v2);
        calc.addOperations("Mul", (v1, v2) ->v1*v2);
        calc.addOperations("Div", (v1, v2) ->v1/v2);
        calc.addOperations("Sub", (v1, v2) ->v1-v2);
        calc.addOperations("Sub", (v1, v2) ->v1-v2);
        calc.addOperations("Pow", (v1, v2) ->Math.pow(v1, v2));
        calc.addOperations("Sqr", (v1, v2) ->Math.pow(v1, 1./v2));
        System.out.println(calc.calculate("Pow", 4., 2.));
    }
}
