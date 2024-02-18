package org.test.learn;

public class EncapsulationClass {

	private String studentName;

	private int studenID=101;

	private int studentAge;

	private String address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudenID() {
		return studenID;
	}

	public void setStudenID(int studenID) {
		this.studenID = studenID;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
