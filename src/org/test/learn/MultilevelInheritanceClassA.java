package org.test.learn;

public class MultilevelInheritanceClassA {
	public void methodA() {
		System.out.println("Method A");
	}

	public void meehtodB() {

		System.out.println("Method B");
	}

	public void methodC() {
		System.out.println("Method C");

	}
	public static void main(String[] args) {
		
		MultilevelInheritanceClassA classa = new MultilevelInheritanceClassA();
		
		classa.methodA();
		classa.meehtodB();
		classa.methodC();
	}

}
