package org.test.learn;

public class MethodOverridingClassB extends MethodOverRidingClassA {// bangloreLocation

	public void biscuits() {
		super.biscuits();
	 
		//System.out.println("70 Rupees");
	}

	public void coolDrinks() {
		super.coolDrinks();
		//System.out.println("170 Rupees");
	}

	public void oils() {
		System.out.println("550 Rupees");
	}

	public void iceCreams() {
		System.out.println("600 Rupees");
	}

	public static void main(String[] args) {
		MethodOverridingClassB banglore = new MethodOverridingClassB();

		banglore.biscuits();
		banglore.coolDrinks();
		banglore.oils();
		banglore.iceCreams();
	}

}
