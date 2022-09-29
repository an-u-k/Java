package com.demo.app;

import com.demo.bean.Evaluation;
import com.demo.bean.InvalidValueException;

public class DemoUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Evaluation evaluation = new Evaluation(-9, 20);
		try {
			evaluation.display();
		} catch (InvalidValueException iv) {
			System.out.println("Invalid Entry");
		} catch (Exception e) {
			System.out.println("Message " + e);
		}

	}

}
