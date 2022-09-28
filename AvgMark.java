package com.demo.bean;

//avg mark of 10 students
import java.util.Scanner;

public class AvgMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		//array
		int marks[]=new int[10];
		int totalSum=0;
		System.out.println("Enter marks");
		for(int i=0;i<10;i++)
		{
			System.out.println("Mark Of "+(i+1)+"th student");
			marks[i]=input.nextInt();
			//calculation of sum
			totalSum+=marks[i];
		}
		//average mark
		System.out.println("Average Mark is: "+totalSum/10);
	}

}
