package com.demo.service;

import java.util.Scanner;

import com.demo.repo.UserManagement;
import com.demo.repo.UserManagementImp;

public class UserServiceImpl {
	// TODO Auto-generated method stub
	// constructor injection
	// call methods
	UserManagement crud=new UserManagementImp();
Scanner input=new Scanner(System.in);
char choice='y';
	// menu driven
	// default constructor
	public UserServiceImpl() {

	}
	public void menuDriven() {
		do {
			System.out.println("\n1.Add User\n2.Edit User\n3.Disable User\n4.List of Users\n5.Search by name\n\nEnter your choice");
			
			int option=input.nextInt();
			switch(option) {
			case 1:
				crud.insertEntity();
				break;
			case 2:
				crud.updateEntity();
				break;
			case 3:
				crud.deleteEntity();
				break;
			case 4:
				crud.listOfEntities();
				break;
			case 5:
				crud.findByName();
				break;
				
			default:
				System.out.println("Invalid input");
				
			}
		}while(choice=='y'||choice=='Y');
	}
}
