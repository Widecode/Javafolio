package com.course.java.interfaces.devbus;

import com.course.java.interfaces.devpeople.People;

public class DriverBus implements Transport, Driver{

	People people;
	String category;
	int speed = 60;
	
	public void setCategory(String category) {
		this.category = category;
		people = new People("Joe", "Stone", 21);
	}

	public void go() {
		if(people != null){
			System.out.println("Go!");
		}else{
			System.out.println("Stop!");
		}
	}

	public int getSpeed() {
		return this.speed;
	}
	
	

}
