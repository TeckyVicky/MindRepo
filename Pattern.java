package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Pattern {

	public static void main(String[] args) {
		/*int n=6;
	for (int i = 0; i < n; i++) {
		for (int j = 1; j <= n; j++) {
			
			if(j==n-i) {
				for(int k=0;k<i+1;k++) {
				System.out.print(i+1+" ");
				}
			}
			
				System.out.print(" ");
			
		}
		System.out.println();
		}
		*/
		
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(true);
		boolean b3=true;
		boolean b4=true;
		Boolean b5=new Boolean(true);
		System.out.println(b1==b2);
		System.out.println(b1==b3);
		System.out.println(b3==b4);
		System.out.println(b1==b4);
		System.out.println(b3==b5);
		
		/*try {
			System.out.println(Class.forName("String").getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*Map<Integer, String> map =new HashMap<>();
		map.put(new Integer(0), "blue");
		map.put(new Integer(1), "red");
		map.put(new Integer(1), "green");
		System.out.println(map.get(1));*/
	}


}
