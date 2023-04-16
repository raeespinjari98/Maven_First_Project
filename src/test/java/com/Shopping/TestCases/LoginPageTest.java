package com.Shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.TestBase.TestBase;
import com.Shopping.TestPages.HomePage;
import com.Shopping.TestPages.LoginPage;

public class LoginPageTest extends TestBase
{
	HomePage home;
	LoginPage loginp;
	
	
	// Create test class constructor for for getting all properties of parent HomePage class using super keyword
	public LoginPageTest() 
	{
		super();
	}

	@BeforeMethod
	void setUp() 
	{
		intilization();
		home = new HomePage();
		loginp = new LoginPage();
	}
	
	
	@Test(priority = 0)
	void verifyvalidlogin()
	{	
		loginp=new LoginPage();
		loginp=home.clickonlogin();
		
		// Create object of LoginPageTest and call login method from LoginPage class
		loginp.login(prop.getProperty("username"),prop.getProperty("password"));
	}
		
	@Test(priority = 1)
	void verifyURL()
	{
		String expectedurl="https://automationexercise.com/";
		
		String actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl,actualurl);
	}
	

	@Test(priority = 2)
	void LogoTest()
	{
		boolean flag=loginp.LogoValidate();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	void teardown() 
	{
		driver.quit();
	}

}
