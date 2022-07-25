package com.example1;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext customerDetails= new ClassPathXmlApplicationContext("customer.xml");
		Customer customer =(Customer)customerDetails.getBean("customer");
		Arrays.stream(customerDetails.getBeanDefinitionNames()).forEach(System.out::println);
		customer.getDetails();

	}

}
