package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ILoginService;

public class SimpleJdbcCallTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfgs/Beans.xml ");
		ILoginService service=context.getBean(ILoginService.class);
		String message=service.signIn("bapuni", "raja");
		System.out.println(message);
		
	}

}
