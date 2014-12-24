package com.course.java.abstractclass.devpeople;

public class People extends Action{
	
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

	@Override
	void eat(){
		System.out.println("I'm eating");
	}

	@Override
	public void say() {
		System.out.println("I'm saying");
	}
	
}

