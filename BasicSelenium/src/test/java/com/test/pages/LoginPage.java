package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase
{
	public LoginPage(final WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userName")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement userPassword;

	@FindBy(xpath = "//input[(@name='login')]")
	WebElement loginButton;

	public void setUserName(final String user)
	{
		userName.sendKeys(user);
	}

	public void setPassword(final String password)
	{
		userPassword.sendKeys(password);
	}

	public void clicLoginButton()
	{
		loginButton.click();
	}
}
