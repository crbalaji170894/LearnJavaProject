package org.test.learn;

public class StringMethodPractice {

	public static void main(String[] args) {

//		String s = "Hi Everybody!!";
//		int length = s.length();
//		System.out.println(length);

		// charAt(index)

//		String s = "Welcome";

		// W-0 e-1 l-2 c-3 o-4 m-5 e-6

//		char charAt = s.charAt(4);
//		System.out.println(charAt);

//		for (int i = 0; i < s.length(); i++) {
//			
//			if(s.charAt(i)=='c') {
//			
//				System.out.println(i);
//				
//			}

//			System.out.println(s.charAt(i));

// i just need to get the index number when ever matched the character 'c'
//		}

//		String s = "WelcoME";
//		String s1 = "Test JAVA";
//		System.out.println(s.toUpperCase());
//		System.out.println(s1.toLowerCase());

		String url = "https://www.google.com/";

		boolean startsWith = url.startsWith("https://");

		if (startsWith == true) {
			System.out.println("The URL is Secured");
		} else {
			System.out.println("The URL is not secured");
		}

		// endsWith()

		boolean endsWith1 = url.endsWith(".comm/");
		boolean endsWith2 = url.endsWith(".net/");

		if (endsWith1 == true || endsWith2 == true) {
			System.out.println("The Valid url");
		} else
			System.out.println("The URL is not valid");

	}

}
