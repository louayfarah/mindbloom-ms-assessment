package com.sad.mindbloom.assessment.crud;

import com.sad.mindbloom.assessment.model.Answer;
import com.sad.mindbloom.assessment.model.Assessment;
import com.sad.mindbloom.assessment.model.Question;

public class AnswerCreate {
    private String answerContent;
    private Integer questionNumber;
    private Integer assessmentId;

    public static Answer to(final AnswerCreate item, final Question question, final Assessment assessment) {
        final Answer res = new Answer();

        res.setAnswerContent(item.getAnswerContent());
        res.setQuestion(question);
        res.setAssessment(assessment);

        return res;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    
    

}
