package com.inetbanking.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Base {
		public String BaseUrl="http://demo.guru99.com/V1/index.php";
		public static String uname="mngr252926";
		public static String pwd="AguraqU";
		public static WebDriver driver;
		@BeforeClass
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		   driver=new ChromeDriver();
		}
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
	}


