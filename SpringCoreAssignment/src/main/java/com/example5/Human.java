package com.example5;

import org.springframework.beans.factory.annotation.Required;

public class Human {
	String name;
	
	phone p;
	
	@Resource
	gender g;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public phone getP() {
		return p;
	}

	@Required
	public void setP(phone p) {
		this.p = p;
	}

	public gender getG() {
		return g;
	}

	public void setG(gender g) {
		this.g = g;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", p=" + p + ", g=" + g + "]";
	}
}
