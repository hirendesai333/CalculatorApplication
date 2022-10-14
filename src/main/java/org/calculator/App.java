package org.calculator;

import org.calculator.services.CalculatorService;

public class App {
    public static void main(String[] args) {
        new CalculatorService().initComponent();
    }
}