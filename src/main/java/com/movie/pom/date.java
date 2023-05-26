package com.movie.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class date {
	@FindBy(xpath = "(//span[contains(text(),'Wikipedia')])[3]")
	WebElement w;
	@FindBy(xpath = "//tr[13]/td[1]/div[1]/ul[1]/li[1]")
	WebElement date1;
	@FindBy(xpath = "//td[text()='India']")
	WebElement c1;
	@FindBy(xpath = "(//span[contains(text(),'IMDb')])[1]")
	WebElement i;
	@FindBy(linkText = "January 13, 2021 (United States)")
	WebElement date2;
	@FindBy(linkText = "India")
	WebElement c2;
	@FindBy(xpath = "//span[text()='Details']")
	WebElement d;

	public date(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void wdate(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		w.click();

		Thread.sleep(3000);
		int x=date1.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,"+x+")");
		String wikki1 = date1.getText();
		String con1=c1.getText();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		i.click();
		Thread.sleep(3000);
		int y=d.getLocation().getY();
		JavascriptExecutor j1=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		j1.executeScript("window.scrollBy(0,"+y+")");
		String imd=date2.getText();
		String con2=c2.getText();
		System.out.println(wikki1+"---> "+imd);

		try {
			Assert.assertEquals(wikki1, imd);
			System.out.println("date is  match");

		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("date is not match");
		}
		System.out.println(con1+"--->"+con2);
		try {
			Assert.assertEquals(con1, con2);
			System.out.println("country is  match");

		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("country is not match");
		}

	}
	
	}







