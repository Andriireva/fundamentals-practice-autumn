package com.fundemtals.practice.domain.exceptions;

// Class that extends ant exception should have "Exception" word as postfix
// Best practice: Extend your custom exception from RuntimeException
public class CalculateDivideException extends ApplicationException {

    public CalculateDivideException() {
    }

    public CalculateDivideException(String message) {
        super(message);
    }
}
