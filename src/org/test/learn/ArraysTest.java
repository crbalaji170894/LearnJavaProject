package org.test.learn;

public class ArraysTest {

	public static void main(String[] args) {
		int i[] = { 10, 20 };
		int[] array = { 10, 20, 30, 50 };
		
		array[4]=100;
		

		// 10-0 20-1 30-2 50 -3

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

//		String[] strArray = new String[3];
//
//		char[] ch = new char[5];
//
//		strArray[0] = "test";

//		strArray[1] = "hello";
//		strArray[2] = "welcome";
//		strArray[3] = "to";
//		strArray[4] = "come";

//		for(int i=0;i<strArray.length;i++)
//		{
//			System.out.println(strArray[i]);
//		}

//		for (String arrayEachValue : strArray) {
//			System.out.println(arrayEachValue);
//		}
	}
}
