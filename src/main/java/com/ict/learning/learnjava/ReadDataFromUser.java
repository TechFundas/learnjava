package com.ict.learning.learnjava;

import java.util.Scanner;

public class ReadDataFromUser {
	
	public static void main(String[] args) {
		UnderstandingConstructor c = new UnderstandingConstructor(23,44);
		
		System.out.println(" Enter your Name ");
		/*
		 * Scanner scanner = new Scanner(System.in); String name = scanner.nextLine();
		 */
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(" Hello "+ name +" Welcome");
		// Hello TOny McKenzie Welcome
		
	}

}
