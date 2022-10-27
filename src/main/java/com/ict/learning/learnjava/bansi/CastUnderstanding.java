package com.ict.learning.learnjava;
import java.text.ParseException;
import java.lang.*; 
import java.text.SimpleDateFormat;
import java.util.Date;

public class CastUnderstanding {
	
	//Upcasting
	//byte -> short-> char ->int ->long ->float ->double
	//downcasting
	//double ->float ->long ->int ->char ->short ->byte
	public static void main(String[] args) {
		// casting
		//1.int to float
		int x=10;
		float a = 1.2f;
		
		int sum = (int)(x+a);
		System.out.println(sum);
		
		//2.int to long
		int i= 5;
		long inlong= Long.valueOf(i);
		System.out.println("int to long conversation is:" +inlong);
		
		//long to int
		long longnum=100L;
		int lnint= (int)longnum;
		System.out.println("long to int conversation is:" +lnint);
		
		//3. int to double
		int innum= 3;
		double mydouble= innum;
		System.out.println("int to double conversation is:" +mydouble);
		
		//double to int
		double mydb=3.22d;
		int myint= (int)mydb;
		System.out.println("double to int conversation is:" +myint);
		
		//4.int to char
		int digit = 50;
		char code =(char)digit;
		System.out.println("int to char conversation is:" +code);
		
		//char to int
		char ch1= '9';
		int inchar= Integer.parseInt(String.valueOf(ch1));
		System.out.println("char to int conversation is:" +inchar);
		
		//Parsing
		//1. Strig to float 
		String value= "22.33";
		float value1 = Float.parseFloat(value);
		System.out.println("String to float conversation is:" +value1);
		
		//and float to string
		float f=3.5f;
		String st= Float.toString(f);
		System.out.println("Float to String conversation is:" +st);
		
//		//2. string to int 
//		String valuee= "22.33";
//		int valll = int.parseInteger(valuee);
//		System.out.println("String to int conversation is:" +valll);
		
		//and int to string
		int ival= 40;
		String str=Integer.toString(ival);
		System.out.println("Int to String conversation is:" +str);
		
		//3. string to long 
		String strln= "-999";
		long varLong = Long.parseLong(strln);
		System.out.println("String to long conversation is:" +varLong);
		
		//and long to string
		long varlong = 99999L;
		String slong= Long.toString(varlong);
		System.out.println("long to string conversation is:" +slong);
		
		//4. string to double 
		String doub="11.8";
		double dl =Double.parseDouble(doub);
		System.out.println("String to double conversation is:" +dl);
		
		//and double to string
		double db= 255.4d;
		String sdble= Double.toString(db);
		System.out.println("Double to string conversation is:" +sdble);
		
		//5. string to char 
		String strText="Bansi";
		char[] charArr =strText.toCharArray();
		System.out.println("String to char conversation is:" +charArr);
		
		//and char to string
		char ch='B';
		String result= Character.toString(ch);
		System.out.println("Char to string conversation is:" +result);
		
		//6. string to boolean ---
		String bool="true";
		boolean bl =Boolean.parseBoolean(bool);
		System.out.println("String to boolean conversation is:" +bl);
		
		//and boolean to string
		boolean boolst= true;
		String strboolean= String.valueOf(boolst);
		System.out.println("Boolean to string conversation is:" +strboolean);
		
		//7.string to date 
//		String strDate= "10/26/2022";
//		Date dt = null;
//		try {
//			dt = new SimpleDateFormat("mm/dd/yyyy").parse(strDate);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		System.out.println(strDate +" "+ dt);
		
		//String to date
		String sDate="10/27/2022";
		SimpleDateFormat simdate = new SimpleDateFormat("MM/dd/YYYY");
		Date dd=new Date(sDate);
		System.out.println("String to date conversation is:" +dd);
		
		
		//and date to string
		Date dt2 = new Date();
		SimpleDateFormat sdformate = new SimpleDateFormat("MM/dd/YYYY");
		String strDate= sdformate.format(dt2);
		System.out.println("Date to string conversation is:" +strDate);
		
//		
		
		//8. obj to string
		Object val= "hello";
		String resulto1= String.valueOf(val);
		System.out.println("The converted value of object to string is:" +resulto1);
		
		Object obj="Demo";
		String o =obj.toString();
		System.out.println("Object to String conversation is:" +o);
		
		//String to object
		String stg="this";
		Object stob= stg;
		System.out.println("String to object conversation is:" +stob);
		
		
		

	}

}
