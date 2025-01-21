package com.sad.mindbloom.assessment.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

import java.util.stream.Stream;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sad.mindbloom.assessment.services.QuestionService;
import com.sad.mindbloom.assessment.crud.QuestionCreate;
import com.sad.mindbloom.assessment.crud.QuestionRead;



@RestController
@RequestMapping("/api/questions")
@CrossOrigin("*")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;


    @Operation(summary = "List all questions")
    @GetMapping
    Stream<QuestionRead> list() {
        return questionService.list().map(item -> QuestionRead.from(item));
    }
    
    @Operation(summary = "View question by number")
    @GetMapping("/{number}")
    QuestionRead get(final @RequestParam Integer number) {
        return questionService.get(number)
                .map(item -> QuestionRead.from(item)).orElseThrow(() -> new NotFound());
    }

    @Operation(summary = "Add a question")
    @PostMapping
    QuestionRead add(final @RequestBody @Validated QuestionCreate newQuestion) {
        return questionService.add(QuestionCreate.to(newQuestion))
                .map(item -> QuestionRead.from(item)).orElseThrow(() -> new NotFound());
    }

    

}
