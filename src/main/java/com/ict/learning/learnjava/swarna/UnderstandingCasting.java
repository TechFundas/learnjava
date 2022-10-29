package com.ict.learning.learnjava.swarna;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class UnderstandingCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numValue = "70";
		
		int numValueInt = Integer.parseInt(numValue);
		System.out.println(numValue);
		
		int  intValue = 38;
		String valueString = "";
		System.out.println(valueString);
		
		//long y = 100L;
		String yValue = "123434345";
		long y = Long.parseLong(yValue);
		System.out.println(y);
		
		String kvalue = "50.5";
		float values = Float.parseFloat(kvalue);
		System.out.println(values);
		
		String dvalue = " 25.6";
		double fvalues = Double.parseDouble(dvalue);
		System.out.println(fvalues);
	    

	
	    String dateInString = "Mon, 05 May 1980"
	    		+"";
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
	    LocalDate dateTime = LocalDate.parse(dateInString, formatter);
	    
	    System.out.println(dateTime);
		 
	    int k = 50;
	    long z = k;
	    System.out.println(z);
	    
	    int hvalue =260;
	    double jvalues = hvalue;
	    System.out.println(hvalue);
	    
	    char g = 7;
	    int m =g;
	    System.out.println(m);
	    
	    
	    
	    String s ="hello";
	    
	    Object obj=s;
	    System.out.println(obj);
	    
	    String s1 = "true";
	    boolean B1 = Boolean.parseBoolean(s1);
	    System.out.println(B1);
	    
	     
				        
		                       

		
		
		
         
	}

}
