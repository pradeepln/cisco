package com.cisco.training.basics;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(78, 23);
		
//		System.out.println("I'm a "+r1.getShapeName()+" , area = "+r1.computeArea());
		ShapesApp.displayShapeInfo(r1);
		
		Shape c = new Rectangle(83, 83);
	}

}
