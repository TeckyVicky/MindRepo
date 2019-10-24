package com.interview;

public class CountWords {

	public static void main(String[] args) {
		String s = "   Vikram      Pujari  h  ";
		//s = s.trim();
		String str[] = s.split(" ");
		int c = 0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].length()>0) {
				c++;
			}
			
		}
		System.out.println(c);

	}

}


