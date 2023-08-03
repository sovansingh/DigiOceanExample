package com.app.example;

public class StringEqualsEx {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = new String("welcome");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}

}
