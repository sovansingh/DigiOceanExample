package com.app.example;

public class ReverseStringEx {

	public static String reverseString(String str) {
		if(str == null) {
			throw new IllegalArgumentException("Null is anot a value");
		}
		StringBuffer buffer = new StringBuffer();
		
		char[] c = str.toCharArray();
	
		for(int i = c.length-1;i>=0;i--) {
			buffer.append(c[i]);
		}
		return buffer.toString();
	}
	public static void main(String[] args) {
		String str = "SovanLipsa";
		
		String s = reverseString(str);
		
		System.out.println(s);
	}
}
