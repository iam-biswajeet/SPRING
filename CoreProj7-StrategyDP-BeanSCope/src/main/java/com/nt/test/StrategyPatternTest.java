package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyPatternTest {
	public static void main(String[] args) {
		System.out.println("StrategyPatternTest.main()");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/configs/applicationContext.xml");
		//get the target class obj
		Flipkart fkrt1=ctx.getBean("fkrt",Flipkart.class);
		Flipkart fkrt2=ctx.getBean("fkrt",Flipkart.class);
		System.out.println("fkrt1==fkrt? "+(fkrt1==fkrt2));
		System.out.println("fkrt1.hashCode::"+fkrt1.hashCode()+"\nfkrt2.hashCode()::"+fkrt2.hashCode());
		
		/*
		 * //call the b.method String shopMessage=fkrt.shopping(new String[]
		 * {"shirt","shoe"}, new double[] {1000.0,2000.0});
		 * System.out.println(shopMessage);
		 */
		ctx.close();
		
	
	}

}
