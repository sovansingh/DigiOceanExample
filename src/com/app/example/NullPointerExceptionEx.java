package com.app.example;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		printString(null,3);
	}
	
	public static void printString(String str,int count) {
		for(int i =0;i<count;i++) {
			System.out.println(str.toUpperCase());
		}
	}
}
