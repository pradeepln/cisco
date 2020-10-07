package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListExample {

	public static List<String> readWords() {

		List<String> words = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		String aWord = "";
		while (true) {
			System.out.println("Enter a Word: ");
			aWord = s.nextLine();
			if (aWord.equalsIgnoreCase("quit")) {
				break;
			}
			words.add(aWord);
		}

		return words;
	}

	public static void main(String[] args) {
		List<String> words = readWords();
		System.out.println("The first word = " + words.get(0));
		System.out.println("The fifth word = " + words.get(4));
		System.out.println(words);

		for (int i = 0; i < words.size(); i++) {
			String aWord = words.get(i);
			System.out.println(aWord);
		}
		System.out.println("---------------------------");

//		for(String aWord : words) {
//			System.out.println(aWord);
//			if(aWord.length() < 3) {
//				words.remove(aWord);
//			}
//		}
		
		

		Iterator<String> it = words.iterator();
		System.out.println("The type of iterator object is == " + it.getClass().getName());

		while (it.hasNext()) {

			String aWord = it.next();
			System.out.println(aWord);
			if(aWord.length() < 3) {
				it.remove();
				
			}
		}
		
		System.out.println(words);

	}

}
