package com.interview;

public class ArmStrong {

	public static void main(String[] args) {
		int n=154;
		int c=0,a;
		int temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(c==temp) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}

	}

}
