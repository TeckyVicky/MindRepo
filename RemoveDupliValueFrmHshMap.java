package com.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDupliValueFrmHshMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> newMap = new HashMap<>();
		Set set = new HashSet<>();

		map.put(1, 1);
		map.put(2, 3);
		map.put(3, 3);
		map.put(4, 1);
		map.put(5, 2);
		System.out.println(map);
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (!set.contains(m.getValue())) {
				newMap.put(m.getKey(), m.getValue());
				set.add(m.getValue());
			}

		}
		System.out.println(newMap);
	}

}
