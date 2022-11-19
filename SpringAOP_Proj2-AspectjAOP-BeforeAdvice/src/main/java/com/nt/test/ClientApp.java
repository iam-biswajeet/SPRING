package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CarShowRoom;

public class ClientApp 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/Beans.xml");
        try {
        CarShowRoom csr=ctx.getBean(CarShowRoom.class);
        String msg=csr.buyCar("Tata", 700000, 12);
        System.out.println(msg);
        }
        catch(Exception e) {
        	//System.err.println(e.getMessage());
        	System.out.println("Car is Not available");
        }
    }
}
