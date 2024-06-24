package com.poferries.tourist.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OutlookPageLocators {

	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	public WebElement EmailInput;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	public WebElement submitBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//input[@aria-label='Search']")
	public WebElement SearchInput;
	
	@FindBy(how = How.XPATH, using = "//button[@aria-label='Search']/span/i")
	public WebElement SearchBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@aria-label='Select a conversation']//i[@data-icon-name='StatusCircleCheckmark']")
	public WebElement SelectConversation;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Text +XX ')]")
	public WebElement SelectMobile;
	
	@FindBy(how = How.XPATH, using = "//input[@name='otc']")
	public WebElement InputMobileOTP;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Not now']")
	public WebElement NotnowLink;
	
}
