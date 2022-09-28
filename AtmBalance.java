package com.demo.bean;

//prgm with menu1.deposit2.withdraw3.showbalance4.exit
import java.util.Scanner;

public class AtmBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// declarationScanner input = new Scanner(System.in);
		int[] pinNums = { 1234, 2345 };
		// checking pin

		int count = 3;
		while (count != 0) {
			System.out.println("Enter your pin");
			int userPin = input.nextInt();
			int flag = 0;
			for (int pinNum = 0; pinNum < pinNums.length; pinNum++) {
				if (userPin == pinNums[pinNum]) {
					flag = 1;
					menu();
					break;
				}
			}
			if (flag == 0)
				System.out.println("Not authorised one");
			count--;
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int balanceAmount = 0;
		char continueChoice = 'y';
		do {
			System.out.println("Select your choice :\n1.DEPOSIT\n2.WITHDRAW\n3.SHOW BALANCE\n4.EXIT\n");

			System.out.println("Enter your choice :");
			int choice = input.nextInt();
			switch (choice) {
			case 1: {
				// deposit
				System.out.println("Enter Amount you want to deposit :");
				int depositAmount = input.nextInt();
				balanceAmount = deposit(depositAmount, balanceAmount);
				continueChoice = continueOption(continueChoice);
				break;
			}
			case 2: {
				// withdraw
				System.out.println("Enter amount ypu want to withdraw :");
				int withdrawAmount = input.nextInt();
				balanceAmount = withdraw(withdrawAmount, balanceAmount);
				continueChoice = continueOption(continueChoice);
				break;
			}
			case 3: {
				// balancechecking
				if (balanceAmount - 5000 < 0)
					System.out.println("Total Balance amount is less than 5000");
				else
					System.out.println("Available bal " + (balanceAmount - 5000));
				System.out.println("ledger Amount is:" + (balanceAmount));
				continueChoice = continueOption(continueChoice);
				break;
			}
			case 4: {
				System.out.println("ThankYou");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid entry!!");
			}

		} while (continueChoice == 'y' || continueChoice == 'Y');

	}
	// function for checking lyk if you wanna continue or not

	private static char continueOption(char continueChoice) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you wanna continue(y/n)");
		continueChoice = input.next().charAt(0);
		return continueChoice;
	}

//fun for withdrawing amount
	private static int withdraw(int withdrawAmount, int balanceAmount) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		if (withdrawAmount <= 0) {
			System.out.println("Invalid entry");
			balanceAmount += 0;
		}
		if (balanceAmount - withdrawAmount >= 5000) {
			balanceAmount = balanceAmount - withdrawAmount;
			System.out.println("Please Collect Your Cash!!!!");
		} else {
			System.out.println("Insufficient Funds...!!!");
		}
		return balanceAmount;

	}
	// fun for deposit

	private static int deposit(int depositAmount, int balanceAmount) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		if (depositAmount <= 0) {
			System.out.println("invalid input");
			balanceAmount += 0;
		} else {
			System.out.println("Amount is deposited\n");
			balanceAmount += depositAmount;
		}
		return balanceAmount;

	}

}
