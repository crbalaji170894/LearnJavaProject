package org.test.learn;

public class MethodOverRidingClassA {// chennai location

	public void biscuits() {
		System.out.println("50 Rupees");
	}

	public void coolDrinks() {
		System.out.println("150 Rupees");
	}

	public void oils() {
		System.out.println("500 Rupees");
	}

	public static void main(String[] args) {
		MethodOverRidingClassA chennai = new MethodOverRidingClassA();

		chennai.biscuits();
		chennai.coolDrinks();
		chennai.oils();

	}

}
