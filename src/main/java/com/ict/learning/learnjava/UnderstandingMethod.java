package com.ict.learning.learnjava;

import java.util.Scanner;

public class UnderstandingMethod {
	
	int firstValue ;
	int secondValue ;
	//access specifier return type methodname 
	public UnderstandingMethod() {
		firstValue=20;
		secondValue=30;
		System.out.println("Hello");
	}
	public void addition() {
		int sum = firstValue + secondValue;
		System.out.println(" Sum of two numbers are " + sum);		
	}
	public void addition(int fValue, int sValue) {
		int sum = fValue + sValue;
		System.out.println(" Sum of two numbers are " + sum);		
	}
	
	public int addition(int fValue, int sValue, int tValue) {
		int sum = fValue + sValue+tValue;
		System.out.println(sum);
		return sum;		
	}
	
	public static void main(String[] args) {
		UnderstandingMethod uMethod = new UnderstandingMethod();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the First value ");
		int firstValue = scanner.nextInt();
		System.out.println(" Enter the Second value ");
		int secondValue = scanner.nextInt();
		System.out.println(" Enter the Third value ");
		int thirdValue = scanner.nextInt();
		uMethod.addition();
		uMethod.addition(firstValue,secondValue);
		uMethod.addition(firstValue,secondValue,thirdValue);
		//System.out.println(uMethod.addition(firstValue,secondValue,thirdValue));
	}

}
