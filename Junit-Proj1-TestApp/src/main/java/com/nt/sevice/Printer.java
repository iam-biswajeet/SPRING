package com.nt.sevice;

public class Printer {
	private static Printer INSTANCE;
	private Printer() {
		System.out.println("Printer.No arg constructor");
	}
	public static Printer getInstance() {
		/*
		 * if(INSTANCE==null) { INSTANCE=new Printer(); }
		 */
		return INSTANCE;
	}

}
