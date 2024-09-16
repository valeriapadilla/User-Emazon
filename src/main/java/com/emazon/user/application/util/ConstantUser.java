package com.emazon.user.application.util;

public class ConstantUser {
    private ConstantUser() {
        throw new IllegalStateException("Utility class");
    }
    public static final String DOCUMENT_PATTERN = "^[0-9]+$";
    public static final String PHONE_PATTERN = "^\\+?[0-9]{1,13}$";
    public static final String BIRTHDATE_PATTERN = "\\d{1,2}/\\d{1,2}/\\d{2,4}";

    public static final String MANDATORY_NAME_MESSAGE = "Name is mandatory";
    public static final String MANDATORY_LASTNAME_MESSAGE = "Last name is mandatory";
    public static final String MANDATORY_DOCUMENT_MESSAGE = "Document is mandatory";
    public static final String INVALID_DOCUMENT_MESSAGE = "The document must only contain numbers";
    public static final String MANDATORY_PHONE_MESSAGE = "Phone number is mandatory";
    public static final String PHONE_SIZE_MESSAGE = "Phone number should have less than 13 characters including the '+'";
    public static final String MANDATORY_BIRTHDATE_MESSAGE = "Birth date is mandatory";
    public static final String INVALID_BIRTHDATE_MESSAGE = "Birth date must have this format dd/MM/yyyy (dd, MM could be d/M number and yyyy could be yy)";
    public static final String MANDATORY_EMAIL_MESSAGE = "Email is mandatory";
    public static final String INVALID_EMAIL_MESSAGE = "The email must be valid";
    public static final String MANDATORY_PASSWORD_MESSAGE = "Password is mandatory";
    public static final String PASSWORD_SIZE_MESSAGE = "Password should be between 8 and 16 characters";

    public static final int PHONE_MAX_SIZE = 13;
    public static final int PASSWORD_MIN_SIZE = 8;
    public static final int PASSWORD_MAX_SIZE = 16;
}
