package com.sad.mindbloom.assessment.crud;

public class AssessmentUpdate {
    private Integer reviewingCounselorId;
    private String feedback;
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


}