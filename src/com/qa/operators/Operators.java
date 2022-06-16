package com.qa.operators;

public class Operators {

	// Add
	public void add(int numberOne, int numberTwo) {
		System.out.println(numberOne + numberTwo);
	}

	// Multiply
	public void multiply(int numberOne, int numberTwo) {
		System.out.println(numberOne * numberTwo);
	}

	// Subtract
	public void subtract(int numberOne, int numberTwo) {
		System.out.println(numberOne - numberTwo);
	}

	// Divide

	public void divide(double numberOne, double numberTwo) {
		if (numberOne < numberTwo) {
			System.out.println(numberOne / numberTwo);
		}else {
			System.out.println("division cannot be performed");
		}

	}
}
