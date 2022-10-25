package com.ict.learning.learnjava;

public class UnderstandingCasting {
	//byte -> short -> char -> int -> long -> float -> double

	//double -> float -> long -> int -> char -> short -> byte
	public static void main(String[] args) {
		int x = 10;
		float z = 13.4f;
		
		int sum = (int)(x+z);
		//float sum = x+z;
		System.out.println(sum);
		
		String value = "22.45";
		float values= Float.parseFloat(value);
		System.out.println(values);
		
	}

}
