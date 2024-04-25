package com.example.UserService.request;

public class ChangePasswordRequest {
    private String email;
    private String currentPassword;
    private String newPassword;
    public String getCurrentPassword() {
        return currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }
    public String getEmail() {
        return email;
    }




    // Getters and setters
}
