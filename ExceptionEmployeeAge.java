package com.demo.bean;

import java.util.Scanner;

//class
public class ExceptionEmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Name :");
		//declaration
		String employeeName=input.nextLine();
		
		System.out.println("Enter Age:");
		int employeeAge=input.nextInt();
		try {
			//check if its correct age
			if(employeeAge>=18 && employeeAge<=60)
				System.out.println(".....");
			else
				////exception
				throw new Exception("age is below 18 or above 60");
			}
		catch (Exception e) {
			System.out.println("cant "+e.getMessage());
		}
		finally {
			System.out.println("Thankyou");
		}
		

}
}