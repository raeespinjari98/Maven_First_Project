package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shopping.TestBase.TestBase;

public class LoginPage extends TestBase
{
	// Locate element on web pages on which you want to perform testing/ Page Factory
	@FindBy(xpath="//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
	WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement psw;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement lgnbutn;
	
	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	WebElement Logo;
	
	// Create page class constructor for element initialization 
	public LoginPage()
	{
		 PageFactory.initElements(driver,this);
	}
	
	
	// Logo verification 
	public boolean LogoValidate() 
	{
		boolean logo = Logo.isDisplayed();
		return logo;
	}
	
	
	// Action you want to perform
	public HomePage login(String uname, String pword)
	{
		username.sendKeys(uname);
		psw.sendKeys(pword);
		lgnbutn.click();	
		return new HomePage();
	}


}
