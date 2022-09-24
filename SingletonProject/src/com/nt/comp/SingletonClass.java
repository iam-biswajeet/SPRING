// SingletonClass.java
package com.nt.comp;

public class SingletonClass {
	public static SingletonClass obj=null;
	private SingletonClass() {
		System.out.println("SingletonClass.SingletonClass()");
	}
	public static SingletonClass getSingletonClass() {
		if(obj==null) {
			obj=new SingletonClass();
		}
		return obj;
	}
	

}
