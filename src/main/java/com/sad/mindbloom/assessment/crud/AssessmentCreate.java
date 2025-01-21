package com.sad.mindbloom.assessment.crud;

import java.time.LocalDateTime;

import com.sad.mindbloom.assessment.model.Assessment;

public class AssessmentCreate {
    private Integer studentId;
    private Integer reviewingCounselorId;
    private String feedback;
    private LocalDateTime dateTimeTaken;

    public static Assessment to(final AssessmentCreate item) {
        final Assessment res = new Assessment();

        res.setStudentId(item.getStudentId());
        res.setReviewingCounselorId(item.getReviewingCounselorId());
        res.setFeedback(item.getFeedback());
        res.setDateTimeTaken(item.getDateTimeTaken());
        

        return res;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getReviewingCounselorId() {
        return reviewingCounselorId;
    }

    public void setReviewingCounselorId(Integer reviewingCounselorId) {
        this.reviewingCounselorId = reviewingCounselorId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public LocalDateTime getDateTimeTaken() {
        return dateTimeTaken;
    }

    public void setDateTimeTaken(LocalDateTime dateTimeTaken) {
        this.dateTimeTaken = dateTimeTaken;
    }
    


    

}
