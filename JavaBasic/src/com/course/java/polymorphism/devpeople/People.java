package com.course.java.polymorphism.devpeople;


public class People {
	
	private String name;
	private String lastName;
	private int age;
	
	public People(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void sayHello(){
		System.out.println("Hello!");
	}
	
	@Override
	public String toString(){
		return "Man "+name+" "+lastName+", "+age+" years. ";
	}

}
