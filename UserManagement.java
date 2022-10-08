package com.demo.repo;

import java.util.Optional;

import com.demo.bean.User;

public interface UserManagement {
	
	//Create a professor
	public void insertEntity();
	
	//list all professor
	public void listOfEntities();
	//update professor
	public void  updateEntity();
	//delete professor
	public void deleteEntity();
	//search by id
//	public void findEntity();
//	//Search by name
	public Optional<User> findByName(String name);

	

}
