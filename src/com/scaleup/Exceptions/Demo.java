package com.scaleup.Exceptions;

/*
@author suchetrana
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("Scenario 1");
        calculatorService.divide(10, 2);
        calculatorService.divide(10, 0);
        System.out.println("Scenario 2");

    }
}
