package com.runner;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.homepage.HomePage;
import com.loginpage.LoginPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "features", glue="com.stepdef",


plugin= {"pretty", "junit:target/cucum.xml", "json:target/cucumber.json","html:target/index.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class testRunner
{
//	@Test
//	public void runner() throws InterruptedException 
//	{
//		String url="https://github.com/";
//		HomePage hp=new HomePage();
//		hp.loadUrl(url);
//		hp.signHandle();
//		hp.tearDown();
//		LoginPage lp=new LoginPage();
//		lp.loadUrl("https://github.com/login");
//		lp.userName("Sathishreddysandhi1995@gmail.com");
//		lp.password("Raju@Rani12");
//		lp.LoginsignIn();
//		lp.tearDown();
//		}
	
	
}
