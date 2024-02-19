package org.test.learn;

public class AccessStudentDetails {

	public static void main(String[] args) {
		StudentDetails object = new StudentDetails();

		object.setStudentName("Kiran");

		object.setStudentId(101);

		object.setAge(13);

		object.setStudentAddress("Chennai");

		System.out.println(object.getStudentName());

		System.out.println(object.getAge());

		System.out.println(object.getStudentId());

		System.out.println(object.getStudentAddress());

	}

}
