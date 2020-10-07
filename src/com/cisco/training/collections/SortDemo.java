package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.cisco.training.basics.ChemicalElement;

public class SortDemo {
	
	public static void sortArray() {
		String[] a = {"this","is","array","not","allowed","here"};
		Arrays.sort(a);
		System.out.println(Arrays.asList(a));
	}
	
	public static void sortStringList() {
		String[] a = {"this","is","array","not","allowed","here"};
//		List<String> strList = Arrays.asList(a);
		List<String> strList = new ArrayList<>(Arrays.asList(a));
		Collections.sort(strList);
		System.out.println(strList);
		System.out.println("_______________________");
		for(String s : a) {
			System.out.println(s);
		}
	}

	public static void sortChemicalList() {
		List<ChemicalElement> cList = new ArrayList<>();
		cList.add(new ChemicalElement(1, "H", "Hydrogen"));
		cList.add(new ChemicalElement(19, "K", "Potassium"));
		cList.add(new ChemicalElement(8, "O", "Oxygen"));
		
		Collections.sort(cList);
		System.out.println(cList);
	}
	
	
	public static void sortStringListBasedOnLength() {
		String[] a = {"this","is","array","not","allowed","here"};
		List<String> strList = new ArrayList<>(Arrays.asList(a));
		
		
		Collections.sort(strList, new StringLengthComparator());
		
		
		System.out.println(strList);


	}
	
	public static void main(String[] args) {
//		sortStringList();
//		sortArray();
//		sortChemicalList();
		
		sortStringListBasedOnLength();
	}

}
