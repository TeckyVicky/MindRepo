package com.interview;

class P{
	void print()
	{
		System.out.println("Hi P");
	}
}
class PP {
	void print()
	{
		System.out.println("Hi P");
	}
}


public class Ambiguity {

	public Ambiguity() {
		super();
	}
	public static void main(String[] args) {
		Ambiguity a  = new Ambiguity();
	}

}
