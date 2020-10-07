package com.cisco.training.basics;

import java.util.Arrays;

public class A {

	public void f1() {
		System.out.println("A");
	}
}


class B extends A{
	public void f1() {
		System.out.println("B");
	}
}


class C extends B{
	
	public static void main(String[] args) {
		Integer[] src = {1,2,3};
		Integer[] dest = new Integer[6];
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println(Arrays.asList(dest));
	}
}