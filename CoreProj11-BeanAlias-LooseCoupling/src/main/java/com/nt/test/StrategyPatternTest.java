package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyPatternTest {
	public static void main(String[] args) {
		System.out.println("StrategyPatternTest.main()");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/configs/applicationContext.xml");
		//get the target class obj
		Flipkart fkrt=ctx.getBean("fkrt",Flipkart.class);
		//call the b.method
		String shopMessage=fkrt.shopping(new String[] {"shirt","shoe"}, new double[] {1000.0,2000.0});
		System.out.println(shopMessage);
		ctx.close();
		
	
	}

}
