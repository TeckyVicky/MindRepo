package com.interview;

interface MyInterface1 {
	
	static void display() {
		System.out.println("Static Method1");
	}
	default void print() {
		System.out.println("Default Method1");
	}
	
}
interface MyInterface2 {
	
	static void display() {
		System.out.println("Static Method2");
	}
	default void print1() {
		System.out.println("Default Method2");
	}
	
}
public class InterfaceStaticMethod implements MyInterface1,MyInterface2{
	
	

	public static void main(String[] args) {
		
		InterfaceStaticMethod i = new InterfaceStaticMethod();
		i.print();
		i.print1();
		//i.print1();
		//MyInterface2.display();
		
	}

	/*@Override
	public void print() {
		// TODO Auto-generated method stub
		MyInterface1.super.print();
		MyInterface2.super.print();
	}*/
	
	/*@Override
	public void print() {
		System.out.println("Hi");
		// TODO Auto-generated method stub
		MyInterface1.super.print();
	}*/
	

	

}
