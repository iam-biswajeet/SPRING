package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//read cuntry code and lang code
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lang code::");
		String langCode=sc.next();
		System.out.println("Enter Country code::");
		String countryCode=sc.next();
		//create Locale Object
		Locale locale=new Locale(langCode,countryCode);
		String msg=ctx.getMessage("wish.message",new Object[] {} , locale);
		System.out.println(msg);
	}

}
