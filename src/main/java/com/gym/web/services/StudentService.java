package com.gym.web.services;

import com.gym.web.entities.PhysicalAssessment;
import com.gym.web.entities.Student;
import com.gym.web.models.StudentModel;
import com.gym.web.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student create(StudentModel studentModel) {
        Student student = new Student();
        student.setName(studentModel.getName());
        student.setCpf(studentModel.getCpf());
        student.setDateOfBirth(studentModel.getDateOfBirth());
        student.setNeighborhood(studentModel.getNeighborhood());

        return studentRepository.save(student);
    }

    public List<PhysicalAssessment> getAllStudentPhysicalAssessment(Long studentId) {
        Student student = studentRepository.findById(studentId).get();

        return student.getPhysicalAssessments();
    }

}
