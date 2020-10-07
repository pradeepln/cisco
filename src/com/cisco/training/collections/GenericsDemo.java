package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

	public static double sum(List<? extends Number> nList) {
		double sum = 0;
		for(Number n : nList) {
			sum += n.doubleValue();
		}
		//nList.add(54.3f);
		return sum;
	}
	
	public static void main(String[] args) {
		Integer[] ints = {1,2,5,6,8,9};
		List<Integer> iList = Arrays.asList(ints);
		double sum = sum(iList);
		System.out.println(sum);
		
		
//		Number n = new Integer(10);
//		List<Number> nList = new ArrayList<Integer>();
		
		Double[] doubles = {1.0,2.1,3.5,4.2};
		List<Double> dList = Arrays.asList(doubles);
		sum = sum(dList);
		System.out.println(sum);
	}

}


