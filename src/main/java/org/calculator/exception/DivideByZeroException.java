package org.calculator.exception;

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        System.out.println("Can't divide by Zero. Try Another number");
    }

}
