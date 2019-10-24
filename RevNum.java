package com.interview;

public class RevNum {

	public static void main(String[] args) {
		int n =1234567890;
		int t = n;
		int sum = 0;
		while(n>0) {
			int rm = n%10;
			sum  = sum * 10 + rm;
			n=n/10;
		}
		
		System.out.println(t);
		System.out.println(sum);
	}

}
