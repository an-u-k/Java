package com.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TblEmployee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column(nullable=false)
	private String empName;
	@Column(nullable=false)
	private String designation;
	@Column(nullable=false)
	private LocalDate doj;
	@Column(nullable=false)
	private double salary;
	private long phone;
	@Column(nullable=false)
	private boolean isActive;
	
	@JoinColumn(name="deptId")
	@ManyToOne
	private Department department;

	//constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterised constructor

	public Employee(int empId, String empName, String designation, LocalDate doj, double salary,
			Department department,long phone,boolean isActive) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.doj = doj;
		this.salary = salary;
		this.department = department;
		this.phone=phone;
		this.isActive=isActive;
	}

	//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmpName() {
		return empName;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	//override
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", doj=" + doj
				+ ", salary=" + salary + ", department=" + department + "]";
	}
	
}
