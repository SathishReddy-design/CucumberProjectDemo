package com.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepage.BasePage;

public class HomePage extends BasePage
{
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signin;
	
	public HomePage() 
	{
		super();
	}
	public void signHandle() throws InterruptedException 
	{	Thread.sleep(2000);
System.out.println("Hello Home Page");
	signin.click();
	}
	
	//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	//Thread.sleep(1000);
}
