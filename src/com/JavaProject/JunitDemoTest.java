package com.JavaProject;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class JunitDemoTest {

	@Test
	void test() {
		JunitDemo test = new JunitDemo();
		String result = test.Concat("Hello","Whats up");
		assertEquals("HelloWhats up", result);
	}

}
