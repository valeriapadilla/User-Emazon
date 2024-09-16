package com.emazon.user.domain.Exception;

public class DocumentAlreadyExitsException extends RuntimeException {
    public DocumentAlreadyExitsException(String message) {
        super(message);
    }
}
