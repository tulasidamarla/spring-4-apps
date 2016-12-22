
package com.sample.repository;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.springsample.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer c= new Customer();
		c.setFirstName("Tulasi");
		c.setLastName("Ram");
		customers.add(c);
		return customers;
	}

}
