package com.course.java.constructor.devcat;

public class Cat {

	private int age;
	private String poroda;
	private String name;
	
	public Cat(int age, String poroda, String name) {
		this.age = age;
		this.poroda = poroda;
		this.name = name;
	}
	
	public void say(){
		System.out.println("Meow!");
	}
	
	@Override
	public String toString(){
		return "Cat "+name+", "+poroda+", "+age+" years";
	}
}
