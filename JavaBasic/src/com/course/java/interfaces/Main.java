package com.course.java.interfaces;

import com.course.java.interfaces.devbus.DriverBus;
import com.course.java.interfaces.devbus.Transport;
import com.course.java.interfaces.devpeople.People;

public class Main {

	static People people;
	
	public static void main(String[] args) {
		
		Transport driver = new DriverBus();
		System.out.println(driver.getSpeed());
		//driver.setCategory("C");
		driver.go();
	}

}
