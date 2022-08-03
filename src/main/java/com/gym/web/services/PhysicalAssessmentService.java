package com.gym.web.services;

import com.gym.web.entities.PhysicalAssessment;
import com.gym.web.entities.Student;
import com.gym.web.models.PhysicalAssessmentModel;
import com.gym.web.repositories.PhysicalAssessmentRepository;
import com.gym.web.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhysicalAssessmentService {
    @Autowired
    private PhysicalAssessmentRepository physicalAssessmentRepository;

    @Autowired
    StudentRepository studentRepository;

    public List<PhysicalAssessment> getAll() {
        return physicalAssessmentRepository.findAll();
    }

    public PhysicalAssessment create(PhysicalAssessmentModel physicalAssessmentModel) {
        Student student = studentRepository.findById(physicalAssessmentModel.getStudentId()).get();

        PhysicalAssessment physicalAssessment = new PhysicalAssessment();
        physicalAssessment.setStudent(student);
        physicalAssessment.setWeight(physicalAssessmentModel.getWeight());
        physicalAssessment.setHeight(physicalAssessmentModel.getHeight());

        return physicalAssessmentRepository.save(physicalAssessment);
    }
}
