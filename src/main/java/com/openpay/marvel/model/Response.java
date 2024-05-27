package com.openpay.marvel.model;

import java.util.List;

public class Response<T> {
    private List<T> data;
    private String description;
    private int code;
    private String status;

    public Response(List<T> data, String description, int code, String status) {
        this.data = data;
        this.description = description;
        this.code = code;
        this.status = status;
    }

    // Getters and Setters
    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
