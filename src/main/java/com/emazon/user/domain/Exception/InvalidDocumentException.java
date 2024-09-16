package com.emazon.user.domain.Exception;

public class InvalidDocumentException extends RuntimeException {
    public InvalidDocumentException(String message) {
        super(message);
    }
}
