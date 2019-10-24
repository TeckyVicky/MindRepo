package com.interview;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = new String("abA");
		char ch[] = s.toCharArray();
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			
			str = ch[i]+str;
			
		}
		if(s.equalsIgnoreCase(str)) {
			System.out.println("Pali");
		}
		else {
			System.out.println("Not Pali");
		}
		

	}

}
