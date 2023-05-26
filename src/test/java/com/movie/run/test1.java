package com.movie.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.movie.generic.Baseclass;
import com.movie.pom.date;


public class test1 extends Baseclass {
	@Test
	public void Wikipedia() throws InterruptedException
	{
		Reporter.log("test()",true);
		date d=new date(driver);
		d.wdate(driver);	
		
	}

}
