package com.ict.learning.learnjava;

public class UnderstandingStrings {
	
	public static void main(String[] args) {
	/*	String firstName = "Robert";
		String LastName = "Cayote";
		String fullName = firstName.concat(LastName);
		System.out.println(" Name is "+ fullName);
		System.out.println(fullName.length());
		
		System.out.println(fullName.substring(6));
		System.out.println(fullName.toUpperCase());
		System.out.println(firstName.substring(0,3));
		System.out.println(firstName.replace('e', 'a'));
		System.out.println(firstName.toUpperCase().concat(LastName.toLowerCase()));*/
		StringBuilder stringBuilder = new StringBuilder("Hello");//16
		System.out.println(stringBuilder.capacity());
		System.out.println(stringBuilder.append(" Raj"));
		//System.out.println(stringBuilder.capacity());
		stringBuilder.trimToSize();
		System.out.println(stringBuilder.capacity());
	}

}
