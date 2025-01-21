package com.sad.mindbloom.assessment.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sad.mindbloom.assessment.model.Question;


public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Optional<Question> findByNumber(Integer number);
}