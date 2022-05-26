package com.ramesh.server.main.user;

public class GenericRestResponse {
    private int status;
    private String message;
    private Object data;

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "GenericRestResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
