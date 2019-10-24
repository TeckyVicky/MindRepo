package com.interview;

public class SubStringSubSet {

	public static void main(String[] args) {
		
		String s1 = new String("gadag");
		String s2 = "";
		for(int i=0;i<s1.length();i++) 
		{
			for(int j=i+1;j<=s1.length();j++) {
				s2=s1.substring(i, j);
				System.out.println(s2);
				char ch[] = s2.toCharArray();
				s2="";
				for(int k=0;k<ch.length;k++) {
					s2=ch[k]+s2;
				}
				System.out.println(s1.substring(i, j));
				System.out.println(s2);
				if(s2.equals(s1.substring(i, j)) && s2.length()>1) {
					System.out.println("=>" + s1.substring(i, j) + " Palindrome");
				}
				s2="";
				
				
			}
		}
		
		

	}

}
