package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext test = new ClassPathXmlApplicationContext("qna.xml");
		Question1 que1 = (Question1) test.getBean("Question1");
		System.out.println(que1);
		Question2 que2 = (Question2) test.getBean("Question2");
		System.out.println(que2);
//		Question3 que3 = (Question3) test.getBean("Question3");
//		System.out.println(que3);
		
	}

}
