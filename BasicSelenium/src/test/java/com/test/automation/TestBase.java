package com.test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	protected static WebDriver driver;

	protected void setup()
	{
		driver = getWebDriver();
	}

	protected void tearDown()
	{
		if (driver != null)
			driver.quit();
	}

	protected WebDriver getWebDriver()
	{
		WebDriverManager.chromedriver().setup();
		final WebDriver driver = new ChromeDriver();
		return driver;
	}
}
