package org.test.learn;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestHashMapProgram {

	public static void main(String[] args) {

		String str = "MahaShri";

		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap();
		// D -1 e-2 p -1 t-1 h-1 i-
		char[] charArray = str.toCharArray();

		for (char eachCh : charArray) {
			// D,e,e
			if (hmap.containsKey(eachCh)) {
				hmap.put(eachCh, hmap.get(eachCh) + 1);
			} else {
				hmap.put(eachCh, 1);
			}

		}
		System.out.println(hmap);

	}

}
