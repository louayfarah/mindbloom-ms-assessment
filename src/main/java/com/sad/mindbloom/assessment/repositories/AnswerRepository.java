package com.sad.mindbloom.assessment.repositories;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sad.mindbloom.assessment.model.Answer;


public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Stream<Answer> findByAssessmentId(Integer assessmentId);
}