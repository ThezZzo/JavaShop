package com.example.JavaShop.DTO;

import lombok.Data;

@Data
public class CompanyDto {
    private Long id;

    private String name;

    public CompanyDto (String name) {
        this.name = name;
    }
}
