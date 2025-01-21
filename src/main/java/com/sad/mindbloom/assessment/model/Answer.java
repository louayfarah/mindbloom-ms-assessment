package com.sad.mindbloom.assessment.model;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;



@Entity
@Table(name = "answer")
@EqualsAndHashCode(callSuper = true)
public final class Answer extends Base {
    
    @Column(name = "answer_content")
    private String answerContent;

    @ManyToOne
    @JoinColumn(name = "assessment_id", nullable = true)
    private Assessment assessment;
    
    @ManyToOne
    @JoinColumn(name = "question_id", nullable = true)
    private Question question;


    public String getAnswerContent() {
        return answerContent;
    }
    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }
    public Question getQuestion() {
        return question;
    }
    public void setQuestion(Question question) {
        this.question = question;
    }

    public Assessment getAssessment() {
        return assessment;
    }
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

}