package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ILoginDAO;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private ILoginDAO dao;
	@Override
	public String signIn(String username, String password) {
		return dao.authenticate(username, password);
		
	}

}
