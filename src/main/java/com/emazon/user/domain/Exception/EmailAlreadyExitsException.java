package com.emazon.user.domain.Exception;

public class EmailAlreadyExitsException extends RuntimeException {
    public EmailAlreadyExitsException(String message) {
        super(message);
    }
}
