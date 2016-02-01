package com.angelica;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloControllerTest {
	HelloController controller;
	@Before
	public void setup() {
		controller = new HelloController();
	}
	
	@Test
	public void testHelloWorld() {
		assertEquals("Hello world!", controller.helloWorld());
	}
	
	@Test
	public void testHelloChina() {
		assertNotEquals("Hello china!", controller.helloChina());
	}

}




