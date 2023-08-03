package com.app.example;

import java.util.ArrayList;
import java.util.List;

public class MergedTwoListEx {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		List<Integer> list3 = new ArrayList<>(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}
}
