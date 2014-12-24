package com.course.java.polymorphism.devsportman;

import com.course.java.polymorphism.devpeople.People;

public class Sportman extends People{

	private String typeSport;

	public String getTypeSport() {
		return typeSport;
	}

	public void setTypeSport(String typeSport) {
		this.typeSport = typeSport;
	}

	public Sportman(String name, String lastName, int age) {
		super(name, lastName, age);
	}

	@Override
	public void sayHello() {
		System.out.println("Hello World!");
	}
	
}
