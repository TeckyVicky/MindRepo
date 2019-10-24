package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {

		int[] a = { 10, 9, 15, 1, 16, 18, 19, 31, 52, 6, 1 };

		for (int i = 1; i < a.length; i++) {

			if(a[i]<a[i-1]) {
				a[i] = a[i]+a[i-1];
				a[i-1] = a[i]- a[i-1];
				a[i] = a[i] - a[i-1];
				i=0;
			}
		}
		System.out.println("sorted Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

	}



}
