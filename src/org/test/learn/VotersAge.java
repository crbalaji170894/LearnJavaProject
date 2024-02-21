package org.test.learn;

public class VotersAge {

	public void checkVotersAge(int age) {

		if (age >= 18) {
			System.out.println("The Age is " + age + " eligible to poll the votes");

		} else {
			System.out.println("The Age is " + age + "  not eligible to poll the votes");
		}

	}

	public static void main(String[] args) {
		VotersAge obj = new VotersAge();
		obj.checkVotersAge(16);

	}

}
