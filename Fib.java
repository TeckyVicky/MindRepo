package com.interview;

public class Fib {

	public static void main(String[] args) {
		int n = 5;
		int f1=0,f2=1,f3;
		while(n>0) {
			System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}

	}

}
