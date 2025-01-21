package com.sad.mindbloom.assessment.services;
import java.util.Optional;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.sad.mindbloom.assessment.model.Answer;
import com.sad.mindbloom.assessment.repositories.AnswerRepository;
import org.springframework.transaction.annotation.Transactional;
import com.sad.mindbloom.assessment.crud.AnswerRead;

@Component
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    public Optional<Answer> findById(final Integer id) {
        return id == null ? Optional.empty() : answerRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<AnswerRead> get(final Integer assessmentId) {
        return answerRepository.findByAssessmentId(assessmentId).map(AnswerRead::from).collect(Collectors.toList());
    }

    public Stream<Answer> list() {
        return answerRepository.findAll().stream();
    }

    public Optional<Answer> add(final Answer answer) {
        return Optional.of(answerRepository.save(answer));
    }

}