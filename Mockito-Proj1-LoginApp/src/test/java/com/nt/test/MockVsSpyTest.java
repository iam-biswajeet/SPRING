package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockVsSpyTest {
	ArrayList<String> l1;
	ArrayList<String> l2;
	
	@Test
	//@DisplayName("List")
	public void testList() {
		 l1=Mockito.mock(ArrayList.class);
		l2=Mockito.spy(new ArrayList());
		l1.add("Raja");
		l2.add("Raja");
		System.out.println(l1.getClass());
		
		  Mockito.when(l1.size()).thenReturn(10);
		  Mockito.when(l2.size()).thenReturn(20);
		 
		
		//System.out.println(l1.size()+"  "+l2.size());
		
	}

}
