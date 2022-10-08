package com.demo.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//jpa to map this model class to professor table in db

@Entity
@Table(name="User")
@NamedQueries({
	@NamedQuery(name="User.findByName",query="SELECT u FROM User u WHERE u.firstName=:name")
})
public class User {

	//declare fields
	
	@Id//to make it a s a primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String user;
	private String userPassword;
	private int roleId;
	private LocalDate createdDate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String user, String userPassword, int roleId, LocalDate createdDate) {
		super();
		
		this.user = user;
		this.userPassword = userPassword;
		this.roleId = roleId;
		this.createdDate = createdDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getuser() {
		return user;
	}
	public void setuser(String user) {
		this.user = user;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", user=" + user + ", userPassword=" + userPassword + ", roleId="
				+ roleId + ", createdDate=" + createdDate + "]";
	}
	
	
	
	

	
	
	
}
