package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.salesforce.test.TestBase;


public class LoginPage {
	//Using FindBy for locating elements
	WebDriver driver;
//		@FindBy(id="username")
		By UserName = By.id("username");
//		@FindBy(id="password")
		By Password = By.id("password");
//		@FindBy(id="Login")
		By LoginBtn = By.id("Login");
//		@FindBy(id="rememberUn")
		By rememberMe = By.id("rememberUn");
//		@FindBy(id="error")
		By Error = By.id("error");
		
		public LoginPage(WebDriver driver)	//constructor-same name as class name
		{
			this.driver=driver;
		}
		
		public void username()
		{
			driver.findElement(UserName).sendKeys("mshah9190@gmail.com");
		}
		
		public void password()
		{
			driver.findElement(Password).sendKeys("family2#7");
		}
		
		public void clicklogin()
		{
			driver.findElement(LoginBtn).click();
		}
//		public HomePage ValidateLogin(String UN, String PWD)
//		{
//			UserName.sendKeys(UN);
//			Password.sendKeys(PWD);
//			LoginBtn.click();
//			return new HomePage();
//		}
		
//		public void RememberMe()
//		{
//			if(rememberMe.isSelected()) {}
//			else {
//				remMe.click();
//			}
//		}
//		
//		public String ValidateUNText()
//		{
//			return UserName.getText();
//		}
//		public String ValidateErrMsg()
//		{
//			return Error.getText();
//		}
}
