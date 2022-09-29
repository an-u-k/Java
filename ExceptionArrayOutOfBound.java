package com.demo.bean;

import java.util.Scanner;

public class ExceptionArrayOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		//array with values
		int arrayCollections[]= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Enter index :");
		//declaration
		int index=input.nextInt();
		//exception
		try {
			
			System.out.println(arrayCollections[index]);
		}
		catch(Exception e) {
			System.out.println("Index out of bound");
		}
		
		
	}

}
