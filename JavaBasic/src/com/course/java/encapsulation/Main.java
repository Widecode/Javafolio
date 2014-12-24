package com.course.java.encapsulation;

import com.course.java.encapsulation.devcat.Cat;
import com.course.java.encapsulation.devpeople.People;

public class Main {
	
	static Cat cat = new Cat();
	static People people = new People();

	public static void main(String[] args) {
		
		cat.setName("Garfield");
		cat.setPoroda("Persian");
		cat.setAge(2);
		
		people.setName("Alex");
		people.setLastName("Stone");
		people.setAge(20);
		people.setCat(cat);
		
		System.out.println(people);
		cat.say();
		people.getCat().say();

	}

}
