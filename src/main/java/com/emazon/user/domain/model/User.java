package com.emazon.user.domain.model;

import java.time.LocalDate;

public class User {
    private Long Id;
    private String Name;
    private String lastName;
    private String Document;
    private String phoneNumber;
    private LocalDate birthdate;
    private String email;
    private String password;
    private Long roleId;

    public User(Long id, String name, String lastName, String document, String phoneNumber, LocalDate birthdate, String email, String password, Long roleId) {
        Id = id;
        Name = name;
        this.lastName = lastName;
        Document = document;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.email = email;
        this.password = password;
        this.roleId = roleId;
    }

    public User(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
