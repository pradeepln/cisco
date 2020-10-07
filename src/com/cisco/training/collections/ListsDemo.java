package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {
	
	public static void myAlgo(List l) {
		//logic 
	}

	public static void main(String[] args) {
		
		List al = new ArrayList();
		List ll = new LinkedList();
		
		long start = System.currentTimeMillis();
		myAlgo(al);
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
		
		myAlgo(ll);
	}

}
