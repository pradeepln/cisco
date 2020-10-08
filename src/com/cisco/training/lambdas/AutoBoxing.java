package com.cisco.training.lambdas;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {
		Integer intObj1 = new Integer(5);
		
		Integer intObj2 = intObj1;
		
//		intObj1++; 
//		// above line is kinda converted to:
//		int temp = intObj1.intValue();
//		temp++;
//		intObj1 = new Integer(temp);
//		
//		System.out.println(intObj1);
//		System.out.println(intObj2);
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(10);
		ints.add(20);
		
		Integer modified = ints.get(0) + 1;
		
	}

}
