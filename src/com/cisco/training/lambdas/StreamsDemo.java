package com.cisco.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] anArrayOfStrings = {"This","is","an","Array","containing","different","verbs"};
		List<String> aListOfStrings = new ArrayList<>(Arrays.asList(anArrayOfStrings));
		
		
//		Stream.of(anArrayOfStrings).forEach(s->System.out.println(s));
//		aListOfStrings.stream().forEach(s->System.out.println(s));
		
		aListOfStrings
			.stream()
			.filter(s -> s.length() > 2)
			.map(lowerCaseString -> lowerCaseString.toUpperCase())
			.map(s -> s.length())
			.forEach(l->System.out.println(l));

//		String s = "hello";
//		System.out.println(s.toUpperCase());
//		System.out.println(s);
	}

}
