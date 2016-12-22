package com.sample.service;

import java.util.List;

import com.sample.model.Customer;
import com.sample.repository.CustomerRepository;
import com.sample.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository repository = new CustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.springsample.service.CustomerService#getCustomers()
	 */
	@Override
	public List<Customer> getCustomers(){
		return repository.findAll();
	}

}
