package com.example.ThymeleafDemo.Domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    private String name;
    private String email;
    private String phone;
    private int age;
}
