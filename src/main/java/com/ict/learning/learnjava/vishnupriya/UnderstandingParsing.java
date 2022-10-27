package com.ict.learning.learnjava.vishnupriya;

public class UnderstandingParsing {

	public static void main(String[] args) {
		String value = "22.45";
		String i="20";
		int string=10;
		long L=1234l;
		float f=12.3f;
		double D=12345d;
		String name="vishnu";
		char c='v';
		boolean b1=true;
		String boolvalue="true";
	
		

		
		float values= Float.parseFloat(value);//string to float
		System.out.println(values);
		
	    String s=Float.toString(f);
	    System.out.println(s);//float to string by using wrapper class
		
		int number=Integer.parseInt(i);//string to int
		System.out.println(number);
		
		String str=Integer.toString(string);
		System.out.println(str);//int to string
		
		long l=Long.parseLong(i);
		System.out.println(l);//string to long
		
		String st=Long.toString(L);
		System.out.println(st);//Long to string
		
		double d=Double.parseDouble(i);
		System.out.println(d);////string to double
		
		String s2=Double.toString(D);
		System.out.println(s2);//Double to string
		
		char Char=name.charAt(2);
		System.out.println(Char);//string to char
		
		String str1=Character.toString(c);
		System.out.println(str1);//char to string
		
		Object obj=name;
		System.out.println(obj);//string to object
		
	    UnderstandingParsing up	=new UnderstandingParsing();//object to string
	    String Object1=up.toString();
	    System.out.println(name);	
		
	    String s1=Boolean.toString(b1);
	    System.out.println(s1);//boolean to string
	    
	    boolean b2=Boolean.parseBoolean(boolvalue);
	    System.out.println(b2);//string to boolean
	    
	    
		
		
		
		
		
		
	}

}
