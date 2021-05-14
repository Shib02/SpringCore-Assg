package com.java.collectionspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/java/collections/bean.xml");
		
		Questions q=(Questions) context.getBean("questions");
		
		System.out.println(q);

	}

}
