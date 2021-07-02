package ru.sergo.learning.gradle;

import org.junit.*;

public class TestService {

	@Test
	public void testMsg() {
		String str = new Service().getMsg();
		System.out.println("MESSAGE " + str);
		Assert.assertEquals("Test string", str);
	}
}
