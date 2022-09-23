package com.nt.factory;

import com.nt.comps.Costumer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class PersonFactory {

	public static Person getPerson(String type)  {
		Person per = null;
		if (type.equalsIgnoreCase("std"))
			per = new Student();

		else if (type.equalsIgnoreCase("cost"))
			per = new Costumer();

		else if (type.equalsIgnoreCase("emp"))
			per = new Employee();
		else
			throw new IllegalArgumentException("Not a valid Type");
		return per;
	}

	private static Exception IllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
