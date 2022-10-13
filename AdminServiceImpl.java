package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repo.CustomerRepository;

@Service
public class AdminServiceImpl implements IAdminService{

	//field injection
	@Autowired
	CustomerRepository customerRepo;
	//findall
	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepo.findAll();
	}

	//search account no
	

	//add customer
	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customer.setAccountNo(customer.generateAccountNo());
		customer.setAtmPin(customer.getAtmPin());
		return customerRepo.save(customer);
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	@Transactional
	public Customer deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer findCustomerByAccountNumber(String accountNo) {
		// TODO Auto-generated method stub
		Customer _customer = customerRepo.findCustomerByAccountNumber(accountNo);
		if (accountNo.equals(_customer.getAccountNo())) {
			return _customer;
		} else {
			return null;
		}
	}

	
}
