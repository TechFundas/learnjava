package com.ict.learning.learnjava.srivani;

public class UnderstandingCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte,short,char,int,long
		//when we convert same kind of data i.e num to num is called casting
		//if we convert from string to num is called parsing
		int x=10;
		float z=13.4f;
		//int sum=x+z;
		//downcasting
		int sum=(int)(x+z);
		//float sum=x+z;//upcasting
		System.out.println(sum);
		/*String value="66";
		int values=Integer.parseInt(value);
		System.out.println(value.getClass());*/
		String value="22.45";
		float values=Float.parseFloat(value);
		System.out.println(values);
		//string to num
		String num=String.valueOf(x);
		System.out.println(num);
		//string to integer
		//integer to string
		//string to long
		//long to string
		//string to float
		//float to string
		//string to double
		//double to string
		//string to char
		//char to string
		//string to object
		//string to boole,boole to string
		//
		//int to long
		//long to int
		//int to double
		//double to int
		//char to int ,int to char
		
		//casting
		//
		//object to string//string to date
		//date to string //all r called parsing


	}

}
