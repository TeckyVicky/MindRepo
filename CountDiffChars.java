package com.interview;

public class CountDiffChars {

	public static void main(String[] args) {

		String str = "12qw@# ABCC";
		int n=0;
		int c=0;
		int s=0;
		int spl=0;
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=52) {
				System.out.println(ch[i]+ " ");
				n++;
			}
			else if((char)ch[i]>=65 && (char)ch[i]<=97) {
				System.out.println(ch[i]+" ");
				c++;
			}
			else if((char)ch[i]>=98 && (char)ch[i]<=123) {
				System.out.println(ch[i]+" ");
				s++;
			}
			else {
				System.out.println(ch[i]+" ");
				spl++;
			}
		}
		System.out.println("Num : " + n);
		System.out.println("Cap : " + c);
		System.out.println("Small : " + s);
		System.out.println("Special Char : " + spl);
	}

}
