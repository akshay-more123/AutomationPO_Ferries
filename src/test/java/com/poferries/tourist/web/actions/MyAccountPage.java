package com.poferries.tourist.web.actions;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class MyAccountPage {

	
	@FindBy(xpath= "//a[@class='ico-account']")
	public WebElement acc_Text;
	
	@FindBy(xpath= "//a[normalize-space()='Log out']")
	public WebElement logout_btn;
	
	
	//************************************************
	
		ConfigReader configReader = new ConfigReader();
		Actions WebTestActions;

		// Constructor initialising the page factory elements
		public MyAccountPage(Actions WebTestActions) {
			this.WebTestActions = WebTestActions;
			PageFactory.initElements(WebTestActions.driver, this);
		}
	
	
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (acc_Text.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		logout_btn.click();

	}
	

}


