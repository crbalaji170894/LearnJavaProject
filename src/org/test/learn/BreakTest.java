package org.test.learn;

public class BreakTest {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			if (i == 5) {
				continue;
				//break;
			}
			System.out.println("The Value of the i is : " + i);
		}
	}

}
