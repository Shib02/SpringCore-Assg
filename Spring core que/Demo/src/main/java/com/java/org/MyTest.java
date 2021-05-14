package com.java.org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	Customer c1 = new Customer(1,"Groot","9874561230",new Addresses("Disney world","NA","France","600100","America"));
	
    @Test
	public void draw() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer c = (Customer) context.getBean("customer");
		assertEquals(c1.getCustID(), c.getCustID());
		assertEquals(c1.getCustName(), c.getCustName());
	}

}
