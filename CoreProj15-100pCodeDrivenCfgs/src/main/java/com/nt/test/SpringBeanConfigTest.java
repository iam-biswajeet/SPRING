package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGeneratorService;

public class SpringBeanConfigTest {
	public static void main(String[] args) {
		System.out.println("SpringBeanConfigTest.main()");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGeneratorService generator=ctx.getBean("wmg",WishMessageGeneratorService.class);
		String message=generator.messageGenerator("Biswajit");
		System.out.println(message);
	}
}
