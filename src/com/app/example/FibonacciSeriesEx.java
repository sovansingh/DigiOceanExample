package com.app.example;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesEx {

	public static List<Integer> getSeries(int num) {
		int a = 0;
		int b = 1;
		List<Integer> c = new ArrayList<>();
		c.add(a);
		c.add(b);
		c.add(b);
		for(int i=1;i<=num;i++) {
			a = b;
			b = i;
			c.add(a+b);
		}
		return c;
	}
	public static void main(String[] args) {
		int n = 10;
		List<Integer> result = getSeries(n);
	
		for(int i : result) {
			System.out.print(i+" ");
		}
	}
}
