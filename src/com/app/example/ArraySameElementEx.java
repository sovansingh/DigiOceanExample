//package com.app.example;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class ArraySameElementEx {
//
//	public static boolean sameElements(int[] a,int[] b) {
//		Set<Object> first = new HashSet<>(Arrays.asList(a));
//		Set<Object> second = new HashSet<>(Arrays.asList(b));
//		
//		for(Object i : first) {
//			System.out.print(i+" ");
//		}
//		
//		if(first.size() != second.size()) {
//			return false;
//		}
//		for(Object object : first) {
//			if(!second.contains(object)) {
//				return false;
//			}
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		int[] a = {1,2,3,2,3};
//		int[] b = {1,2,3};
//		
//		boolean bool = sameElements(a,b);
//
//		System.out.println(bool);		
//	}
//
//}
