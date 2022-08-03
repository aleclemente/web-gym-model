package com.gym.web.controllers;

import com.gym.web.entities.PhysicalAssessment;
import com.gym.web.entities.Student;
import com.gym.web.models.PhysicalAssessmentModel;
import com.gym.web.models.StudentModel;
import com.gym.web.services.PhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/physicalAssessments")
public class PhysicalAssessmentController {
    @Autowired
    PhysicalAssessmentService physicalAssessmentService;

    @GetMapping
    public List<PhysicalAssessment> getAll() {
        return physicalAssessmentService.getAll();
    }

    @PostMapping
    public PhysicalAssessment createPhysicalAssessment(@RequestBody PhysicalAssessmentModel physicalAssessmentModel){
        return physicalAssessmentService.create(physicalAssessmentModel);
    }


}
