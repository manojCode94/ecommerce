package com.kumarmanoj.ecommerce.dto.userDTO;

public class ResponseDTO {
    private boolean status;
    private String message;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseDTO(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
