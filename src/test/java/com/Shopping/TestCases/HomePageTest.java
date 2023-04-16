package com.Shopping.TestCases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Shopping.TestBase.TestBase;
import com.Shopping.TestPages.HomePage;

public class HomePageTest extends TestBase 
{
	HomePage home;

	// Create test class constructor for for getting all properties of parent HomePage class using super keyword
	public HomePageTest() 
	{
		super();
	}

	@BeforeMethod
	void setUp() 
	{
		intilization();
		home = new HomePage();
	}
	

	@Test(priority = 0)
	void verifyPageTitle() 
	{

		String ExpectedTitle = "Automation Exercise";
		
		String ActualTitle = home.verifytitle();											

		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	

	@Test(priority = 1)
	void verifyHomePageLanding() 
	{
		boolean elementvisible = home.verifyhomepage();

		Assert.assertEquals(true, elementvisible);
		
	}
	
	
	@Test(priority = 2)
	void verifyCopyRightHomePage()
	{
	boolean	elementvisible=home.verifyCopyRightHomePage();
	
	Assert.assertEquals(true, elementvisible);
	}
	

	@AfterMethod
	void teardown() 
	{
		driver.quit();
	}

}
