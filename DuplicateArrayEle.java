package com.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArrayEle {

	public static void main(String[] args) {
		int a[] = {3,2,4,3,2,6};
		//int b[];
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < a.length; i++) {
			
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			}
			else {
				map.put(a[i], 1);
			}
		}

		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			
			if(m.getValue() > 1) {
				
				
			System.out.print(m.getKey());
			}
			
		}
		
	}

}
