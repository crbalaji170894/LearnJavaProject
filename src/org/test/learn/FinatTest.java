package org.test.learn;

public class FinatTest {

	//class-final- inheritence is not allowded
	//method-final- method overiring is not allowded
	//variable- fina - we can able to change value
	public  void methodA() {
		int a =10;
		
		a=20;
		
		System.out.println(a);

	}
	
	public final void mehtodB() {
		

	}
	
	public final void methodC() {
		

	}
	public static void main(String[] args) {
		
		FinatTest obj = new FinatTest();
		
		obj.methodA();
		
		
		
		
	}

}
