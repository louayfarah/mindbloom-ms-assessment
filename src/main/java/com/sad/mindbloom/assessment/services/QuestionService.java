package com.sad.mindbloom.assessment.services;
import java.util.Optional;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.sad.mindbloom.assessment.model.Question;
import com.sad.mindbloom.assessment.repositories.QuestionRepository;


@Component
@RequiredArgsConstructor
public final class QuestionService {
    private final QuestionRepository questionRepository;

    public Optional<Question> findById(final Integer id) {
        return id == null ? Optional.empty() : questionRepository.findById(id);
    }

    public Optional<Question> get(final Integer number) {
        return questionRepository.findByNumber(number);
    }

    public Stream<Question> list() {
        return questionRepository.findAll().stream();
    }

    public Optional<Question> add(final Question question) {
        return Optional.of(questionRepository.save(question));
    }

}