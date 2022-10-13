package com.demo.model;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerBank")
public class Customer {

	
	@Id
	private String accountNo;
	@Column(nullable = false)
	private String customerName;
	@Column(nullable = false)
	private String accountType;
	@Column(nullable = false)
	private double balance;

	private double minimumBalance;
	@Column(nullable = false)
	private String mobileNo;
	@Column(nullable = false)
	private String emailId;

	private int atmPin;
	@Column(nullable = false)
	private String panCardNo;
	
	private boolean isActive;

	// default customer
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized customer
	public Customer(String accountNo, String customerName, String accountType, double balance, double minimumBalance,
			String mobileNo, String emailId, int atmPin, String panCardNo, boolean isActive) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.atmPin = atmPin;
		this.panCardNo = panCardNo;
		this.isActive=isActive;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		String regex = "(?=[0-9]{4,6}$)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNo);
		boolean finder = matcher.find();

		if (finder) {
			this.mobileNo = mobileNo;

		} else {
			System.out.println("Sorry invalid mobile number");

		}

	}

	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", customerName=" + customerName + ", accountType=" + accountType
				+ ", balance=" + balance + ", minimumBalance=" + minimumBalance + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", atmPin=" + atmPin + "]";
	}

	// Generate courseCode
	public static String generateAccountNo() {
		Random random = new Random();
		int number = random.nextInt(999999999);
		return String.format("%06d", number);

	}

	// Generate ATM Pin
	public static int generateAtmPin() {
		Random random = new Random();
		int number = random.nextInt(9999);
		return number;

	}

}
