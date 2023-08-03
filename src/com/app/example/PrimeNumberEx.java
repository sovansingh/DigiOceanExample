package com.app.example;

public class PrimeNumberEx {

	public static boolean checkPrimeNumber(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		if(n == 2) {
			return true;
		}
		for(int i = 2;i<n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a = 19;
		boolean b = checkPrimeNumber(a);
		System.out.println(b);
	}
}
