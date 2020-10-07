package com.cisco.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {
	
	//arity - 2 Strings in, int out
	public int eChecker(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(s2.contains("e") && !s1.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		LambdaDemo obj = new LambdaDemo();
		
		String[] strings = {"this","is","an","array","containing","different","verbs"};
		Arrays.sort(strings, (o1,o2) ->	o1.length() - o2.length());
		
		System.out.println(Arrays.asList(strings));
		
		//using lambdas, sort the array based on reverse
		//using lambdas, sort the string array, all words with letter 'e' should appear first, then words w/o 'e'
		
		Arrays.sort(strings, (s1,s2) -> s2.length() - s1.length());
		System.out.println(Arrays.asList(strings));
		//arity for Comparator<String> - 2 Strings in, int out
//		Arrays.sort(strings, (s1,s2) -> obj.eChecker(s1,s2));
		
		Arrays.sort(strings, obj::eChecker);

		//Arrays.sort(strings, LambdaDemo::eChecker);
		
		System.out.println(Arrays.asList(strings));
	}

}
