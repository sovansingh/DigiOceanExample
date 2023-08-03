package com.app.example;
class Animal{
	String color;
}
public class InheritanceEx extends Animal{

	public void meow() {
		System.out.println("meow");
	}
	public static void main(String[] args) {
		InheritanceEx ex = new InheritanceEx();
		ex.color = "green";
		ex.meow();
		System.out.println(ex.color);
		
	}
}
