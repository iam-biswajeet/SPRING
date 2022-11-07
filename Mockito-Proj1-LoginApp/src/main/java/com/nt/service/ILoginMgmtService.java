package com.nt.service;

public interface ILoginMgmtService {
	//public boolean registerUser(String name,String pwd);

	boolean authenticate(String name, String pwd);
}
