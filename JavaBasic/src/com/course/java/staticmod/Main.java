package com.course.java.staticmod;

public class Main {

	public static void main(String... args) {
		
		
		System.out.println(ExmpStatic.get());
		System.out.println(ExmpStatic.a);
		
		ExmpStatic.get();
		System.out.println(ExmpStatic.a);
	
		ExmpStatic.a = 6;
		ExmpStatic.get();
		System.out.println(ExmpStatic.a);
	}

}
