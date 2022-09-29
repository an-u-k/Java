package com.demo.bean;

import java.util.Scanner;

public class StateCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// declaration and allocation of array
		String[][] stringArray = { { "AndraPradesh", "amaravati" }, { "ArunachalPradesh", "itanagar" },
				{ "Assam", "dispur" }, { "Bihar", "patna" }, { "Chattisgarh", "raipur" }, { "Goa", "panaji" },
				{ "Gujarat", "gandhinagar" }, { "Haryana", "chandigarh" }, { "HimachalPradesh", "shimla" },
				{ "JammuKashmir", "Srinagar" }, { "Jharkhand", "ranchi" }, { "Karantaka", "bengalaru" },
				{ "Kerala", "trivandrum" }, { "MadhyaPradesh", "bhopal" }, { "Maharashtra", "mumbai" },
				{ "Manipur", "impal" }, { "Mizoram", "aizawl" }, { "Nagaland", "kohima" }, { "Odisha", "Bhubaneswar" },
				{ "Punjab", "chandigarh" } };


	//initialization after declaration with specific size
	String[] userCapitals=new String[20];
	int score=0;
	for(int stateNum=0;stateNum<20;stateNum++)
	{
		String capital="";
		//priniting the state
		System.out.print(stringArray[stateNum][0]+" ");
		String userInput="";
		System.out.print(":");
		//taking capital from user and convert it into lowercase
		userInput=input.next().toLowerCase();
		capital=stringArray[stateNum][1];
		//checking if user input is same
		if(capital.equals(userInput))
			{score+=1;
		    System.out.println("Score 1");}
		   else
			   System.out.println("Score 0");
		
		
	}
	System.out.println("TotalScore :"+score);

}
}
