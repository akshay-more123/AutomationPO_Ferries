package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.web.actions.Actions;

public class PaymentFailurePageActions {
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"confirm-booking\"]/p/a[1]")
	public WebElement goToHomeButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"confirm-booking\"]/p/a[2]")
	public WebElement newBookingButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"confirm-booking\"]/div/div/div/div/div")
	public WebElement paymentFailureMessage;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-secondary float-left'")
	public WebElement surveyNoThanks;
	
	//*********************************************

	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());
	
	// Constructor initialising the page factory elements
	public PaymentFailurePageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// the below method waits for the Go To Home Button to be displayed
	public void waitForGoToHomeButton() {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(goToHomeButton));
		WebTestActions.waitForElementToBeVisibile(goToHomeButton);
	}

	// The below method clicks on the Go To Home Button
	public void clickOnGoToHomeButton() {
		//goToHomeButton.click();
		WebTestActions.clickElement(goToHomeButton);
	}

	// The below method retrieves the payment failure message
	public String getPaymentFailureMessage() {
		//return paymentFailureMessage.getText();
		return WebTestActions.getObjectText(paymentFailureMessage);
	}

	// The below method closes the survey popup
	public void closeSurveyPopup() {
		//surveyNoThanks.click();
		WebTestActions.clickElement(surveyNoThanks);
	}

}
