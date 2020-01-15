package com.test.automation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
		driver.get("http://www.newtours.demoaut.com");
		// Assertions.assertEquals("Google", driver.getTitle());
	}

	@ParameterizedTest(name = "Iteration #{index} with UserName: {0} and Password: {1}")
	@Order(2)
	@CsvFileSource(resources = "/data.csv")
	public void logInUsingValidUser(final String userName, final String userPassword)
	{
		final LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(userName);
		loginPage.setPassword(userPassword);
		loginPage.clicLoginButton();
		Assertions.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		driver.get("http://www.newtours.demoaut.com");
	}
}
