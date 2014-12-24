package com.course.java.encapsulation.devcat;

public class Cat {

	private int age;
	private String poroda;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPoroda() {
		return poroda;
	}

	public void setPoroda(String poroda) {
		this.poroda = poroda;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say(){
		System.out.println("Meow!");
	}
	
	@Override
	public String toString(){
		return "Cat "+name+", "+poroda+", "+age;
	}
}
