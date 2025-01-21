package com.sad.mindbloom.assessment.crud;

import com.sad.mindbloom.assessment.model.Answer;
import com.sad.mindbloom.assessment.model.Assessment;
import com.sad.mindbloom.assessment.model.Question;

public class AnswerRead {
    private Integer id;
    private String answerContent;
    private Assessment assessment;
    private Question question; 




    public static AnswerRead from(final Answer item) {
        final AnswerRead answer = new AnswerRead();
        answer.setId(item.getId());
        answer.setAnswerContent(item.getAnswerContent());
        answer.setAssessment(item.getAssessment());
        answer.setQuestion(item.getQuestion());

        return answer;
    }




    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
    }




    public String getAnswerContent() {
        return answerContent;
    }




    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }




    public Assessment getAssessment() {
        return assessment;
    }




    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }




    public Question getQuestion() {
        return question;
    }




    public void setQuestion(Question question) {
        this.question = question;
    }


}
