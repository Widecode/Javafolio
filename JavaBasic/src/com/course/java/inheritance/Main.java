package com.course.java.inheritance;

import com.course.java.inheritance.devpeople.People;
import com.course.java.inheritance.devsportman.Sportman;

public class Main {
	
	static People people;

	public static void main(String[] args) {
	
		Sportman sportman = new Sportman("Jeff","Colins",30);
		sportman.setTypeSport("Football");
		
	}

}
