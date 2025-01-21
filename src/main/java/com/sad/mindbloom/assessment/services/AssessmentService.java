package com.sad.mindbloom.assessment.services;
import java.util.Optional;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.sad.mindbloom.assessment.model.Assessment;
import com.sad.mindbloom.assessment.repositories.AssessmentRepository;
import com.sad.mindbloom.assessment.crud.AssessmentUpdate;




@Component
@RequiredArgsConstructor
public final class AssessmentService {
    private final AssessmentRepository assessmentRepository;

    public Optional<Assessment> findById(final Integer id) {
        return id == null ? Optional.empty() : assessmentRepository.findById(id);
    }

    public Optional<Assessment> get(final Integer studentId) {
        return assessmentRepository.findByStudentId(studentId);
    }

    public Stream<Assessment> list() {
        return assessmentRepository.findAll().stream();
    }

    public Optional<Assessment> add(final Assessment assessment) {
        return Optional.of(assessmentRepository.save(assessment));
    }

    public Optional<Assessment> updateAssessment(final Integer id, final AssessmentUpdate assessmentUpdate) {
        return assessmentRepository.findById(id)
            .map(appointment -> {
                if (assessmentUpdate.getFeedback() != null)
                    appointment.setFeedback(assessmentUpdate.getFeedback());
                if (assessmentUpdate.getReviewingCounselorId() != null)
                    appointment.setReviewingCounselorId(assessmentUpdate.getReviewingCounselorId());
                return assessmentRepository.save(appointment);
            });
        
    }
}