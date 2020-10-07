package com.cisco.training.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		String[] strings = {"this","is","an","array","containing","different","verbs"};
		
		Arrays.sort(strings,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		System.out.println(Arrays.asList(strings));

	}

}
