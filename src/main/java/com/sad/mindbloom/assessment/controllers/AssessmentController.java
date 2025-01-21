package com.sad.mindbloom.assessment.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sad.mindbloom.assessment.services.AssessmentService;
import com.sad.mindbloom.assessment.crud.AssessmentCreate;
import com.sad.mindbloom.assessment.crud.AssessmentRead;
import com.sad.mindbloom.assessment.crud.AssessmentUpdate;




class NotFound extends RuntimeException {
}


@RestController
@RequestMapping("/api/assessments")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AssessmentController {
    private final AssessmentService assessmentService;

    @Operation(summary = "View assessment by student id")
    @GetMapping("/{studentId}")
    AssessmentRead get(final @RequestParam Integer studentId) {
        return assessmentService.get(studentId)
                .map(item -> AssessmentRead.from(item)).orElseThrow(() -> new NotFound());
    }

    @Operation(summary = "Take a new assessment")
    @PostMapping
    AssessmentRead add(final @RequestBody @Validated AssessmentCreate newAssessment) {
        // Check that the student doesn't have an assessment already
        if (assessmentService.list()
                .anyMatch(item -> item.getStudentId().equals(newAssessment.getStudentId()))) {
            throw new IllegalArgumentException("Student already took the assessment");
        }

        // Return the new appointment
        return assessmentService.add(AssessmentCreate.to(newAssessment))
                .map(item -> AssessmentRead.from(item)).orElseThrow(() -> new NotFound());
    }

    @Operation(summary = "Update the feedback of an assessment")
    @PatchMapping("/{id}")
    AssessmentRead updateStatus(final @RequestParam Integer id, final @RequestBody @Validated AssessmentUpdate assessmentUpdate) {
        return assessmentService.updateAssessment(id, assessmentUpdate)
                .map(item -> AssessmentRead.from(item)).orElseThrow(() -> new NotFound());
    }

}
