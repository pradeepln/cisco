package com.cisco.training.basics;

public class PrimitiveVsReference {
	
	public static void main(String[] args) {
		int age = 10;
		int[] runsInAMatch = new int[11];
		runsInAMatch[0] = 25;
		
		increment(age);
		incrementFirstElement(runsInAMatch);
		
		System.out.println(age);
		System.out.println(runsInAMatch[0]);
		
	}
	
	public static void increment(int i) {
		i = i+1; // i++
	}
	
	public static void incrementFirstElement(int[] nums) {
		nums[0]++;
	}

}
