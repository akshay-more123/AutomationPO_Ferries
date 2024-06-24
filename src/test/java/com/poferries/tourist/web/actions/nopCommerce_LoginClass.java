package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class nopCommerce_LoginClass {

	@FindBy(xpath= "//a[normalize-space()='Log in']")
	public WebElement login;

	@FindBy(xpath= "//input[@id='Email']")
	public WebElement emailEditbox;

	@FindBy(xpath= "//input[@id='Password']")
	public WebElement passwordEditbox;
	
	@FindBy(xpath= "//button[normalize-space()='Log in']")
	public WebElement lgn_Button;
	
	@FindBy(xpath= "//a[@class='ico-account']")
	public WebElement acc_Button;
	
	@FindBy(xpath= "//h2[normalize-space()='Welcome to our store']")
	public WebElement welcome_msg;
	
	@FindBy(xpath= "//div[@class='message-error validation-summary-errors']")
	public WebElement Error_msg;
	
	
	
	
	
	
	//************************************************
	
	ConfigReader configReader = new ConfigReader();
	Actions WebTestActions;

	// Constructor initialising the page factory elements
	public nopCommerce_LoginClass(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}
	
	public boolean NavigateToLogin(){
		return WebTestActions.clickElement(login);
	}

	// method clicks the logout link
	public void enterEmail(String Email) {
		//logOutLink.click();
		emailEditbox.sendKeys(Email);
	}
	
	public void enterPassword(String pwd) {
		
		passwordEditbox.sendKeys(pwd);
}
	
	public boolean clickOnLogin() {
		return WebTestActions.clickElement(lgn_Button);
		
}
	public void acc_buttonIsVisible() {
		
		acc_Button.isDisplayed();
}
	public void getWelcomeMassage()
	{
		String msg = welcome_msg.getText();
		System.out.println("the welcome msg is"+ " "+"........."+msg);
	}
	
	public void getErrorMassage()
	{
		String msg = Error_msg.getText();
		System.out.println("the welcome msg is"+ " "+"........."+msg);
	}
}
