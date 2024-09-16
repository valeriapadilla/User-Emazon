package com.emazon.user.application.dto;

public class AuthenticationRequest {
    private String email;
    private String Password;

    public AuthenticationRequest(String password, String email) {
        Password = password;
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
