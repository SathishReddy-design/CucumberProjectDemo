package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.basepage.BasePage;

public class LoginPage extends BasePage 
{
	//By userName=By.name("login");
	@FindBy(name="login")
	WebElement userName;
	//By password=By.id("password");
	@FindBy(id="password")
	WebElement pswd;
	//By siginCommit=By.name("commit");
	@FindBy(name="commit")
	WebElement commitSignIn;
	
	
	
	
	
	
	public LoginPage() 
	{
		super();
	}
	
	public void UserName(String uname) throws InterruptedException
	{
		userName.sendKeys(uname);
			}
	
	public void password(String pwd) throws InterruptedException
	{
		
		//driver.findElement(password).sendKeys(pwd);
		pswd.sendKeys(pwd);
		}
	public void LoginsignIn() throws InterruptedException
	{
	
	//driver.findElement(siginCommit).click();
		commitSignIn.click();
	

	}
	
	

	
	
	
	
	
}
