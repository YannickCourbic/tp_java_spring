package com.api_spring.model;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String lastname;
    private String firstname;
    private String email;
    private String phone;
}
