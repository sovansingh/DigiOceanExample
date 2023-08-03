package com.app.example;

public class PalindromeStringEx {

	public static boolean checkPalindrome(String str) {
		char[] c = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for(int i = c.length-1;i>=0;i--) {
			buffer.append(c[i]);
		}
		System.out.println(buffer);
		if(str.equals(buffer.toString())) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "wow";
		
		boolean result = checkPalindrome(str);
	
		System.out.println(result);
	}
}
