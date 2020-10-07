package com.cisco.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();// new HashSet<>();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a word: ");
			String aWord = s.nextLine();
			
			if(aWord.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(! words.add(aWord)) {
				System.out.println("That was a duplicate!!");
			}
			
		}
		
		System.out.println("------------------- All unique words ----------------");
		for(String str : words) {
			System.out.println(str);
		}

	}

}
