package org.test.hello;

public class HelloWorld {


	public static void main(String[] args) {

		HelloWorld object = new HelloWorld();

		HelloWorld object2 = new HelloWorld();
		
		HelloWorld object3 = new HelloWorld();
		
		
		System.out.println(System.identityHashCode(object));
		
		System.out.println(System.identityHashCode(object2));
		
		System.out.println(System.identityHashCode(object3));
	
	}

}
