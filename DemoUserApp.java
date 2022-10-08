package com.demo.app;

import com.demo.service.UserServiceImpl;

public class DemoUserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call
		UserServiceImpl userService=new UserServiceImpl();
		
		userService.menuDriven();
		
	}

}
