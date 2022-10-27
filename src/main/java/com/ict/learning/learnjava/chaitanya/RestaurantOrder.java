package com.ict.learning.learnjava.chaitanya;

public class RestaurantOrder {

	public static void main(String[] args) {
		
		RestaurantApp uOrder = new RestaurantApp();
		
		
		uOrder.setName("Wendy");
		uOrder.setAddress("Cherry hill");
		uOrder.setphonenumber(925615615);
		uOrder.setfood("Masala Dosa");
		
			
		System.out.println(" Name - " + uOrder.getName());
		System.out.println(" Address - " + uOrder.getAddress());
		System.out.println(" Phone Number - " + uOrder.getphonenumber());
		System.out.println(" Food Order - " + uOrder.getfood());
		
	
		
	
		

	}

}
