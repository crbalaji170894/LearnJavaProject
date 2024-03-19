package org.test.learn;

public class ConstructorTestClass {

	public ConstructorTestClass() {// default Construcor
		for (int i = 0; i <= 10; i++) {
			int n = 2;
			int value = n * i;
			System.out.println("Mutlpliction of 2nd table: " + n + "*" + i + "=" + value);

		}

	}

	public ConstructorTestClass(int n) {// parametrized Construcor
		for (int i = 0; i <= 10; i++) {
			int value = n * i;
			System.out.println("Mutlpliction of " + n + "nd table: " + n + "*" + i + "=" + value);

		}

	}

	public static void main(String[] args) {
		ConstructorTestClass object = new ConstructorTestClass(0);// default

		ConstructorTestClass object1 = new ConstructorTestClass();

	}

}
