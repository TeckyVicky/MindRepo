package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramString {

	public static void main(String[] args) {
		
		String s1 = "vikram pujeri ";
		String s2 = "mkravi ripuje ";
		
		String n1 = s1.replaceAll("\\s", "");
		String n2 = s2.replaceAll("\\s", "");
		
		boolean status = false;
		if(n1.length() != n2.length()) {
			status = false;
		}
		else {
			char ch1[] = n1.toLowerCase().toCharArray();
			char ch2[] = n2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			status = Arrays.equals(ch1, ch2);
		}
		
		if(status) {
			System.out.println(s1 + " " + s2 + " Are ANAGRAMS");
		}
		else {
			System.out.println(s1 + " " + s2 + " Are Not ANAGRAMS");
		}
	}

}
