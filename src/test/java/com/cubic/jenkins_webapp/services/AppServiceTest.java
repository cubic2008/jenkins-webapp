package com.cubic.jenkins_webapp.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
@SuiteClasses({})
public class AppServiceTest {
	
	private AppService appService;
	
	@Before
	public void init() {
		appService = AppServiceImpl.getInstance();
	}
	
	@Test
	public void testGreeting() {
		String name = "John";
		String result = "Hello, " + name + ".<br/>" + "How are you?";
		assertEquals(appService.getGreeting(name), result);
	}

}
