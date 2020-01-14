package com.test.automation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.test.pages.LoginPage;

public class TestSuite extends TestBase
{
	@BeforeAll
	public void beforeAll()
	{
		setup();
	}

	@AfterAll
	public void cleanUp()
	{
		tearDown();
	}

	@Test
	@Order(1)
	public void goToUrl()
	{
		driver.get("http://www.google.com");
		Assertions.assertEquals("Google", driver.getTitle());
	}

	@Test
	@Order(2)
	public void logInUsingValidUser()
	{
		final LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("muhin");
		loginPage.setPassword("muhin");
		loginPage.clicLoginButton();
		Assertions.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}
}
