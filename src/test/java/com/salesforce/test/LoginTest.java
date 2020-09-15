package com.salesforce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
//import com.salesforce.test.TestBase;

//import util.TestUtil;

public class LoginTest
{
	WebDriver driver = new ChromeDriver();
	LoginPage login = new LoginPage(driver);
	//	
	//	public LoginTest()
	//	{
	//		super();
	//	}

	@BeforeMethod
	public void setup()
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com");
	}

	@Test(priority=1)
	public void loginTC()
	{
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.salesforce.com");
		login.username();
		login.password();
		login.clicklogin();
		driver.quit();
		//		loginPage.ValidateLogin(prop.getProperty("UserName"), prop.getProperty("Password"));		
	}

	//	@Test(priority=2)
	//	public void WrongPwd()
	//	{
	//		loginPage.ValidateLogin(prop.getProperty("UserName"), prop.getProperty("WrongPassword"));
	//		String actual = loginPage.ValidateErrMsg();
	//		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	//		Assert.assertEquals(actual, expected);
	//	}
	//	
	//	@Test(priority=3)
	//	public void WrngUN()
	//	{
	//		loginPage.ValidateLogin(prop.getProperty("WrongUserName"), prop.getProperty("Password"));
	//		String actual = loginPage.ValidateErrMsg();
	//		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	//		Assert.assertEquals(actual, expected);
	//	}
	//	
	//	@Test(priority=4)
	//	public void CreateViewTest()
	//	{
	//		loginPage.ValidateLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	//		HomePage.AccountsTab();
	//		Accounts.CreateNewView();
	//	}
	//	
	//	@Test(priority=5)
	//	public void DevConsoleTest() throws InterruptedException
	//	{
	//		loginPage.ValidateLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	//		HomePage.ValidateDevConsole();
	//		util.switchChildWindow();
	//		String actual = DevConsolePage.ValidateTitle();
	//		String expected = "Developer Console";
	//		Assert.assertEquals(actual, expected);
	//	}

		@AfterMethod
		public void TearDown()
		{
			driver.quit();
		}
}