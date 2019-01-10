package com.jenkin.aj.test;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.jenkin.aj.JenkinDemo;

public class TestJenkinDemo {

	@Test
	public void testDisplayMessage() {
		assertSame("Hello World", new JenkinDemo().displayMessage());
	}
}