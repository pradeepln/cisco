package com.cisco.training.basics;

public class CircleApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(23);
		
		ShapesApp.displayShapeInfo(c1);
		ShapesApp.displayShapeInfo(c2);
		
//		System.out.println("I'm a "+c1.getShapeName()+" , area = "+c1.computeArea());
//		System.out.println("I'm a "+c2.getShapeName()+" , area = "+c2.computeArea());
	}

}
