package com.mmacedoaraujo.service.exceptions;

public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -4297606094419767619L;

    public UserNotFoundException(String message) {
        super(message);
    }
}
