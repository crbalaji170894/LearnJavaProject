package org.test.learn; //package name

public class LearnFirstProgram { // class name

	public void methodOneProgarm() {

		System.out.println("ProgramOne");
	}

	public void methodTwoProgram() {
		System.out.println("SecondProgram");

	}

	public void methodThreeProgram() {

		System.out.println("ThirdProgram");
	}

	public static void main(String[] args) {
		// class name object name = new class name();

		LearnFirstProgram helloWorld = new LearnFirstProgram();// created obj.

		helloWorld.methodOneProgarm();
		helloWorld.methodTwoProgram();
		helloWorld.methodThreeProgram();
	}

}
