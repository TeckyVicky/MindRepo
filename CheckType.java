package com.interview;

public class CheckType {
	void print(int a) {
		System.out.println("int");
	}
	void print(Integer b) {
		System.out.println("Integer");
	}
	void print(short a) {
		System.out.println("short");
	}
	
	
	public static void main(String[] args) {
		CheckType c = new CheckType();
		Integer i = 12;
		short r = 12;
		c.print(r);

	}

}
