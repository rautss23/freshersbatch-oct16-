package com.example2;

import java.util.Set;

public class Question2 {
	private int questionId;
	private String question;
	private Set<String> answer;
	
	public Question2(int questionId, String question, Set<String> answer) {
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
	public Set<String> getAnswer() {
		return answer;
	}
	@Override
	public String toString() {
		return "Question2 [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
}
