//package com.salesforce.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.salesforce.test.TestBase;
//
//public class HomePage extends TestBase{
////	WebDriver driver;
//	@FindBy(xpath="//span[@id='userNavLabel']")
//	WebElement UserMenu;
//	@FindBy(xpath="//a[contains(text(),'Logout')]")
//	WebElement logout;
//	@FindBy(xpath="//a[@class='debugLogLink menuButtonMenuLink']")
//	WebElement devconsole;
//	@FindBy(xpath="//a[contains(text(),'Accounts')]")
//	WebElement accounts;
//	
//	public HomePage()
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	public AccountPage AccountsTab()
//	{
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Accounts')]")));
//		accounts.click();
//		return new AccountPage();
//	}
//	
//	public void ValidateDevConsole() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		UserMenu.click();
//		devconsole.click();
//	}
//	
//	public void LogoutBtn()
//	{
//		logout.click();
//	}
//}
