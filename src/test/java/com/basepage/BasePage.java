package com.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
	public WebDriver driver;
	
	public BasePage() 
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	public void loadUrl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
	public void tearDown() throws InterruptedException 
	{
		
		driver.close();
	}
	
	public String getMyTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
}
