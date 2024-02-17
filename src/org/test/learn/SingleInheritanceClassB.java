package org.test.learn;

public class SingleInheritanceClassB extends SingleInheritanceClassA {

	public void methodD() {
		System.out.println("Method D");
	}

	public void meehtodE() {

		System.out.println("Method E");
	}

	public void methodF() {
		System.out.println("Method F");

	}

	public static void main(String[] args) {
		SingleInheritanceClassB classb = new SingleInheritanceClassB();

		classb.methodD();
		classb.meehtodE();
		classb.methodF();

		classb.methodA();
		classb.meehtodB();
		classb.methodC();
	}

}
