package com.sad.mindbloom.assessment.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sad.mindbloom.assessment.services.AnswerService;
import com.sad.mindbloom.assessment.services.QuestionService;
import com.sad.mindbloom.assessment.services.AssessmentService;
import com.sad.mindbloom.assessment.crud.AnswerCreate;
import com.sad.mindbloom.assessment.crud.AnswerRead;
import com.sad.mindbloom.assessment.model.Question;
import com.sad.mindbloom.assessment.model.Assessment;


@RestController
@RequestMapping("/api/answers")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;
    private final AssessmentService assessmentService;


    
    @Operation(summary = "List all answers for a given assessment id")
    @GetMapping("/{assessmentId}")
    List<AnswerRead> list(final @RequestParam Integer assessmentId) {
        return answerService.get(assessmentId);
    }

    @Operation(summary = "Create a new answer")
    @PostMapping
    AnswerRead create(final @RequestBody @Validated AnswerCreate answer) {
        return answerService.add(AnswerCreate.to(answer, questionFromNumber(answer.getQuestionNumber()), assessment(answer.getAssessmentId()))).map(item -> AnswerRead.from(item)).orElseThrow(() -> new NotFound());
    }

    private Question questionFromNumber(final Integer questionNumber) {
        return questionService.get(questionNumber).orElseThrow(() -> new NotFound());
    }

    private Assessment assessment(final Integer assessmentId) {
        return assessmentService.get(assessmentId).orElseThrow(() -> new NotFound());
    }
}
