package com.ict.learning.learnjava;

public class UnderstandingConstructor {
	
	//constructor is a special kind of method
	
	public UnderstandingConstructor() {
		System.out.println("hello");
	}
	
	public UnderstandingConstructor(int value, int sValue) {
		int sum = value+sValue;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		UnderstandingConstructor uConstructor = new UnderstandingConstructor(23,45);
		
	}

}
