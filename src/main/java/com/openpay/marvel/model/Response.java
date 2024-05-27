package com.openpay.marvel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Response<T> {
    private List<T> data;
    private String description;
    private int code;
    private String status;

}
