package com.base.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Basepage.Basepage;
import com.think954.constants.Think954pagesconstants;
import com.think954.utils.PropertiesReader;

import com.think954.webpages.Ihomepage;

public class Homepage extends Basepage implements Ihomepage
{
	final static Logger logger = Logger.getLogger(Homepage.class);
	private By Logo;
	private By Menubutton;
	private By CobaltViewcasepagelink;
	private By FinanicialViewcasepagelink;
	private By RacketautobodyViewcasepagelink;
	private By WhateWeDoexplorebutton;
	private By OurPhilospohyexplorebutton;
	private By Ideanandambitionsexplorebutton;
	private By Letstalk;
	private By MarketingandBrandinglink;
	private By UserExpereiencelink;
	private By ApplicationDevelopmentlink;
	private By DigitalTransformationlink;

	public Homepage(WebDriver driver) {
		super(driver);
		this.Logo=By.xpath(PropertiesReader.getProperty("Homepage_Logo"));
		this.Menubutton=By.xpath(PropertiesReader.getProperty("Homepage_Menubutton"));
		this.WhateWeDoexplorebutton=By.xpath(PropertiesReader.getProperty("Homepage_WhatWeDoExplorebutton"));
		this.OurPhilospohyexplorebutton=By.xpath(PropertiesReader.getProperty("Homepage_OurPhilosphyExplorebutton"));
		this.Ideanandambitionsexplorebutton=By.xpath(PropertiesReader.getProperty("Homepage_IdeasandambitionsExplorebutton"));
		this.CobaltViewcasepagelink=By.xpath(PropertiesReader.getProperty("Homepage_Cobaltbannerpageviewcase"));
		this.FinanicialViewcasepagelink=By.xpath(PropertiesReader.getProperty("Homepage_Financialservicepageviewcase"));
		this.RacketautobodyViewcasepagelink=By.xpath(PropertiesReader.getProperty("Homepage_Financialservicepageviewcase"));
		this.MarketingandBrandinglink=By.linkText(PropertiesReader.getProperty("Homepage_MarketingandBrandingpage"));
		this.UserExpereiencelink=By.linkText(PropertiesReader.getProperty("Homepage_UserExperienceDesignpage"));
		this.ApplicationDevelopmentlink=By.linkText(PropertiesReader.getProperty("Homepage_ApplicationDevelopementpage"));
		this.DigitalTransformationlink=By.linkText(PropertiesReader.getProperty("Homepage_DigitalTransformationpage"));
		this.Letstalk=By.xpath(PropertiesReader.getProperty("Homepage_Letstalkbutton"));
	}

	@Override
	public boolean verifypage() {
		
		return false;
	}

	public void getStageURL()
	{
		logger.info(Think954pagesconstants.websitelaunchMSG);
		driver.get(Think954pagesconstants.Launch_stage_URL);
		
	}
	public void getliveURL()
	{
		logger.info(Think954pagesconstants.websitelaunchMSG);
		driver.get(Think954pagesconstants.Launch_live_URL);
	}
	public void getPageURL(String url) 
	{
		if (url.equalsIgnoreCase("stage"))
		{
			driver.get(Think954pagesconstants.Launch_stage_URL);
		}
		else if (url.equalsIgnoreCase("live"))
		{
			driver.get(Think954pagesconstants.Launch_live_URL);
		}
		
	}


	public void clickLogo()
	{
		click(Logo);
		implicitWait(10);
		
		try {
			screenshot("clicklogo");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void clickMenubutton() 
	{
		click(Menubutton);
		implicitWait(10);
		try {
			screenshot("clickMenubutton");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
	}

	
	public void clickCobaltViewcasepage()
{
		click(CobaltViewcasepagelink);
		implicitWait(10);
		try {
			screenshot("clickCobaltViewcasepage");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
		
	}

	
	public void clickFinancialViewcasepage()
	{
		click(FinanicialViewcasepagelink);
		implicitWait(10);
		try {
			screenshot("clickFinancialViewcasepage");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

	
	public void clickRABViewcasepage() 
	{
		click(RacketautobodyViewcasepagelink);
		implicitWait(10);
		try {
			screenshot("clickRABViewcasepage");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
	}


	public void clickMarketingandBranding()
	{
		click(MarketingandBrandinglink);
		implicitWait(10);
		try {
			screenshot("clickMarketingandBranding");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

	
	public void clickUserexpereience() 
	{
		click(UserExpereiencelink);
		implicitWait(10);
		try {
			screenshot("clickUserexpereience");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
		
		
	}

	
	public void clickApplicationdevelopment() 
	{
		click(ApplicationDevelopmentlink);
		implicitWait(10);
		try {
			screenshot("clickApplicationdevelopment");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

	
	public void clickDigitaltransformatipon()
	{
		click(DigitalTransformationlink);
		implicitWait(10);
		try {
			screenshot("clickDigitaltransformatipon");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
		
	}


	public void clickOurphilosphy() 
	{
		
		click(OurPhilospohyexplorebutton);
		implicitWait(10);
		try {
			screenshot("clickOurphilosphy");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

	
	public void clickIdeasandambitions()
	{
		click(Ideanandambitionsexplorebutton);
		implicitWait(10);
		try {
			screenshot("clickIdeasandambitions");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}


	public void clickLetstalk()
	{
		click(Letstalk);
		implicitWait(10);
		try {
			screenshot("clickLetstalk");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

	
	public void clickWhatwedo() 
	{
		click(WhateWeDoexplorebutton);
		implicitWait(10);
		try {
			screenshot("clickWhatwedo");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

	

	

	
	
	

}
