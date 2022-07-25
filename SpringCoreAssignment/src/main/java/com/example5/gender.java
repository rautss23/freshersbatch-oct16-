package com.example5;

import org.springframework.stereotype.Component;

@Component
public class gender {
	String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "gender [gender=" + gender + "]";
	}

}
