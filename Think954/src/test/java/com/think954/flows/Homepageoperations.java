package com.think954.flows;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.pages.Homepage;
import com.base.test.Basetest;
import com.think954.webpages.Ihomepage;

public class Homepageoperations extends Basetest
{
	Ihomepage homepage;
	
	@BeforeMethod
	public void init()
	{
		homepage = new Homepage(driver);
	}

	@Test(description = "homepage")
public void Menubuttonclick() throws InterruptedException
{
	homepage.getPageURL(url);
	
	homepage.clickLogo();
	Thread.sleep(5000);
	homepage.clickMenubutton();
	Thread.sleep(5000);
}

}
