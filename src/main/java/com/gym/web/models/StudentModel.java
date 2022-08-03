package com.gym.web.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class StudentModel {

    private String name;

    private String cpf;

    private String neighborhood;

    private LocalDate dateOfBirth;
}
