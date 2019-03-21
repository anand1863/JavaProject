package com.JavaProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestArea {

	@Test
	void testsquare() 
	{
		Area a1 = new Area();
		int result = a1.sqarea(25);
		assertEquals(625, result);
	}

	@Test
	void testrect() 
	{
		Area a2 = new Area();
		int result = a2.rectarea(25,20);
		assertEquals(500, result);
	}
	
}
