package com.course.java.polymorphism;

import com.course.java.polymorphism.devpeople.People;
import com.course.java.polymorphism.devsportman.Sportman;

public class Main {

	static People people;

	public static void main(String[] args) {		
		
		people = new People("Joe", "Stone", 20);
		people.sayHello();
	
		Sportman sportman = new Sportman("Jeff","Colins",30);
		sportman.setTypeSport("Football");
		sportman.sayHello();
	}
	
}
