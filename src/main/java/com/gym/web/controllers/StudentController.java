package com.gym.web.controllers;

import com.gym.web.entities.Student;
import com.gym.web.models.StudentModel;
import com.gym.web.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PostMapping
    public Student addStudent(@RequestBody StudentModel studentModel){
        return studentService.create(studentModel);
    }
}
