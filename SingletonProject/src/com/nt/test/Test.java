package com.nt.test;

import com.nt.comp.SingletonClass;

public class Test {
	public static void main(String[] args) {
		SingletonClass obj1=SingletonClass.getSingletonClass();
		SingletonClass obj2=SingletonClass.getSingletonClass();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj1.getClass().getName()+"@"+Integer.toHexString(obj1.hashCode()));
		System.out.println(obj1==obj2);
	}

}
