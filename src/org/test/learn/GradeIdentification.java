package org.test.learn;

public class GradeIdentification {

	public void gradeCheck(int averageMark) {
		if (averageMark <= 100) {
			if (averageMark >= 81) {
				System.out.println("The Grade is: A+");
			} else if (averageMark >= 60 && averageMark <= 80) {
				System.out.println("The Grade is: B");
			} else if (averageMark >= 40 && averageMark <= 59) {
				System.out.println("The Grade is: C");
			} else {
				System.out.println("The Student is Failed");
			}
		} else {
			System.out.println("The Value Average Mark is Wrong " + averageMark);
		}

	}

	public static void main(String[] args) {
		GradeIdentification obj = new GradeIdentification();
		obj.gradeCheck(100);
	}

}
