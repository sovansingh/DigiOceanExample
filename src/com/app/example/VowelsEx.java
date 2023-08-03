package com.app.example;

public class VowelsEx {

	public static boolean stringContainsVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "TV";
		boolean b = stringContainsVowels(str);
		System.out.println(b);
		System.out.println(stringContainsVowels(str1));
	}
}
