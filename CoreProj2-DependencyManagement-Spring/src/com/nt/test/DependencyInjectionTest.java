package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGeneratorApp;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//craete contaner and specify the path of config file
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/configs/applicationContext.xml");
		
		//get the Object of target Class bu Bean id
		Object obj=ctx.getBean("wmg");
		//Type Casting
		WishMessageGeneratorApp wmg=(WishMessageGeneratorApp)obj;
		System.out.println("DependencyInjectionTest.main()");
		//Calll The B.method on obj
		String message=wmg.getMessage("Biswajit");
		
		System.out.println(message);
		ctx.close();
		
	}

}
