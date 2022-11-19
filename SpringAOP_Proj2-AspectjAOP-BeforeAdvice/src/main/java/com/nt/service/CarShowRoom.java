package com.nt.service;

import org.springframework.stereotype.Component;

@Component("csr")
public class CarShowRoom {
	
	public String buyCar(String brand,float price,float discount) {
		System.out.println("CarShowRoom.buyCar()");
		float finalPrice=price-(price*discount/100.0f);
		return brand+"  Car is purchased at a cost of "+finalPrice;
	}

}
