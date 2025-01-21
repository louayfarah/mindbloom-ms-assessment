package com.sad.mindbloom.assessment.crud;

import com.sad.mindbloom.assessment.model.Question;

public class QuestionRead {
    private Integer id;
    private Integer number;
    private String questionContent;




    public static QuestionRead from(final Question item) {
        final QuestionRead question = new QuestionRead();
        question.setId(item.getId());
        question.setNumber(item.getNumber());
        question.setQuestionContent(item.getQuestionContent());

        return question;
    }




    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
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
