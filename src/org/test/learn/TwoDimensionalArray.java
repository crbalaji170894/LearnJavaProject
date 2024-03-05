package org.test.learn;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int array[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };

		// 123
		// 245
		// 445
		// [0,0],[0,1][0,2],,,[1,1][1,2],[1,3],,,[2,1][2,2][2,3]

		// row ->i
		// coloumn=->j

		
		System.out.println(array[0][2]);
		
		System.out.println(array[1][2]);
		
		System.out.println(array[2][2]);
		
//		for (int row = 0; row < array.length; row++) {
//			for (int column = 0; column < array.length; column++) {
//				System.out.println(array[row][column]);
//
//			//row=0 column=0
//		    //row =0 column=1
//			//row=0 column=2
//			//row =0 cloumn=3 false
//				 //after that row =1
//				 //row =1 column=0
//				 //row =1 column=1
//				 //row =1 column=2
//				 //row =1 column=3-false
//				
//				//after that row =2
//				//row =2 column=0
//				 //row = column=1
//				 //row =1 column=2
//				 //row =2 column=3-false
//				
//			
//			}
//		}

	}
}
