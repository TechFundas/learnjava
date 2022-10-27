package com.ict.learning.learnjava.sravanya;

public class RestaurantOrder {

	public static void main(String[] args) {
		RestaurantApp uRest = new RestaurantApp();
		uRest.setName("Reddy");
		uRest.setAddress("Arizona");
		uRest.setPhonenum(4567893);
		uRest.setFood("Biryani");
		
		System.out.println(uRest.getName());
		System.out.println(uRest.getAddress());
		System.out.println(uRest.getPhonenum());
		System.out.println(uRest.getFood());
		
	}

}
