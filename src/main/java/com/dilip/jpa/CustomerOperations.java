package com.dilip.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerOperations {

	@Autowired
	CustomerRepository repository;

	public void addCustomer(Customer c) {
		repository.save(c);
	}

}
