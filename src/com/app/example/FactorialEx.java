package com.app.example;

public class FactorialEx {

	public static int getFactorial(int i) {
		int fact = 1;
		for(int j = 1;j<=i;j++) {
			fact *= j;
		}
		return fact;
	}
	public static void main(String[] args) {
		int i = 5;
		int result = getFactorial(i);
		System.out.println(result);		
	}

}
