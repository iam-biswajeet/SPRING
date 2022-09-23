package com.nt.test;

import com.nt.comps.Person;
import com.nt.factory.PersonFactory;

public class Test {
	public static void main(String[] args) {
		
		Person biswa=PersonFactory.getPerson("std");
		System.out.println(biswa.doTask());
		System.out.println("============================");
		Person raja=PersonFactory.getPerson("cost");
		System.out.println(raja.doTask());
		System.out.println("============================");
		Person rama=PersonFactory.getPerson("emp");
		System.out.println(rama.doTask());
		
	}

}
