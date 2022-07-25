package com.example5;

import org.springframework.stereotype.Component;

@Component
public class phone {
	long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "phone [number=" + number + "]";
	}
	

}
