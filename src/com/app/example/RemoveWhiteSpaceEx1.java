package com.app.example;

public class RemoveWhiteSpaceEx1 {

	public static String removeWhiteSpace(String str) {
		String result = str.replace(" ", "");
		return result.trim();
	}
	public static void main(String[] args) {
		String str = "Welcome To The JavaTPoint";
		String result =  removeWhiteSpace(str);
		System.out.println(result);
	}
}
