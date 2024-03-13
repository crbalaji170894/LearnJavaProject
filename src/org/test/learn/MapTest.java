package org.test.learn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();

		hmap.put("StundentID", 100);

		hmap.put("StundentName", "XXX");

		hmap.put("StudentMarkS", 90);

		hmap.put("testId", 100);
		
		System.out.println(hmap.get("testId"));
		
		boolean containsKey = hmap.containsKey("testId");
		
		boolean containsValue = hmap.containsValue(90);
		
		System.out.println(containsKey);
		
		System.out.println(containsValue);
		
//		hmap.put(null, 1001);
//		
//		hmap.put(null, 1002);
//		
//        hmap.put(1001, null);
//		
//		hmap.put(1002, null);
//
//		System.out.println(hmap);

//		LinkedHashMap lmap = new LinkedHashMap();
//
//		lmap.put("StundentID", 100);
//
//		lmap.put("StundentName", "XXX");
//
//		lmap.put("StudentMarkS", 90);
//
//		lmap.put("testId", 100);
//
//		System.out.println(lmap);
//
//		TreeMap tmap = new TreeMap();
//
//		tmap.put(101, 101);
//
//		tmap.put(12, 12);
//
//		tmap.put(99, 103);
//
//		tmap.put(97, 10);
//		
//		tmap.put(1001, null);
//		tmap.put(1002, null);
	//	System.out.println(tmap);
//		
		Hashtable htable = new Hashtable();

		htable.put(101, 101);

		htable.put(12, 12);

		htable.put(99, 103);

		htable.put(97, 10);
		
	//	htable.put(10, null);
		//System.out.println(htable);

	}

}
