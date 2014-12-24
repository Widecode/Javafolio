package com.course.java.abstractclass;

import com.course.java.abstractclass.devpeople.People;
import com.course.java.abstractclass.devsportman.Sportman;



public class Main {

	static People people;

	public static void main(String[] args) {		
		
		people = new People("Joe", "Stone", 20);
		people.sayHello();
		people.say();
	
		Sportman sportman = new Sportman("Jeff","Colins",30);
		sportman.setTypeSport("Football");
		sportman.sayHello();
				
	}

}
