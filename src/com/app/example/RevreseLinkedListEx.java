package com.app.example;

import java.util.LinkedList;

public class RevreseLinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("sovan");
		list.add("Lipsa");
		list.add("Tejaswini");
		list.add("Prenna");
	
		LinkedList<String> list1 = new LinkedList<>();
		list.descendingIterator().forEachRemaining(list1::add);
		System.out.println(list1);
//		ListIterator<String> itr =  list.listIterator();
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
//		
//		Iterator<String> itr1 = list.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
	}
}
