package com.krishna.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.krishna.customer.dal.entities.Customer;
import com.krishna.customer.dal.repos.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
class CustomerdalApplicationTests {
	
	@Autowired
	CustomerRepository crepo;

	@Test
	void createCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Krishna P");
		customer.setEmail("krishna.parampalli@gmail.com");
		crepo.save(customer);
		
	}
	
	@Test
	void findCustomerByID() {
		Customer customer = crepo.findById(1l).get();
		System.out.println(customer);
		
	}
	
	@Test
	void updateCustomer() {
		Customer customer = crepo.findById(1l).get();
		customer.setEmail("kmogaveera@gmail.com");
		crepo.save(customer);
		
	}
	@Test
	void deleteCustomer() {
		Customer customer = crepo.findById(2l).get();
		crepo.delete(customer);
		System.out.println("Test");
				
	}

}
