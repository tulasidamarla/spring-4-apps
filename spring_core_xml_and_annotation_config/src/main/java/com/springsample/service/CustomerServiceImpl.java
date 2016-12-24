package com.springsample.service;

import java.util.List;

import com.springsample.model.Customer;
import com.springsample.repository.CustomerRepository;
import com.springsample.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository repository;
	
	
	@Override
	public List<Customer> getCustomers(){
		return repository.findAll();
	}

	public void setCustomerRepository(CustomerRepository repository) {
		this.repository = repository;
		
	}

}
