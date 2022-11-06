package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nt.sevice.BankLoanService;

public class BankLoanServiceTest {
	static BankLoanService service = null;
	static float actual = 0.0f;

	/*
	 * @BeforeEach public void startup() {
	 * System.out.println("BankLoanServiceTest.startup()"); service = new
	 * BankLoanService(); }
	 */
	@BeforeAll
	public static void stratup() {
		service=new BankLoanService();
	}

	/*
	 * @AfterEach public void clean() {
	 * System.out.println("BankLoanServiceTest.clean()"); service = null; actual =
	 * 0.0f; }
	 */
	@AfterAll
	public static void clean() {
		service=null;
		actual=0.0f;
	}

	@Test
	public void testcalcSimpleInterestAmountWithBigNumber() {
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNumber()");
		actual = service.calcSimpleInterestAmount(10000000, 2, 12);
		float expected = 2400000;
		assertEquals(actual, expected, "actual!=expected");
	}
	@Test
	public void testcalcSimpleInterestAmountWithSmallNumber() {
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithSmallNumber()");
		actual = service.calcSimpleInterestAmount(100000, 2, 12);
		float expected = 24000;
		assertEquals(actual, expected, "actual!=expected");
	}
	@Test
	public void testcalcSimpleInterestAmountWithException() {
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithException()");
		assertThrows(IllegalArgumentException.class, () -> {
			service.calcSimpleInterestAmount(0, 0, 0);
		},"Not throwing IllegalArgument Exception");
	}
	@Test
	public void testcalcSimpleInterestAmountWithTimer() {
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithTimer()");
		assertTimeout(Duration.ofMillis(10000),()->{
			service.calcSimpleInterestAmount(10000, 2, 12);
		},"Takes More Time");
	}
	@Test
	public void testcalcSimpleInterestAmountWithNoException() {
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithNoException()");
		assertDoesNotThrow( () -> {
			service.calcSimpleInterestAmount(10000, 2, 12);
		},"throwing Exception");
	}

}
