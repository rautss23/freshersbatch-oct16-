package com.example2;

import java.util.List;

public class Question1 {
	private int questionId;
	private String question;
	private List<String> answer;

	public Question1(int questionId, String question, List<String> answer) {
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

	public List<String> getAnswer() {
		return answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}

}
