package org.test.learn;

public class SingleTonTestJava {

	public static void main(String[] args) {
		SingleTonClassTest obj = SingleTonClassTest.method();
		
		SingleTonClassTest obj1 = SingleTonClassTest.method();
		
		SingleTonClassTest obj2 = SingleTonClassTest.method();
		
		
		System.out.println(obj.hashCode());
		
		
		System.out.println(obj1.hashCode());
		
		
		System.out.println(obj2.hashCode());

		
		
		
	}

}
