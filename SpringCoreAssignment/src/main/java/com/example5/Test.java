package com.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("example5.xml");
        Human humanBeing = (Human) context.getBean("Human");
        gender gender =humanBeing.getG();
        phone no=humanBeing.getP();
        System.out.println(gender);
        System.out.println(no);
        System.out.println(humanBeing);
	}

}
