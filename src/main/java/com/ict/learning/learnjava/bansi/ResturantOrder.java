package com.ict.learning.learnjava.bansi;

public class ResturantOrder {

	public static void main(String[] args) {
		RestaurantAppTask rsApp= new RestaurantAppTask();
		rsApp.setName("Bansi");
		rsApp.setAddress("colorado");
		rsApp.setCardnum(215356777);
		rsApp.setCusintype("gujarati");
		rsApp.setPhonenum(123497153);
		
		System.out.println(rsApp.getName()+" " +rsApp.getAddress()+" " +rsApp.getCardnum()+" " +rsApp.getCusintype()+" " +rsApp.getPhonenum());
		
		

	}

}
