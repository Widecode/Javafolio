package com.course.java.override;

public class MethodExmp {
	
	public String get(){
		return "Hello!";
	}
	
	public String get(String str){
		return str;
	}
	
	public String get(int n){
		return "Number "+n;
	}

	public void get(boolean a){
		System.out.println(a);
	}
}
