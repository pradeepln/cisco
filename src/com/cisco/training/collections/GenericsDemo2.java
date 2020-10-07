package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo2 {
	
	public static <T> T addTheBetterElement(List<T> list,T v1,T v2) {
//		if(v1 > v2) {
//			list.add(v1);
//			return v1;
//		}else {
//			list.add(v2);
//			return v2;
//		}
		return null;
	}

	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<>();
		Integer added = addTheBetterElement(iList, 10, 20);
		
	}

}
