package com.cisco.training.basics;

public class ChemicalElementApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		
		
		//immutable 
//		h.atomicNumber = -1;
		
		
		System.out.println("Is "+ h.getName() +" a Transition Metal? "+h.isTransitionMetal());
	}

}
