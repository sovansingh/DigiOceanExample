package com.app.example;

public class SwapNumberEx {

	public static String swapNumber(int a,int b) {
		int temp = 0;
		temp = a+b;
		b = temp-b;
		a = temp-a;
		String str = "a : "+a+" b : "+b;
		return str;
		
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s = swapNumber(a,b);
		System.out.println(s);
	}
}
