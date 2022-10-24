package com.ict.learning.learnjava;

import java.util.Scanner;

public class UnderstandingIf {
	public static void main(String[] args) {
		
		int firstValue ;
		int secondValue;
		int thirdValue;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the First Value ");
		firstValue = scanner.nextInt();
		System.out.println(" Enter the Second Value ");
		secondValue = scanner.nextInt();
		System.out.println(" Enter the Third Value ");
		thirdValue = scanner.nextInt();
		
		if(firstValue>secondValue) {
			System.out.println("firstvalue is greater");
		}else if(secondValue>thirdValue) {
			System.out.println(" SecondValue is greater");
		}else {
			System.out.println(" thirdvalue is greater");
		}
	}

}
