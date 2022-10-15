package org.calculator.services;

import org.calculator.exception.DivideByZeroException;

import java.util.Scanner;

public class CalculatorService {
    //declare variables
    public double input1, input2;
    String operator;
    boolean exit = false;
    boolean number1operator = false;
    boolean number2operator = false;

    //scanner class to get input from user
    Scanner scanner = new Scanner(System.in);
    CalculatorOperations calculatorOperations = new CalculatorOperations();

    //method to show calculator operators
    public void showCalculatorOperators() {
        System.out.println("\n+: Addition\n-: Subtraction\n*: Multiplication\n/: Divide\nE: exit the app");
        System.out.print("Enter the operation: ");
    }

    //method to check whether given operator input indicates Exit or no
    public void exitCheck() {
        if (operator.equals("E") || operator.equals("e")) {
            System.out.println("Exiting the app");
            exit = true;
        } else System.out.println("Please try again. Something went wrong!!");
    }

    public void getInput2() {
        do {
            System.out.print("Enter Number: ");
            String str1 = scanner.next();
            try {
                System.out.print("Enter Number: ");
                input2 = Double.parseDouble(str1);
                number2operator = false;
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Valid Number");
                number2operator = true;
            }
        } while (number2operator);

    }

    //init method to perform all the tasks
    public void initComponent() {
        System.out.println("\nCalculator Application\n");
        do {
            System.out.print("Enter Number: ");
            String str = scanner.next();
            try {
                input1 = Double.parseDouble(str);
                number1operator = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input Please try again!!");
                number1operator = true;
            }
        } while (number1operator);
        do {
            showCalculatorOperators();
            operator = scanner.next();

            switch (operator) {
                case "+":
                    getInput2();
                    input1 = calculatorOperations.add(input1, input2);
                    System.out.println("Addition is: " + input1);
                    break;

                case "-":
                    getInput2();
                    input1 = calculatorOperations.sub(input1, input2);
                    System.out.println("Subtraction is: " + input1);
                    break;

                case "*":
                    getInput2();
                    input1 = calculatorOperations.mul(input1, input2);
                    System.out.println("Multiplication is: " + input1);
                    break;

                case "/":
                    try {
                        getInput2();
                        input1 = calculatorOperations.div(input1, input2);
                        if (String.valueOf(input1).equals("Infinity")) {
                            throw new DivideByZeroException();
                        }
                        System.out.println("Division is: " + input1);
                    } catch (DivideByZeroException ignored) {
                    }
                    break;

                default:
                    exitCheck();

            }
        } while (!exit);

    }
}
