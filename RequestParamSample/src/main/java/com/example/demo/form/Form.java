package com.example.demo.form;

import java.time.LocalDate;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Data
public class Form {
    private String name;
    private Integer age;
        @DateTimeFormat(iso = ISO.DATE)
    private LocalDate birth;
}
