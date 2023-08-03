package com.app.example;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharEx {

	public static void main(String[] args) {
		String str = "Welcome to JavaTPointThis is best tutorials of all the time";
	
		String str1 = str.toLowerCase();
	
		System.out.println(str1);
		
		char[] ch = str1.toCharArray();
	
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				System.out.println(map.get(c));
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}
