package com.fundemtals.practice.domain.exceptions;

public class InvalidValueException extends ApplicationException {
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
