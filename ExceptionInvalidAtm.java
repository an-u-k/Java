package com.demo.bean;

public class ExceptionInvalidAtm extends Exception {
	// constructor
	public ExceptionInvalidAtm() {
		System.out.println("Balance Amount is less than minimum ie below 5000");
	}

}
