package com.interview;

import java.util.HashSet;
import java.util.Set;

interface Inter1 {
	default void print1() {
		System.out.println("Hi Interface 1");
	}
	static void print2() {
		System.out.println("Hi Interface 2");
	}
}

interface Inter2 {
	default void print1() {
		System.out.println("Hi Interface--- 1");
	}
	static void print2() {
		System.out.println("Hi Interface-- 2");
	}
}

 abstract class AbstractEx implements Inter1,Inter2{
	
	void print() {
		System.out.println("Hi Abstract");
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		Inter2.super.print1();
	}
	abstract void set();
	
}

public class AbstractClass extends AbstractEx{
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add(1);
		set.add(1);
		System.out.println(set);
		
		
		AbstractEx f = new AbstractClass();
		f.print();
		Inter1.print2();
		f.print1();
		
	}
	 void print() {
		super.print();
		System.out.println("Hi Abstract--------");
	
	}
	@Override
	void set() {
		// TODO Auto-generated method stub
		
	}
	

}
