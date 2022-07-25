package com.example2;

import java.util.List;
import java.util.Map;

public class Question3 {
	private int questionId;
	private String question;
	private Map<Integer,String> answer;
	public Question3(int questionId, String question, Map<Integer, String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public int getQuestionId() {
		return questionId;
	}
	public String getQuestion() {
		return question;
	}
	public Map<Integer, String> getAnswer() {
		return answer;
	}
	@Override
	public String toString() {
		return "Question3 [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}

}