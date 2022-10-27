package com.ict.learning.learnjava.srivani;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int k=1;
		for(int i=0;i<4;i++) 
		{
			
			for(int j=0;j<4-i;j++)
			{
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println();
		}*/

	
	////////////////////////
/*		int k=1;
	for(int i=0;i<4;i++) 
	{
		
		for(int j=4;j>=4-i;j--)
		{
			System.out.print(k);
			k++;
			System.out.print("\t");
		}
		System.out.println();
	}

}*/
		/////////////////////////////
		
	/*	
		int k=1;
		for(int i=1;i<=4;i++) 
		{
			
			for(int j=0;j<i;j++)
			{
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println();
		}
*/
		/////////////////
		
	/*	for(int i=1;i<=5;i++) 
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(j);
				
				System.out.print("\t");
			}
			System.out.println();
		}*/
		//////////////////////////////
		int k=1;
		for(int i=1;i<=4;i++) 
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(k*3);
				k++;
				
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		
	}
		
}

