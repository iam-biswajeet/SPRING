package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.nt.dao.ILoginDAO;
import com.nt.service.LoginMgmtServiceImpl;

public class MockitoWithAnnotation {
	public MockitoWithAnnotation() {
		MockitoAnnotations.openMocks(this);
	}
	@Mock
	private ILoginDAO dao;
	@InjectMocks
	private LoginMgmtServiceImpl service;
	@Test
	@DisplayName("LoginTest")
	public void testLogin() {
		Mockito.when(dao.registerUser("Biswa","2538")).thenReturn(1);
		assertTrue(service.authenticate("Biswa", "2538"));
	}
}
