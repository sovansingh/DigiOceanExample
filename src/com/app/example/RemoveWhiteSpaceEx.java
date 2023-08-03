package com.app.example;

public class RemoveWhiteSpaceEx {

	public static String removeWhiteSpace(String str) {
		char[] c =  str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<c.length;i++) {
			if(!Character.isWhitespace(c[i])) {
				buffer.append(c[i]);
			}
		}
		return buffer.toString();
	}
	public static void main(String[] args) {
		String str = "Welcome to JavaTPoint";
		String result = removeWhiteSpace(str);
		System.out.println(result);
	}
}
