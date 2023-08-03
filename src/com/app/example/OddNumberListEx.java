package com.app.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumberListEx {

	public static List<Integer> getOddNumber(List<Integer> list){
		List<Integer> result = new ArrayList<>();
		for(int i : list) {
			if(i%2 != 0) {
				result.add(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,51,5,4,8,99,62,6,84,1,518,4,16561,51,47);
		
	 List<Integer> result =	getOddNumber(list);
	
	 for(int i : result) {
		 System.out.print(i +" ");
	 }
	}
}
