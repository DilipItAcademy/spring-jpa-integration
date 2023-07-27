package com.dilip.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.dilip.*");
		context.refresh();
		
		Customer c = new Customer();
		c.setId(5);
		c.setFirstName("Dilip");
		c.setEmail("dilip@gmail.com");
		c.setLastName("singh");
		
		CustomerOperations operations = context.getBean(CustomerOperations.class);
		operations.addCustomer(c);

	}
}
