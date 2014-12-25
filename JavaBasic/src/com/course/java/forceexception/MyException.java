package com.course.java.forceexception;

import java.io.PrintStream;

@SuppressWarnings("serial")
public class MyException extends Exception{

	@Override
	public void printStackTrace(PrintStream s) {
		System.err.println("My force exception");
	}

}
