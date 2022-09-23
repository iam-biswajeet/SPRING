package com.nt.comps;

public class Employee implements Person {

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	@Override
	public String doTask() {
		return "employee doing job";
	}

}
