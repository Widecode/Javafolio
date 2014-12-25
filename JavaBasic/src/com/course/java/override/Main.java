package com.course.java.override;

public class Main {

	public static void main(String[] args) {
		
		MethodExmp exmp = new MethodExmp();
		
		String s1 = exmp.get();
		String s2 = exmp.get("World!");
		String s3 = exmp.get(7);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		exmp.get(true);

	}

}
