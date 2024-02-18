package org.test.learn;

public class DoctorClass extends StaffAbstractClass {

//	public void assist() {
//		
//	}
	
	@Override
	public void assist() {
		System.out.println("doctor is assiting");
		
	}

	public static void main(String[] args) {
		DoctorClass doctor = new DoctorClass();
		doctor.assist();
	}



}
