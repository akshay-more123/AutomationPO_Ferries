package com.poferries.tourist.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class LandingPageActions {
	
	@FindBy(how = How.LINK_TEXT, using = "Sign In")
	public WebElement signInLink;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public WebElement registerLink;

	@FindBy(how = How.ID, using = "SmartAppCloseWeb")
	public WebElement closeStoreLink;

	@FindBy(how = How.XPATH, using = "//a[@href='#mobileMenu'][@class='menuMobile']")
	public WebElement Menulink;
	
	@FindBy(how = How.LINK_TEXT, using = "Book Now")
	public WebElement bookNowLink;
//	@FindBy(how = How.XPATH, using = "//a[@href='/Login'][@class='likeButton']")
//	public WebElement bookNowLink;
	
	
	Actions WebTestActions;
	//LandingPageLocators landingPageLocators = null;
	ConfigReader configReader = new ConfigReader();

	// Constructor initialising the page factory elements
	public LandingPageActions(Actions WebTestActions) {
		/*this.landingPageLocators = new LandingPageLocators();
		PageFactory.initElements(Seleniumdriver.getDriver(), landingPageLocators);*/
		this.WebTestActions = WebTestActions;
		//WebTestActions = new Actions(DriverType.ChromeDriver);
	    PageFactory.initElements(WebTestActions.driver, this);
	}

	// method to navigate to the user LogIn Page
	public void clickOnSignInLink() {
		//landingPageLocators.signInLink.click();
		WebTestActions.clickElement(signInLink);
	}

	// the below method returns the title of the landing Page
	public String getLandingPageTitle() {
		//return Seleniumdriver.getDriver().getTitle();
		return WebTestActions.PageTitle();
	}

	// wait for the SignIn Link to appear
	public void waitForSignInLink() throws TimeoutException {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(landingPageLocators.signInLink));
		WebTestActions.waitForElementToBeClickable(signInLink);
	}

	// method to click the Book Now link
	public void clickOnBookNowLink() {	
		//landingPageLocators.bookNowLink.click();
		WebTestActions.clickElement(bookNowLink);
	}

	// wait for the BookNow Link to appear
	public void waitForBookNowLink() {
		//WebTestActions.getWaitDriver().until(ExpectedConditions.elementToBeClickable(bookNowLink));
		WebTestActions.waitForElementToBeClickable(bookNowLink);
	}
	public void Menulink() {
		WebTestActions.clickElement(Menulink);
	}
	public void waitForMenulink() {
		//WebTestActions.getWaitDriver().until(ExpectedConditions.elementToBeClickable(bookNowLink));
		WebTestActions.waitForElementToBeClickable(Menulink);
	}
}
	
	
