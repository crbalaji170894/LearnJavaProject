package org.test.learn;

public class SingleTonClassTest {

	public void mehtodA() {

		System.out.println("MethodA");

	}

	public void mehtodB() {
		System.out.println("MethodB");

	}

	public void methodC() {
		System.out.println("MethodC");

	}

	private static SingleTonClassTest singleToObject = null;

	public static synchronized SingleTonClassTest method() {
		if (singleToObject == null) {
			singleToObject = new SingleTonClassTest();
		}

		return singleToObject;
	}
}
