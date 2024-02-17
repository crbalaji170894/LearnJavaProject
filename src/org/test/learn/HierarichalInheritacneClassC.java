package org.test.learn;

public class HierarichalInheritacneClassC  extends HierarichalInherticanceClassA{
	public void methodG() {
		System.out.println("Method G");
	}

	public void meehtodH() {

		System.out.println("Method H");
	}

	public void methodI() {
		System.out.println("Method I");

	}

	public static void main(String[] args) {
		HierarichalInheritacneClassC classc = new HierarichalInheritacneClassC();

		classc.meehtodH();
		classc.methodG();
		classc.methodI();
		
		classc.methodA();
		classc.meehtodB();
		classc.methodC();
	}

}
