package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nt.dao.ILoginDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class LoginMgmtServiceTest {
	private static ILoginMgmtService service;
	private static ILoginDAO dao;
	@BeforeAll
	public static void startup() {
		dao=Mockito.mock(ILoginDAO.class);
		service=new LoginMgmtServiceImpl(dao);
	}
	@AfterAll
	public static void clear() {
		dao=null;
		service=null;
	}
	@Test
	@DisplayName("Valid")
	public void testWithValidCredential(){
		Mockito.when(dao.registerUser("biswa", "2538")).thenReturn(1);
		assertTrue(service.authenticate("biswa", "2538"));
	}
	@Test
	@DisplayName("Invalid")
	public void testWithInvalidCredential(){
		Mockito.when(dao.registerUser("raja", "sai")).thenReturn(0);
		assertFalse(service.authenticate("raja", "sai"));
	}
	@Test
	@DisplayName("No")
	public void testWithNoCredential(){
		
		assertThrows(IllegalArgumentException.class,()->{
			service.authenticate("raja", "");
		});
	}
	
	

}
