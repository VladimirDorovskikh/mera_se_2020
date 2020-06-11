package com.mera.volosenkov.lesson11.Calculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, IOperation> operations = new HashMap<>();
    public void addOperations(String nameOperation, IOperation implementation)
    {
        if(implementation==null)
        {
            System.out.println("Incorrect operation.");
        }
        if(operations.containsKey(nameOperation))
        {
            System.out.println("Cannot add operation "+ nameOperation+". Such an operation already exists.");
            return;
        }
        operations.put(nameOperation,implementation);
    }
    public Double calculate(String nameOperation, Double val1, Double val2)
    {
        if(!operations.containsKey(nameOperation))
        {
            System.out.println("Incorrect name operation \" "+ nameOperation+"\"");
            return 0.0;
        }
        return operations.get(nameOperation).calculate(val1, val2);
    }
}
