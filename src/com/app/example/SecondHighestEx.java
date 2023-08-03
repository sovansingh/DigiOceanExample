package com.app.example;

public class SecondHighestEx {

	public static int findSecondHighest(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		System.out.println(Integer.MIN_VALUE);
		
		for(int i : arr) {
			if(i > highest) {
				secondHighest = highest;
				highest = i;
			}else if (i > secondHighest) {
				secondHighest = i;
			}
		}
		return secondHighest;
	}
	public static void main(String[] args) {
		int[] arr = {125,1,5,89,51,51,8,8,26,0,6,84,1,4,1,959,3,62,582};
		
		int result = findSecondHighest(arr);	
		System.out.println(result);
	}
	
}
