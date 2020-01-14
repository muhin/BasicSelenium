package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase
{
	protected WebDriver driver;
	protected WebDriverWait wait;

	public PageBase(final WebDriver driver)
	{
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}
}
