package com.demo.bean;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring variables

		Scanner input = new Scanner(System.in);
System.out.println("Enter first num");
		int firstNumber=input.nextInt();
		System.out.println("Enter 2nd num:");
		int secondNumber=input.nextInt();
		int result=0;
		//calling method 
		zeroMap(firstNumber,secondNumber,result);
	}

	private static void zeroMap(int firstNumber, int secondNumber, int result) {
		// TODO Auto-generated method stub
		try {
			result=firstNumber/secondNumber;
			System.out.println("Result is:"+result);
		
	}
		catch(Exception e) {
			System.out.println("Invalid Credentials");
		}
		finally {
			System.out.println("Thankyou");
		}

	
		
	}
}
