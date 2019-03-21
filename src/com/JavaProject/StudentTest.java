package com.JavaProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student s1 = new Student();
		Boolean result = s1.func("uuuynkhgg");
		assertTrue(result);
	}

}
