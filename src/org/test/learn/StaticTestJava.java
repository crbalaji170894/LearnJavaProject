package org.test.learn;

public class StaticTestJava {

	public static void mehtodA() {

		System.out.println("MethodA");
	}

	public static void methodB() {

		System.out.println("MethodB");
	}

	public static void methodC() {

		System.out.println("MethodC");

	}
	
	public  void methodD() {

		System.out.println("MethodD");

	}

	public static class NestedClass{
		
	}
	public static void main(String[] args) {
		
StaticTestJava obejct = new StaticTestJava();
		
		obejct.methodD();
		StaticTestJava.mehtodA();
		
		StaticTestJava.methodB();
		
		StaticTestJava.methodC();
		
		
		

	}

}
