package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class Account_Registration {

	@FindBy(xpath= "//a[normalize-space()='Register']")
	public WebElement register_btn;

	@FindBy(xpath= "//label[normalize-space()='Male']")
	public WebElement radio_btn;

	@FindBy(xpath= "//input[@id='FirstName']")
	public WebElement First_Name;
	
	@FindBy(xpath= "//input[@id='LastName']")
	public WebElement Last_Name;
	
	@FindBy(xpath= "//select[@name='DateOfBirthDay']")
	public WebElement Day;
	
	@FindBy(xpath= "//select[@name='DateOfBirthMonth']")
	public WebElement Month;
	
	@FindBy(xpath= "//select[@name='DateOfBirthYear']")
	public WebElement Year;
	
	@FindBy(xpath= "//input[@id='Email']")
	public WebElement Email;
	
	@FindBy(xpath= "//input[@id='Password']")
	public WebElement Password;
	
	@FindBy(xpath= "//input[@id='ConfirmPassword']")
	public WebElement cnfPassword;
	
	@FindBy(xpath= "//button[@id='register-button']")
	public WebElement reg_Button;
	
	@FindBy(xpath= "//div[@class='result']")
	public WebElement successfull_msg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	//************************************************
	
	ConfigReader configReader = new ConfigReader();
	Actions WebTestActions;

	// Constructor initialising the page factory elements
	public Account_Registration(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}
	
	public boolean NavigateToRegister(){
		return WebTestActions.clickElement(register_btn);
	}
	
	public boolean clickOnRadioButton(){
		return WebTestActions.clickElement(radio_btn);
	}
	
	public void enterFirstName(String fname) {
	
		First_Name.sendKeys(fname);
	}
	
	public void enterLastName(String lastName) {
		
		Last_Name.sendKeys(lastName);
	}
		
	public void selectBirthDate() {
			
	  //select date
	  Select day = new Select(Day);
	  day.selectByVisibleText("4");
	  
	  //select month
	  Select month = new Select(Month);
	  month.selectByVisibleText("February");
	  
	  //select year
	  Select year = new Select(Year);
	  year.selectByVisibleText("1998");
		
		
	}
	
	public void enterEmail(String email) {
		
		Email.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		
		Password.sendKeys(pass);
	}
	
	public void enterConfirmPassword(String cnfPass) {
		
		cnfPassword.sendKeys(cnfPass);
	}
	
	public boolean clickOnRegisterButton(){
		return WebTestActions.clickElement(reg_Button);
	}
	
public void verifySuccessfulMassage() {
		
		String msg = successfull_msg.getText();
		System.out.println("the successful massage is" + "......"+msg);
	}
	
}
