package org.test.learn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceTest {

	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		
		hashSet.add(10);
	
		hashSet.add(10);
		
		hashSet.add("test");
		
		hashSet.add(true);
		
		hashSet.add(10.5f);
		
		hashSet.add('c');
		
		System.out.println(hashSet);
		
		hashSet.remove("test");
		System.out.println(hashSet);
		
		LinkedHashSet liSet = new LinkedHashSet();
		
		liSet.add(10);
		
		liSet.add(10);
		
		liSet.add("test");
		
		liSet.add(true);
		
		liSet.add(10.5f);
		
		liSet.add('c');
		
		System.out.println(liSet);
		
		TreeSet treeSet = new TreeSet();
		
		treeSet.add(100);
		
		treeSet.add(200);
		
		treeSet.add(50);
		
		treeSet.add(75);
		
		treeSet.add(250);
		
		treeSet.add(0);
		
		treeSet.add(100);
		
		System.out.println(treeSet);
	
	}

}
