package com.krishna.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.krishna.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
