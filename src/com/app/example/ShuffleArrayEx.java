package com.app.example;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArrayEx {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		Random random = new Random();
		for(int i=0;i<arr.length-1;i++) {
			int randomIndex = random.nextInt(arr.length);
			int temp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] =temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
