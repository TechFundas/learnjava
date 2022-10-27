package com.ict.learning.learnjava.srivani;

public class AssignmentOnCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string to float casting
		String name="22.4";
		String value1="22.6";
		float values=Float.parseFloat(value1);
		System.out.println(values);
		
		//string to integer casting
		String value="66";
		int value2=Integer.parseInt(value);
		//int value2=int(value);
		System.out.println(value2);
		
		//int to string
		int y=5;
		String va=String.valueOf(y);
		//String va=String.valueOf(y);
		
		System.out.println(va);
		
		
		//string to long
	String na="34";
	long num=Long.parseLong(na);
	System.out.println(num);
	
	
	//long to string
	
	long ba=1234;
	String ma=String.valueOf(ba);
	System.out.println(ma);
	
	//string to float
	String pa="44";
	float fl=Float.valueOf(pa);
	System.out.println(fl);
	
	//float to string
	float e=55.45f;
	String nu=String.valueOf(e);
	System.out.println(nu);
	
	//string to double
	String sa="1234556";
	double c=Double.parseDouble(sa);
	System.out.println(c);
	
	//double to long
	//double ca=1234567;
	//long za=Long.parseLong(ca);
	//System.out.println(za);//doubt
	
	/*//string to char
	String ma="43";
	char char1=Character.valueOf(ma)
	System.out.println(char1);*////////doubt
	
	
	
	//char to string
	char a=6778;
	String ha=String.valueOf(a);
	
	System.out.println(ha);
	
	//string to boolean
	String da="345";
	boolean BO=Boolean.parseBoolean(da);
	
	System.out.println("string to boolean convert ="+BO);////////////////doubt
	
	
	////boolean to string
	boolean ka=true;
	String ra=String.valueOf(ka);
	System.out.println(ra);
	
	///string to object
	
	
	/////object to string
	//object-
	Object valuer="hello";
	String result=value.toString();
	System.out.println("the converted value of object "+result.getClass());
	
	Object data =result;
	System.out.println(data);
	
	
	
	
	///string to date
	////date to string
	
	
	///int to long
	int g=19;
	long f= g;
	System.out.println(f);
	
	////long to int
	long w=354;
	int s=(int) w;
	System.out.println(s);
	
	//int to double
	int q=342;
	double ja=q;
	System.out.println(ja);
	
	
	
	//double to int
	double t=75.656;
	int l=(int) t;
	System.out.println(l);
	
	
	/////char to int
	char na2='o';
	int u=na2;
	
	////int to char
	int la=657;
	char ea=(char) la;
	System.out.println(ea);
	
	
	
	
	
	
	
	
	
	
			
	
	
		
		
		
		
				
		

	}

}
