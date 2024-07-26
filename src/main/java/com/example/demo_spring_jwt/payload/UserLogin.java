package com.example.demo_spring_jwt.payload;

public class UserLogin {
    private String userId;
    private String password;

    public UserLogin() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}