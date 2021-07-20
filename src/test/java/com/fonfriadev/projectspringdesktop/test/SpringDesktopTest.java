package com.fonfriadev.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringDesktopTest {
	
	private static ApplicationContext ctx;
	
	@BeforeAll
	static void init() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	

	@Test
	void testContext() {
		assertNotNull(ctx.getBean("disqueraDAO"));
	}

	@Test
	void testProperties() {
		assertTrue("ok".equals(((Properties) ctx.getBean("properties")).get("test")));
	}
}
