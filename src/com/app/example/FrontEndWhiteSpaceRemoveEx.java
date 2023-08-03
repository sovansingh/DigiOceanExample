package com.app.example;

public class FrontEndWhiteSpaceRemoveEx {

	public static String removeWhiteSpace(String str) {
		String result = str.strip();
		return result;
	}
	public static String removeWhiteSpaceTrim(String str) {
		String result = str.trim();
		return result;
	}
	public static void main(String[] args) {
		String str = " Welcome To The JavaTpoint ";
		String result = removeWhiteSpace(str);
		System.out.println(result);
		String result1 = removeWhiteSpaceTrim(str);
		System.out.println(result1);
	}
}
