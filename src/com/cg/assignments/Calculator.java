package com.cg.assignments;

public class Calculator {

	@FunctionalInterface
	public interface CalculatorOperation {
    	int performOperation(int n1, int n2);
	}

	public static void main(String[] args) {
		
		CalculatorOperation addObj =(n1,n2)->n1+n2;
		CalculatorOperation subObj =(n1,n2)->n1-n2;
		CalculatorOperation mulObj =(n1,n2)->n1*n2;
		CalculatorOperation divObj =(n1,n2)->n1/n2;
		
		System.out.println("Addition = " + addObj.performOperation(20, 5));
		System.out.println("Subtraction = " + subObj.performOperation(20, 5));
		System.out.println("Multiplication = " + mulObj.performOperation(20, 5));
		System.out.println("Division = " + divObj.performOperation(20, 5));
	}

}
