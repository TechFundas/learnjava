package com.ict.learning.learnjava.swarna;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingCollections {
	public static void main (String[]args) {
		List list = new ArrayList();
		list.add("Milk");
		list.add("Butter");
		list.add("cake");
		list.add("chat");
		
		//System.out.println(list.get(1));
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
			
			
			

		}
	
	}

}
