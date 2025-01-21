package com.sad.mindbloom.assessment.crud;

import java.time.LocalDateTime;

import com.sad.mindbloom.assessment.model.Assessment;

public class AssessmentRead {
    private Integer id;
    private Integer studentId;
    private Integer reviewingCounselorId;
    private String feedback;
    private LocalDateTime dateTimeTaken;




    public static AssessmentRead from(final Assessment item) {
        final AssessmentRead assessment = new AssessmentRead();
        assessment.setId(item.getId());
        assessment.setStudentId(item.getStudentId());
        assessment.setReviewingCounselorId(item.getReviewingCounselorId());
        assessment.setFeedback(item.getFeedback());

        return assessment;
    }




    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
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
