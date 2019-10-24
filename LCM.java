package com.interview;

public class LCM {
	public static void main(String[] args) {
		int n1 = 3, n2=7, n3=9;
		int lcm = (n1>n2)? n1:n2;
		lcm = (lcm>n3)? lcm:n3;
		while(true) {
			
			if(lcm % n1 == 0 && lcm % n2 == 0 && lcm % n3 == 0)
			{
				System.out.println("LCM of "+ n1 +", " +n2+" and "+n3+" is " + lcm);
				break;
			}
			lcm++;
			}
			
		}
	}

