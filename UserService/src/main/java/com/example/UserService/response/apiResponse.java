package com.example.UserService.response;

import lombok.Data;

@Data
public class apiResponse {
    private String message;
    private boolean status;
    public apiResponse(String string, boolean b) {
        // TODO Auto-generated constructor stub
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}

