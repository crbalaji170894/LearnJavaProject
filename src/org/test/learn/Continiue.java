package org.test.learn;

public class Continiue {

	public static void main(String[] args) {
		
		int i =1;
		
		while(i<=10)
		{
			if(i==5) {
				continue;
			}
			System.out.println("The Value of the i is: "+i);
			
			i++;
		}
	}

}
