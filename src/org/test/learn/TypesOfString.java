package org.test.learn;

public class TypesOfString {

	public static void main(String[] args) {

//		
//		String s1 = "Deepthi"; //Literal Declaration
//		
//		String s2 = "Deepthi";
//		
//		String s3 = "Deepthi";
//		
//		System.out.println(System.identityHashCode(s1));
//		
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(System.identityHashCode(s3));

		// Non Literal String

		String s4 = new String("test");

		String s5 = new String("test");

//		System.out.println(System.identityHashCode(s4));
//
//		System.out.println(System.identityHashCode(s5));
		// in case joining it allocates same memory location

//		StringBuffer s6= new StringBuffer("test");
//
//		StringBuffer s7 = new StringBuffer("test");
//		
//		System.out.println(System.identityHashCode(s6));
//
//		System.out.println(System.identityHashCode(s7));
		
		StringBuilder s8= new StringBuilder("test");

		StringBuilder s9 = new StringBuilder("test");
		
		System.out.println(System.identityHashCode(s8));

		System.out.println(System.identityHashCode(s9));
		
		//in case of joining
		StringBuilder s10 = new StringBuilder("java");
		
		StringBuilder append = s8.append(s10);
		
		System.out.println(System.identityHashCode(append));
		
	
	
	}

}
