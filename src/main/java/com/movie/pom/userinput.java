package com.movie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userinput {
	@FindBy(name = "q")
	WebElement untbx;
	@FindBy(xpath = "(//span[text()='Master'])[1]")
	WebElement enter;
	public userinput(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void input()
	{
		untbx.sendKeys("Master");
		enter.click();
	}
	}
