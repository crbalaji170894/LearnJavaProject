package org.test.learn;

public abstract class PartialAbstractionClassA {

	public void methodA() {
		System.out.println("Method A");
	}

	public void methodB() {
		System.out.println("Method B");
	}
	
	public  abstract void methodC();//un implemented method
	
	
	//	public static void main(String[] args) {
//		PartialAbstractionClassA classa = new PartialAbstractionClassA();
//		classa.methodA();
//		classa.methodB();
//	}

}
