package org.test.learn;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetTest {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();

		hmap.put("key1", 10);
		hmap.put("key2", 20);
		hmap.put("key3", 30);
		hmap.put("key4", 40);
		hmap.put("key5", 500);

		System.out.println(hmap);
		
		//Generics
		
		HashMap<Integer,Character> hmap2 = new HashMap();
		
		hmap2.put(100, 'c');
		hmap2.put(50, 'c');

		// Entry is nothing but combination of key and Value

		// entrySet();

		Set<Entry> entrySet = hmap.entrySet();

		for (Entry eachEntrySet : entrySet) {

			System.out.println(eachEntrySet.getValue());

		}

	}
}
