package com.emazon.user.application.dto;

import com.emazon.user.application.util.ConstantUser;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class UserRequest {
    @NotBlank(message = ConstantUser.MANDATORY_NAME_MESSAGE)
    private String Name;

    @NotBlank(message = ConstantUser.MANDATORY_LASTNAME_MESSAGE)
    private String lastName;

    @NotBlank(message = ConstantUser.MANDATORY_DOCUMENT_MESSAGE)
    @Pattern(regexp = ConstantUser.DOCUMENT_PATTERN, message = ConstantUser.INVALID_DOCUMENT_MESSAGE)
    private String Document;

    @NotBlank(message = ConstantUser.MANDATORY_PHONE_MESSAGE)
    @Size(max = ConstantUser.PHONE_MAX_SIZE, message = ConstantUser.PHONE_SIZE_MESSAGE)
    private String phoneNumber;

    @NotBlank(message = ConstantUser.MANDATORY_BIRTHDATE_MESSAGE)
    @Pattern(regexp = ConstantUser.BIRTHDATE_PATTERN, message = ConstantUser.INVALID_BIRTHDATE_MESSAGE)
    private LocalDate birthdate;

    @NotBlank(message = ConstantUser.MANDATORY_EMAIL_MESSAGE)
    @Email(message = ConstantUser.INVALID_EMAIL_MESSAGE)
    private String email;

    @NotBlank(message = ConstantUser.MANDATORY_PASSWORD_MESSAGE)
    @Size(min = ConstantUser.PASSWORD_MIN_SIZE, max = ConstantUser.PASSWORD_MAX_SIZE, message = ConstantUser.PASSWORD_SIZE_MESSAGE)
    private String password;

    public UserRequest(String name, String lastName, String document, String phoneNumber, LocalDate birthdate, String email, String password) {
        Name = name;
        this.lastName = lastName;
        Document = document;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.email = email;
        this.password = password;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_NAME_MESSAGE) String getName() {
        return Name;
    }

    public void setName(@NotBlank(message = ConstantUser.MANDATORY_NAME_MESSAGE) String name) {
        Name = name;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_LASTNAME_MESSAGE) String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = ConstantUser.MANDATORY_LASTNAME_MESSAGE) String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_DOCUMENT_MESSAGE) @Pattern(regexp = ConstantUser.DOCUMENT_PATTERN, message = ConstantUser.INVALID_DOCUMENT_MESSAGE) String getDocument() {
        return Document;
    }

    public void setDocument(@NotBlank(message = ConstantUser.MANDATORY_DOCUMENT_MESSAGE) @Pattern(regexp = ConstantUser.DOCUMENT_PATTERN, message = ConstantUser.INVALID_DOCUMENT_MESSAGE) String document) {
        Document = document;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_PHONE_MESSAGE) @Size(max = ConstantUser.PHONE_MAX_SIZE, message = ConstantUser.PHONE_SIZE_MESSAGE) String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotBlank(message = ConstantUser.MANDATORY_PHONE_MESSAGE) @Size(max = ConstantUser.PHONE_MAX_SIZE, message = ConstantUser.PHONE_SIZE_MESSAGE) String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_BIRTHDATE_MESSAGE) @Pattern(regexp = ConstantUser.BIRTHDATE_PATTERN, message = ConstantUser.INVALID_BIRTHDATE_MESSAGE) LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(@NotBlank(message = ConstantUser.MANDATORY_BIRTHDATE_MESSAGE) @Pattern(regexp = ConstantUser.BIRTHDATE_PATTERN, message = ConstantUser.INVALID_BIRTHDATE_MESSAGE) LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_EMAIL_MESSAGE) @Email(message = ConstantUser.INVALID_EMAIL_MESSAGE) String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = ConstantUser.MANDATORY_EMAIL_MESSAGE) @Email(message = ConstantUser.INVALID_EMAIL_MESSAGE) String email) {
        this.email = email;
    }

    public @NotBlank(message = ConstantUser.MANDATORY_PASSWORD_MESSAGE) @Size(min = ConstantUser.PASSWORD_MIN_SIZE, max = ConstantUser.PASSWORD_MAX_SIZE, message = ConstantUser.PASSWORD_SIZE_MESSAGE) String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = ConstantUser.MANDATORY_PASSWORD_MESSAGE) @Size(min = ConstantUser.PASSWORD_MIN_SIZE, max = ConstantUser.PASSWORD_MAX_SIZE, message = ConstantUser.PASSWORD_SIZE_MESSAGE) String password) {
        this.password = password;
    }
}
