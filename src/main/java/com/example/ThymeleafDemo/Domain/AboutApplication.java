package com.example.ThymeleafDemo.Domain;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AboutApplication {

    @Value("${app.title}")
    private String title;

    @Value("${app.description}")
    private String description;

    @Value("${app.version}")
    private float version;

    @Value("${app.author}")
    private String author;

    @Value("${app.contact.email}")
    private String email;

    @Value("${app.contact.phone}")
    private String phone;

}
