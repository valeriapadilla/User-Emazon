package com.emazon.user.domain.util;

import com.emazon.user.domain.Exception.InvalidAgeException;
import com.emazon.user.domain.Exception.InvalidDocumentException;
import com.emazon.user.domain.Exception.InvalidEmailException;
import com.emazon.user.domain.Exception.InvalidPhoneNumberException;
import com.emazon.user.domain.model.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class UserVerification {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String PHONE_REGEX = "^\\+?[0-9]{1,13}$";
    private static final String DOCUMENT_REGEX = "^[0-9]+$";

    public static void verifyUser(User user) {
        verifyEmail(user.getEmail());
        verifyPhoneNumber(user.getPhoneNumber());
        verifyDocument(user.getDocument());
        verifyAge(user.getBirthdate());
    }

    public static void verifyEmail(String email) {
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new InvalidEmailException("Invalid email format");
        }
    }

    public static void verifyPhoneNumber(String phoneNumber) {
        if (!Pattern.matches(PHONE_REGEX, phoneNumber) && phoneNumber.length()>=13) {
            throw new InvalidPhoneNumberException("Invalid phone number format. Should be max 13 characters and can contain '+'.");
        }
    }

    private static void verifyDocument(String document) {
        if (!Pattern.matches(DOCUMENT_REGEX, document)) {
            throw new InvalidDocumentException("Document must contain only numeric characters.");
        }
    }

    private static void verifyAge(LocalDate birthdate) {
        if (birthdate == null) {
            throw new InvalidAgeException("Birthdate cannot be null");
        }

        int age = Period.between(birthdate, LocalDate.now()).getYears();
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old");
        }
    }
}
