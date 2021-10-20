package com.example.authservice.exceptions;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials() {
        super();
    }

    public InvalidCredentials(String message) {
        super(message);
    }

    public InvalidCredentials(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCredentials(Throwable cause) {
        super(cause);
    }

    protected InvalidCredentials(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
