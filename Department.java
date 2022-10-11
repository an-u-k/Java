package com.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="TblDepartment")
public class Department {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private List<Employee>employees;

	public Department() {
		
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employees=" + employees + "]";
	}
	
	
	

}
