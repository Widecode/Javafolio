package com.course.java.forceexception;

public class Main {

	public static void main(String... args){
		
		try{
			throw new MyException();
		} catch(MyException ex){
			ex.printStackTrace();
		}

	}

}
