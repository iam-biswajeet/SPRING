package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {
	private ILoginDAO dao;
	public LoginMgmtServiceImpl(ILoginDAO dao) {
		this.dao=dao;
	}
	@Override
	public boolean authenticate(String name, String pwd) {
		if(name.equals("" )|| pwd.equals(""))
			throw new IllegalArgumentException("Invalid Credential");
		else {
			int count=dao.registerUser(name, pwd);
			if(count ==1)
				return true;
			else 
				return false;
			
		}
		
	}

}
