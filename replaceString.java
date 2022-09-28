package com.demo.bean;

import java.util.Scanner;
//prgm to remove is with was
public class replaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Enter String :");
       String oldString=input.nextLine();
       String newString="";
       //replacing
       newString=oldString.replace(" is "," was ");
       System.out.println(newString);
	}

}
