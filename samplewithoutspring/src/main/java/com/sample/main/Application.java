package com.sample.main;

import com.sample.service.CustomerService;
import com.sample.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.getCustomers().get(0).getFirstName());
		System.out.println(service.getCustomers().get(0).getLastName());
		

	}

}
