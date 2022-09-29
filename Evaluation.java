package com.demo.bean;

public class Evaluation {

	int evaluationId, marksOne, marksTwo;

	public Evaluation() {

	}

	public Evaluation(int mOne, int mTwo) {
		this.marksOne = mOne;
		this.marksTwo = mTwo;
	}

	public void display() throws InvalidValueException {
		if (marksOne < 0 || marksTwo < 0)
			throw new InvalidValueException();
		else {
			System.out.println(marksOne);
			System.out.println(marksTwo);
		}

	}
}
