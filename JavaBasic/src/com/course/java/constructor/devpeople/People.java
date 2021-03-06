package com.course.java.constructor.devpeople;

import com.course.java.constructor.devcat.Cat;

public class People {
	
	private String name;
	private String lastName;
	private int age;
	
	private Cat cat;
	
	public People(String name, String lastName, int age, Cat cat) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.cat = cat;
	}
	
	@Override
	public String toString(){
		return "Man "+name+" "+lastName+", "+age+" years. "+cat;
	}

}
