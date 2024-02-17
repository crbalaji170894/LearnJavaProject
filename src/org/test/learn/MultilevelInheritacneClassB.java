package org.test.learn;

public class MultilevelInheritacneClassB extends MultilevelInheritanceClassA {
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
		MultilevelInheritacneClassB classb = new MultilevelInheritacneClassB();

		classb.methodD();
		classb.meehtodE();
		classb.methodF();
		
		classb.methodA();
		classb.meehtodB();
		classb.methodC();
	
	}

}
