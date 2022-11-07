package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import com.nt.sevice.CensusService;
import com.nt.sevice.Printer;

@DisplayName("CensusService&&Printer")
public class CensusServiceTest {
	private static CensusService service=null;
	//private static Printer printer=null;
	@BeforeAll
	public static void init() {
		service=new CensusService();
		//printer=Printer.getInstance();
	}
	public void clean() {
		service=null;
		//printer=null;
		
	}

	/*
	 * @RepeatedTest(10) 
	 * @DisplayName("Export")
	 * public void testExportData() {
	 * assertEquals("Data is exported",service.exportData()); }
	 */
	/*
	 * @ParameterizedTest
	 * 
	 * @ValueSource(ints= {10,21,35,44,67})
	 * 
	 * @DisplayName("Odd") public void testIsOdd(int n) {
	 * assertTrue(service.isOdd(n)); }
	 */
	@ParameterizedTest
	/* @ValueSource(strings= {"","  ","Biswa"}) */
	//@EmptySource
	//@NullSource
	@NullAndEmptySource
	@DisplayName("Empty")
	public void testIsOdd(String user) {
		assertTrue(service.isEmpty(user));
	}
	@Test
	@DisplayName("Singleton")
	public void testSingleton() {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		/*
		 * assertNotNull(p1); assertNotNull(p2);
		 */
		if(p1==null || p2==null)
			fail("Null Not Accepted");
		assertSame(p1,p2);
	}

}
