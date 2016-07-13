package com.kewill.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyService serviceInstance = (MyService) context.getBean("myService");

		System.out.println(serviceInstance.getMyProperty());
	}
}