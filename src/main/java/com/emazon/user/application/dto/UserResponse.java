package com.emazon.user.application.dto;
import java.time.LocalDate;

public class UserResponse {
    private String Name;
    private String lastName;
    private String Document;
    private String phoneNumber;
    private LocalDate birthdate;
    private String email;

    public UserResponse(String email, LocalDate birthdate, String phoneNumber, String document, String lastName, String name) {
        this.email = email;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        Document = document;
        this.lastName = lastName;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
