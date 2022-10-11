package com.demo.service;

import java.util.List;

import com.demo.model.Employee;



public interface IEmployeeService {
	
	//find all employees
	List<Employee> findAllEmployees();
	
	//find user by userName and password
	Employee findByEmployeeByPhone(long phone);
	
	
	//insert
	
	Employee addEmployee(Employee employee);
//	
	//edit
	
	Employee updateEmployee(Employee employee);
//	


	Employee deleteEmployee(Employee employee);


}
