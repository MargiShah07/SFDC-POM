//package com.salesforce.test;
//
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//
//public class TestBase {
//
//	public static WebDriver driver;
//	public static Properties prop;
//
//	public TestBase()
//	{
//		try {
//			prop=new Properties();
//			FileInputStream ip = new FileInputStream("C:\\Users\\Nilay\\eclipse-workspace\\SFDC-Page Object Model\\src\\main\\java\\config\\config.properties");
//			prop.load(ip);
//		}catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public static void initialize()
//	{
//		String browsername = prop.getProperty("Browser");
//		if(browsername.equals("chrome"))
//		{
//			String chromepath = "C:\\Users\\Nilay\\eclipse-workspace\\SFDCPOM\\src\\test\\java\\drivers\\chromedriver.exe";
//			System.setProperty("webdriver.chrome.driver", chromepath);
//			driver=new ChromeDriver();
//		}
//		else
//		{
//			System.out.println("d");
//		}
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get(prop.getProperty("url"));
//	}
//}
