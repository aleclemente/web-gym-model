package com.gym.web.models;

import com.gym.web.entities.PhysicalAssessment;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
public class StudentModel {

    private Long id;

    private String name;

    private String cpf;

    private String neighborhood;

    private LocalDate dateOfBirth;
}
