package org.test.learn;

public class SuperMarketChennai extends GrocerryItems {

	@Override
	public void cookies() {
		System.out.println("Cookies is 50 RS");

	}

	@Override
	public void biscuites() {
		System.out.println("biscuites is 150 RS");

	}

	@Override
	public void coolDrinks() {
		System.out.println("cooDrinks  is 500 RS");

	}

	

	public static void main(String[] args) {
		SuperMarketChennai chennaiShop = new SuperMarketChennai();
		chennaiShop.biscuites();
		chennaiShop.coolDrinks();
	}

}
