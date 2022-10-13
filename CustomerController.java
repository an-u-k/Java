package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Customer;
import com.demo.service.IAdminService;
import com.demo.service.ICustomerService;




@CrossOrigin   //helps to avoid cors error
@RestController
@RequestMapping("api/")
public class CustomerController {
	
	@Autowired
	IAdminService customerService;
	
	@Autowired
	ICustomerService custService;
	
	@GetMapping("customers")
	//Listall users
	public List<Customer> findAllCustomers(){
		return customerService.findAllCustomers();
	}

	//get User by username and accountNumber
	@GetMapping("customers/{accountNo}")
	public Customer findCustomerByPhone(@PathVariable String accountNo) {
		System.out.println("Inside controller");
		return customerService.findCustomerByAccountNumber(accountNo);
	}
	
	//add customer
	@PostMapping("addCustomers")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		System.out.println("Inserting Record");
		return new ResponseEntity<Customer> (customerService.addCustomer(customer),HttpStatus.OK);
	}
	
	//update customer
	@PutMapping("updateCustomers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		System.out.println("Updating a record");
		customerService.updateCustomer(customer);
		return customer;
	}
	
	//delete customer
	@PutMapping("deleteCustomers/{accountNo}")
	public Customer deleteCustomer(@RequestBody Customer customer) {
		System.out.println("updated");
		customerService.deleteCustomer(customer);
		return customer;
	}
	
	@PutMapping("depositmoney")
	public Customer deposit(@RequestBody Customer customer) {
		System.out.println("updated");
		custService.deposit(customer);
		return customer;
	}
	
	@PutMapping("withdrawmoney")
	public Customer withdraw(@RequestBody Customer customer) {
		System.out.println("updated");
		custService.withdraw(customer);
		return customer;
	}

}
