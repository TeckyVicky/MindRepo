package com.interview;

import java.util.ArrayList;
import java.util.List;

public class FirstCharFromString {

	public static void main(String[] args) {
		String s = "Vikram     Pujari  LL pp";
		String str = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!= ' ') 
			str = str + ch[i];
			while (ch[i] != ' ' && i < ch.length-1) {
				i++;
			}
		}
		System.out.println(str);
	}

}
