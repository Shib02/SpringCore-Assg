package com.java.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		
    Customer c=(Customer) context.getBean("customer");
		
	     System.out.println(c);

	}

}
