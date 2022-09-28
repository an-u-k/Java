package com.demo.bean;

import java.util.Scanner;

public class removeLeftAndRightAfterHashSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String newString = "";
		String removableString="";
		
		for(int i=0;i<str.length();i++)
		{
			//checking if # is present or not
			if(str.charAt(i)=='#')
			{
				//string want to remove
				removableString=str.substring(i-1,i+2);
				//replace the new string
				newString=str.replaceAll(removableString,""); 
				
			    
			}
			
		}
		System.out.println(newString);
	}

}
