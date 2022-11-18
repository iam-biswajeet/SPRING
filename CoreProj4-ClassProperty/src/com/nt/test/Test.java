package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class Test implements java.io.Serializable {
	public void show() {
		System.out.println("Test.show()");
	}
	public static void main(String[] args) throws Exception{
		Class c1=Test.class;
		System.out.println("c1 obj class::"+c1.getClass());
		System.out.println("c1 obj class obj data ::"+c1.toString());
		System.out.println("c1 obj data Class::"+c1.getName());
		System.out.println("c1 obj Data Parent Calass::"+c1.getSuperclass());
		System.out.println("c1 obj data  implementing Interfaces::"+Arrays.toString(c1.getInterfaces()));
		System.out.println("C! Object Data  Declared Method::"+Arrays.toString(c1.getDeclaredMethods()));
		Class c2=Date.class;
		System.out.println("c1 obj class::"+c2.getClass());
		System.out.println("c1 obj class obj data ::"+c2.toString());
		System.out.println("c1 obj data Class::"+c2.getName());
		System.out.println("c1 obj Data Parent Calass::"+c2.getSuperclass());
		System.out.println("c1 obj data  implementing Interfaces::"+Arrays.toString(c2.getInterfaces()));
		System.out.println("C! Object Data  Declared Method::"+Arrays.toString(c2.getDeclaredMethods()));
		System.out.println("=============================================================================");
		Class clz=Car.class;
		Constructor[] c=clz.getDeclaredConstructors();
		c[0].setAccessible(true);
		Car car=(Car)c[0].newInstance();
		Method[] m=clz.getDeclaredMethods();
		m[0].setAccessible(true);
		m[0].invoke(car);
	
	}

}
