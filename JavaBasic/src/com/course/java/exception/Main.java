package com.course.java.exception;

public class Main {

	public static void main(String... args) {
		
		String[] arr = new String[2];
		try{
		System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Element doesn't exist");
		}
	}

}
