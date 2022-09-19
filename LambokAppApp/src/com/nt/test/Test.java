package com.nt.test;

import com.nt.bean.Student;

public class Test {
	public static void main(String[] args) {
		/*
		 * Student st=new Student(); st.setStuName("Biswajit");
		 * st.setStuAddrs("Badadanda"); st.setStuMark(85); st.setStuRollNo(1001);
		 * System.out.println(st);
		 */
		Student s1=new Student(1001,"Biswajit","Badadanda",80);
		Student s2=new Student(1001,"Rama","Badadanda",80);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
	}

}
