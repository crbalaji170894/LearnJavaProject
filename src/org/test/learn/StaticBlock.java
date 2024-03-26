package org.test.learn;

public class StaticBlock {

	static {
		System.out.println("Static Block Executes Very first before main maehtod");
	}

	public static void main(String[] args) {
		System.out.println("Test");

	}

}
