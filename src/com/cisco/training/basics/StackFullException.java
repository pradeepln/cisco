package com.cisco.training.basics;

public class StackFullException extends RuntimeException {
	
	public StackFullException(String msg, Exception rootCause) {
		super(msg,rootCause);
	}

}
