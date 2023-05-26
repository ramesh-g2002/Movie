package com.movie.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.movie.pom.userinput;

public class Baseclass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		
	}
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	
	}
	@BeforeMethod
	public void homePage()
	{
		Reporter.log("homePage",true);
		userinput i=new userinput(driver);
		i.input();
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
		driver.navigate().back();
	}
	@AfterClass
	public void  closebrowser()
	{
		Reporter.log("closebrowser",true);
		driver.quit();
	}

}
