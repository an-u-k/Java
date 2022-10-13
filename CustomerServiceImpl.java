package com.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repo.CustomerRepository;


@Service
public class CustomerServiceImpl implements ICustomerService{

	
	//field injection
	@Autowired
	CustomerRepository customerRepo;
	
	//deposit
	@Override
	@Transactional
	public Customer deposit(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}
	
	//withdraw
	@Override
	@Transactional
	public Customer withdraw(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

}
