package com.demo.service;

import java.util.List;

import com.demo.model.Customer;

public interface IAdminService {


	
		
		//find all customers
		List<Customer> findAllCustomers();
		
		//find user by userName and password
		Customer findCustomerByAccountNumber(String accountNo);
		
		
		//insert
		
		Customer addCustomer(Customer customer);
	//	
		//edit
		
		Customer updateCustomer(Customer customer);
	//	


		Customer deleteCustomer(Customer customer);


	}



