package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineShopping;

public class ClientApp {
    public static void main( String[] args ){
    	System.out.println("ClientApp::main");
        ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfgs/Beans.xml");
        OnlineShopping bean = context.getBean(OnlineShopping.class);
       double billAmt= bean.doShopping(null,null);
       System.out.println("Total BillAmt::"+billAmt);
        
        
    }
}
