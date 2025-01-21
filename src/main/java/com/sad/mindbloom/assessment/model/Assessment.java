package com.sad.mindbloom.assessment.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "assessment")
@EqualsAndHashCode(callSuper = true)
public final class Assessment extends Base {
    
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "reviewing_counselor_id", nullable = true)
    private Integer reviewingCounselorId;
    @Column(name = "feedback", nullable = true)
    private String feedback;
    @Column(name = "date_time_taken", nullable = true)
    private LocalDateTime dateTimeTaken;


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