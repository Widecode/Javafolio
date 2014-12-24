package com.course.java.constructor;

import com.course.java.constructor.devcat.Cat;
import com.course.java.constructor.devpeople.People;

public class Main {
	
	static Cat cat;
	static People people;

	public static void main(String[] args) {
		
		cat = new Cat(2, "Persian", "Garfield");
		people = new People("Joe", "Stone", 20, cat);
		
		System.out.println(people);
		cat.say();
		
	}
}
