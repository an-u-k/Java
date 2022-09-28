package com.demo.bean;

//sum of digits in a string
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		String string = input.nextLine();
		StringBuilder ch = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			//checking if  A character is digit or not
			if (Character.isDigit(str.charAt(i))) {
                ch.append(string.charAt(i));
                
				int num = Integer.parseInt(ch.toString());
				
				totalSum += num%10;
				
				
			}
			

		}System.out.println(totalSum);
	}
}
