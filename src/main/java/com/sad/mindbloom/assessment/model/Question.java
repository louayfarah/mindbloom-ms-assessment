package com.sad.mindbloom.assessment.model;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;



@Entity
@Table(name = "question")
@EqualsAndHashCode(callSuper = true)
public final class Question extends Base {
    
    @Column(name = "number")
    private Integer number;
    @Column(name = "question_content", length = 2000)
    private String question_content;

    
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getQuestionContent() {
        return question_content;
    }
    public void setQuestionContent(String question_content) {
        this.question_content = question_content;
    }

}