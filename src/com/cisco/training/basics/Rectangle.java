package com.cisco.training.basics;

public class Rectangle extends Shape {
	
	private int height,width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public String getShapeName() {
		return "Rectangle";
	}
	
	public double computeArea() {
		return height * width;
	}
	

}
