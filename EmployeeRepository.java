package com.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> {

	@Query("from Employee where phone=?1")
	public Employee findByEmployeeByPhone(long phone);

	@Query("UPDATE Employee SET isActive=false where empId=?1")
	public Employee deleteEmployee(Employee employee);

}
