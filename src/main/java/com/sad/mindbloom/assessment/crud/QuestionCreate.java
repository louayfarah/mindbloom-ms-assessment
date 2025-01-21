package com.sad.mindbloom.assessment.crud;

import com.sad.mindbloom.assessment.model.Question;

public class QuestionCreate {
    private Integer number;
    private String questionContent;

    public static Question to(final QuestionCreate item) {
        final Question res = new Question();

        res.setNumber(item.getNumber());
        res.setQuestionContent(item.getQuestionContent());
        

        return res;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    

}
