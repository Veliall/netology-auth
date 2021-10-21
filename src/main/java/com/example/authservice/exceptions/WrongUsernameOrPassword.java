package com.example.authservice.exceptions;

public class WrongUsernameOrPassword extends RuntimeException {
    public WrongUsernameOrPassword() {
        super();
    }

    public WrongUsernameOrPassword(String message) {
        super(message);
    }

    public WrongUsernameOrPassword(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongUsernameOrPassword(Throwable cause) {
        super(cause);
    }

    protected WrongUsernameOrPassword(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
