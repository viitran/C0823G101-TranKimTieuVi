package com.example.be.DTO;

import lombok.Data;

@Data
public class RequestDto {
    private Integer page;

    private Integer size;
    private String name;
}
