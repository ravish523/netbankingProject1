package com.inetbanking.testCase;

import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_Login001 extends Base{
	
		@Test
		public void loginTest()
		{
			driver.get("http://demo.guru99.com//V1//index.php");
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(uname);
			lp.setPassword(pwd);
			lp.setLogin();
		}

	}


