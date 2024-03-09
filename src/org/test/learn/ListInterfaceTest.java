package org.test.learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ListInterfaceTest {

	public static void main(String[] args) {

		ArrayList li = new ArrayList();

		// add ->adding the values to any of the List
		li.add(10.5f);
		li.add(10);
		li.add("test");
		li.add(true);

		li.add(10.5f);
		li.add(10);
		li.add("test");
		li.add(true);

		System.out.println(li);

		// get(-> get the values from any of the List how?

		Object object = li.get(2);

		System.out.println(object);

		int size = li.size();

		System.out.println(size);

		// remove- delete any value from the any of the list based on we pass index.

		li.remove(1);

		System.out.println(li);

		// contains

		boolean contains = li.contains("test");

		System.out.println(contains);

		// isEmpty

		li.clear();

		boolean empty = li.isEmpty();

		System.out.println(empty);

		System.out.println(li);

		li.add(10.5f);
		li.add(10);
		li.add("test");
		li.add(true);

		li.add(10.5f);
		li.add(10);
		li.add("test");
		li.add(true);

		ArrayList li1 = new ArrayList();

		li1.add("test");
		li1.add(true);

		li.removeAll(li1);

		System.out.println(li);

		int indexOf = li.indexOf(10);
		
		System.out.println(indexOf);

		int lastIndexOf = li.lastIndexOf(10);
		
		System.out.println(lastIndexOf);
	}

}
