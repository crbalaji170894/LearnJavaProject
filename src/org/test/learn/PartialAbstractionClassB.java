package org.test.learn;

public class PartialAbstractionClassB extends PartialAbstractionClassA {

	@Override
	public void methodC() {
		System.out.println("Method C");

	}

	public static void main(String[] args) {
		PartialAbstractionClassB classb = new PartialAbstractionClassB();
		classb.methodC();
	}
}
