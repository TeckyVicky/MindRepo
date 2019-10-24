package com.interview;

public class SecondHigh {

	public static void main(String[] args) {
		int a[] = { 3, 4, 6, 7, 7, 0, 7,8,10,9,20,19 };
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				secMax = max;
				max = a[i];
			}
			if (secMax < a[i] && max != a[i]) {
				secMax = a[i];
			}
		}

		System.out.println("Max " + max);
		System.out.println("SecMax " + secMax);
	}

}
