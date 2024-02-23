package org.test.learn;

public class SwitchCaseTest {

	public static void main(String[] args) {

		switch ("march") {

		case "jan":
			System.out.println("Janaury");
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
			}
			break;
		case "feb":
			System.out.println("Febraury");
			break;
			
		case "march":
			System.out.println("March");
			break;
		default:
			System.out.println("This is not valid month name");
			break;

		}
	}

}
