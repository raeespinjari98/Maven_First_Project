package com.Shopping.TestPages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Shopping.TestBase.TestBase;

public class HomePage extends TestBase 
{
	// Locate element on web pages on which you want to perform testing
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Products;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement Cart;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement loginelement;

	@FindBy(xpath = "//h2[contains(text(),'Category')]")
	WebElement cate;

	@FindBy(xpath = "//p[@class='pull-left']")
	WebElement CopyRight;
	
	// Create page class constructor for element initialization 
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Action you want to perform
	public void clickonhomelink() 
	{
		home.click();
	}
	
	
	// HomePage verification 1 way
	public String verifytitle() 
	{
		String title = driver.getTitle();
		return title;
	}

	
	// HomePage verification 2 way
	public boolean verifyhomepage() 
	{
		boolean catedis = cate.isDisplayed();
		return catedis;
	}

	// CopyRight verification
	public boolean verifyCopyRightHomePage()
	{
	boolean	copyright=CopyRight.isDisplayed();
	return copyright;
	}
	
	// Landing on LoginPage 
	public LoginPage clickonlogin()
	{
		loginelement.click();
		return new LoginPage();
	}
	
	
}
