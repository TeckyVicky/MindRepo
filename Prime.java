package com.interview;

public class Prime {

	public static void main(String[] args) {
		
		int n=1;
		boolean isPrime = true;
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}

		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
