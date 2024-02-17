package org.test.learn;

public class MultiLevelInheritaceClassC  extends MultilevelInheritacneClassB{
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
		
		MultiLevelInheritaceClassC classc = new MultiLevelInheritaceClassC();
		
		classc.methodG();
		classc.meehtodH();
		classc.methodI();
		
		classc.methodA();
		classc.meehtodB();
		classc.methodC();
		
		
		classc.methodD();
		classc.meehtodE();
		classc.methodF();
	}

}
