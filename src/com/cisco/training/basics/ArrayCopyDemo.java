package com.cisco.training.basics;

import java.util.Arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		Integer[] src = {1,10,100};
		Integer[] dest = new Integer[6];
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println(Arrays.asList(dest));
	}

}
