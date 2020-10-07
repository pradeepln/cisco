package com.cisco.training.basics;

import static java.lang.Math.*;

public class Circle extends Shape {
	
	private int radius;

	public Circle(int radius) {
		
		this.radius = radius;
	}
	
	
	@Override
	public String getShapeName() {
		
		return "Circle";
		
	}
	
	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}
	

}
class ColoredCircle extends Circle{
	public ColoredCircle(int radius) {
		super(radius);
	}
}

