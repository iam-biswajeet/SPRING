package com.nt.comps;

public class Student implements Person {

	public Student() {
		System.out.println("Student.Student()");
	}

	@Override
	public String doTask() {
		return "student is studying";
	}

}
