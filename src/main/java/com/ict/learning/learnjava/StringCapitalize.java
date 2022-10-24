package com.ict.learning.learnjava;

import org.apache.commons.lang3.text.WordUtils;

public class StringCapitalize {
	
	public static void main(String[] args) {
		String description = "After more than 30 years of service as one of the Navy's top aviators, Pete \"Maverick\" Mitchell is where he belongs, pushing the envelope as a courageous test pilot and dodging the advancement in rank that would ground him. Training a detachment of graduates for a special assignment, Maverick must confront the ghosts of his past and his deepest fears, culminating in a mission that demands the ultimate sacrifice from those who choose to fly it.";
		System.out.println(description);
		description = WordUtils.capitalize(description);
		System.out.println(description);
		description = WordUtils.uncapitalize(description);
		System.out.println(description);
		System.out.println((description.replaceAll("[a-zA-Z]+", "")).replaceAll(" ", ""));
		System.out.println();
		//How many white spaces
		//how many words
		// how many characters without white space
		// how many characters with white space
		
		int z = 100;
		//String va = z.toString();
		//System.out.println(va);
		System.out.println(Integer.toString(z));
		
	}

}
