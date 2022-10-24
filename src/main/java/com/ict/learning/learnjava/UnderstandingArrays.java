package com.ict.learning.learnjava;

public class UnderstandingArrays {
	
	public static void main(String[] args) {
		int i[][] = {{1,2,3,4,5,6},{6,3,4,5},{4,23,1,5,6,3}};
		//System.out.println(i[2]);
		
		for (int[] x:i) {
			for(int z:x) {
			System.out.println(z);
			}
		}
	}

}
