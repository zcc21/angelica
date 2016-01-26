package com.angelica;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloControllerTest {
	
	@Test
	public void test() {
		HelloController controller = new HelloController();
		assertEquals("Hello world!", controller.hello());
	}

}
