package com.stepdef;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import com.homepage.HomePage;

import com.loginpage.LoginPage;

import io.cucumber.java.After;

import io.cucumber.java.AfterStep;

import io.cucumber.java.Scenario;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;


public class LoginStepDef 
{
	LoginPage lp;
	Properties prop;
	
	@Given("User has to be on the GitHub Login Page")
	public void user_has_to_be_on_the_git_hub_login_page() throws FileNotFoundException, IOException
	{
		prop=new Properties();
		prop.load(new FileInputStream("\\Users\\SSANDHI\\AHybridFW\\src\\test\\resources\\config\\cucum.properties"));
		lp=new LoginPage();
		lp.loadUrl(prop.getProperty("url"));
		}
	
//	@When("User needs to enter {string} and {string}")
//	public void user_needs_to_enter_and(String string, String string2) throws InterruptedException 
//	{
//		lp.UserName(prop.getProperty("uname"));
//		lp.password(prop.getProperty("pwd"));
//		
//	}
	@When("User needs to enter username and password") 
	public void user_needs_to_enter_username_and_password() throws InterruptedException {
		lp.UserName(prop.getProperty("uname"));
		lp.password(prop.getProperty("pwd"));
		}

	@When("User need to click on Signin button")
	public void user_need_to_click_on_signin_button() throws InterruptedException
	{
		lp.LoginsignIn();
	
	}
	

	@After
	public void addScreenshot(Scenario scenario)
	{
		final byte[] screenshot = ((TakesScreenshot) lp.driver).getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
	}
}
