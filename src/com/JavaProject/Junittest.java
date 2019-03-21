package com.JavaProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junittest {

	@Test
	void testMultiply() 
	{
		Junit test = new Junit();
		int result = test.Multiply(6, 8);
		assertEquals(48, result);
	}

}
