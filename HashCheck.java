package com.interview;

public class HashCheck {
public static void main(String[] args) {
	String s1 = "NITIN";
	String s2 = "NITI";
	
	StringBuffer s3 = new StringBuffer("vikram");
	StringBuffer s4 = new StringBuffer("vikram");
	
	System.out.println(s3.toString().equals(s4.toString()));
	System.out.println(s3==s4);
	
	
	s3.append("Pujari");
	
	s2 = s2.concat("N");
	
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1.hashCode() + "--"+ s2.hashCode());
}
	
	
}
