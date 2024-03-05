package org.test.learn;

public class SplitMethodTest {

	public static void main(String[] args) {
		

		// hai-1
		// welcome-1
		// to-2
		// java-3
		// class-4
		// at-5
		// 8-PM-7
		// Scheduled-8
		String s1 = "Hai Welcome to Java Class at 8PM Scheduled";

		String[] s2Array = s1.split(" ");
//
//		System.out.println(s2.length);

//		System.out.println(s1);

//		for (int i = 0; i < s2.length; i++) {
//			System.out.println(s2[i]);
//		}
		
		for(String stringEachValue:s2Array)
		{
			System.out.println(stringEachValue);
		}
		
		

	}

}
