package com.bbs.test;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestC3P0 {

	@Test
	public void testC3P0() {
		ComboPooledDataSource conn = new ComboPooledDataSource("bbs");

		System.out.println(conn);
	}

}
