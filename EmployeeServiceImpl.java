package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	// field injection
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findAll();

	}

	@Override
	public Employee findByEmployeeByPhone(long phone) {
		// TODO Auto-generated method stub
		Employee _employee = employeeRepo.findByEmployeeByPhone(phone);
		if (phone == (_employee.getPhone())) {
			return _employee;
		} else {
			return null;
		}
	}

	// add an employee
	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

//		
	// update an employee
	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	@Transactional
	public Employee deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	
	
}
