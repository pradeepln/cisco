package com.cisco.training.basics;

public class StackApp {

	public static void main(String[] args) {
		FixedArrayStack stack = new FixedArrayStack(9);
		StackUser user = new StackUser();
		try {
			user.fill(stack);
		}catch(StackFullException e) {
			System.out.println("[[[[ Looks like we pushed a lot ]]]]");
			e.printStackTrace();
		}
		
		Object topMost = stack.pop();
		System.out.println("Top most element is ---> "+topMost);

	}

}
