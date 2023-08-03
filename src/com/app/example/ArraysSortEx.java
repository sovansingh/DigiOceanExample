package com.app.example;

import java.util.Arrays;

public class ArraysSortEx {

	public static void sortAnArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] i = { 12, 5, 2, 6, 55, 45, 8, 6, 94, 7, 851, 61, 61, 894, 61, 61, 61, 66, 48, 41, 51 };
		sortAnArray(i);
	}
}
