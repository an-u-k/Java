package com.demo.rest;

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

import com.demo.model.Employee;
import com.demo.service.IEmployeeService;

@CrossOrigin   //helps to avoid cors error
@RestController
@RequestMapping("api/")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("employees")
	//Listall users
	public List<Employee> findAllEmployees(){
		return employeeService.findAllEmployees();
	}

	//get User by username and password
	@GetMapping("employees/{phone}")
	public Employee findByEmployeeByPhone(@PathVariable long phone) {
		System.out.println("Inside controller");
		return employeeService.findByEmployeeByPhone(phone);
	}
	
	
	@PostMapping("employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		System.out.println("Inserting Record");
		return new ResponseEntity<Employee> (employeeService.addEmployee(employee),HttpStatus.OK);
	}
	
	@PutMapping("employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		System.out.println("Updating a record");
		employeeService.updateEmployee(employee);
		return employee;
	}
	
	@PutMapping("employees/{empId}")
	public Employee deleteEmployee(@RequestBody Employee employee) {
		System.out.println("deleting a record");
		employeeService.deleteEmployee(employee);
		return employee;
	}

}
