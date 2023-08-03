package com.app.example;

public class ArraySumEx {

	public static void main(String[] args) {
		int[] arr = {125,1,5,89,51,51,8,8,26,0,6,84,1,4,1,959,3,62,582};
	int sum = 0;
		for(int i : arr) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
