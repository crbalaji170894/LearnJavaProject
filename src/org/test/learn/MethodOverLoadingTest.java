package org.test.learn;

public class MethodOverLoadingTest {

	public void testMethod() {
		System.out.println("No Arguments Passed");
	}

	public void testMethod(int i) {
//		i = 10;

		System.out.println("Integer Argument has been passed " + i);

	}

	public void testMethod(int i, String s) {
//		i = 30;
//		s = "Test Program";

		System.out.println("Integer" + i + "and String Value" + s + " has been passed");

	}

	public void testMethod(boolean bool) {
//		bool = true;

		System.out.println("Boolean Value has been passed and value is " + bool);
	}

	
	public static void main(String[] args) {
		// type main do ctrl+space
		//ctrl+click
		
		MethodOverLoadingTest  methodOverloadingObject = new MethodOverLoadingTest();
		
		methodOverloadingObject.testMethod();
		methodOverloadingObject.testMethod(10);
		methodOverloadingObject.testMethod(false);
		methodOverloadingObject.testMethod(30, "TestProgram");
		
	}
}
