package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver ldriver;
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		@FindBy(name="uid")
		WebElement txtusername;
		
		@FindBy(name="password")
		WebElement txtpass;
		
		@FindBy(name="btnLogin")
		WebElement txtbutton;
		
		public void setUserName(String uname)
		{
			txtusername.sendKeys(uname);
		}
		public void setPassword(String pwd)
		{
			txtpass.sendKeys(pwd);
		}
		public void setLogin()
		{
			txtbutton.click();
		}
}
