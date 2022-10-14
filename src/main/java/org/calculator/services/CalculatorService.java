package org.calculator.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorService {
    //declare variables
    public double input1, input2;
    String operator;
    boolean exit = false;

    //scanner class to get input from user
    Scanner scanner = new Scanner(System.in);

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

    public void getInput1() {
        try {
            System.out.print("Enter Number: ");
            input1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input Please try again!!");
        }
    }

    public void getInput2() {
        System.out.print("Enter Number: ");
        input2 = scanner.nextInt();
    }

    //init method to perform all the tasks
    public void initComponent() {
        System.out.println("\nCalculator Application\n");

        try {
            System.out.print("Enter Number: ");
            input1 = scanner.nextInt();  

            do {
                showCalculatorOperators();
                operator = scanner.next();

                switch (operator) {
                    case "+":
                        getInput2();
                        input1 += input2;
                        System.out.println("Addition is: " + input1);
                        break;

                    case "-":
                        getInput2();
                        input1 -= input2;
                        System.out.println("Subtraction is: " + input1);
                        break;

                    case "*":
                        getInput2();
                        input1 *= input2;
                        System.out.println("Multiplication is: " + input1);
                        break;

                    case "/":
                        getInput2();
                        input1 /= input2;
                        System.out.println("Division is: " + input1);
                        break;

                    default:
                        exitCheck();

                }
            } while (!exit);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input Please try again!!");
        }

    }
}
