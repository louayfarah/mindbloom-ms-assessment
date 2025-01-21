package com.sad.mindbloom.assessment.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sad.mindbloom.assessment.model.Assessment;


public interface AssessmentRepository extends JpaRepository<Assessment, Integer> {
    Optional<Assessment> findByStudentId(Integer studentId);
}