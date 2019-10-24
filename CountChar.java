package com.interview;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		String s = "vvvvikram Pujari";
		char ch[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				System.out.println(map.get(ch[i]));
				map.put(ch[i],map.get(ch[i])+1);
				System.out.println(map.get(ch[i]));
			}
			else {
				map.put(ch[i],1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> s1 : map.entrySet()) {
			System.out.print(s1.getKey());
			System.out.println(" " + s1.getValue());
		}
		
		System.out.println(s + " " + map);

	}

}
