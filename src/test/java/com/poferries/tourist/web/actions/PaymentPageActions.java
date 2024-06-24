package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.web.actions.Actions;

public class PaymentPageActions {
	
	@FindBy(how = How.ID, using = "amount")
	public WebElement paymentAmount;

	@FindBy(how = How.ID, using = "billingAddressName")
	public WebElement billingAddressName;

	@FindBy(how = How.ID, using = "billingAddressLine1")
	public WebElement billingAddressLine1;

	@FindBy(how = How.ID, using = "billingAddressLine2")
	public WebElement billingAddressLine2;

	@FindBy(how = How.ID, using = "billingAddressCity")
	public WebElement billingAddressCity;

	@FindBy(how = How.ID, using = "billingAddressCounty")
	public WebElement billingAddressCountry;

	@FindBy(how = How.ID, using = "billingAddressPostCode")
	public WebElement billingAddressPostCode;

	@FindBy(how = How.ID, using = "btnCancel")
	public WebElement paymentCancel;

	@FindBy(how = How.ID, using = "btnSubmit")
	public WebElement paymentPayNow;

	@FindBy(how = How.ID, using = "cardNumber")
	public WebElement cardNumber;

	@FindBy(how = How.ID, using = "csc")
	public WebElement cardSecurityCode;

	@FindBy(how = How.ID, using = "expiryMonth")
	public WebElement expiryMonth;

	@FindBy(how = How.ID, using = "expiryYear")
	public WebElement expiryYear;

	@FindBy(how = How.XPATH, using = "//*[@id='message']")
	public WebElement invalidCardNumberText;
	
	//***********************************************************

	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public PaymentPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// the below method selects the expiry month from the month drop down
	public void selectMonth(String monthToSelect) {
		/*Select monthDropDown = new Select(expiryMonth);
		monthDropDown.selectByVisibleText(monthToSelect);*/
		WebTestActions.SelectByVisibleText(monthToSelect, expiryMonth);
	}

	// the below method selects the expiry year from the year drop down
	public void selectYear(String yearToSelect) {
		/*Select yearDropDown = new Select(expiryYear);
		yearDropDown.selectByVisibleText(yearToSelect);*/
		WebTestActions.SelectByVisibleText(yearToSelect, expiryYear);
	}

	// the below method enters the billing card No in the card Number field
	public void enterBillingCardNo(String cardNo) {
		//cardNumber.sendKeys(cardNo);
		WebTestActions.writeText(cardNo, cardNumber);
	}

	// the below method enters the card security code in the card security code
	// field
	public void enterCardSecurityCode(String securityCode) {
		//cardSecurityCode.sendKeys(securityCode);
		WebTestActions.writeText(securityCode, cardSecurityCode);
	}

	// the below method clicks the cancel button to cancel the payment
	public void cancelPayment() {
		//paymentCancel.click();
		WebTestActions.clickElement(paymentCancel);
	}

	// the below method clicks the pay now button to proceed with the payment
	public void proceedWithPayment() {
		//paymentPayNow.click();
		WebTestActions.clickElement(paymentPayNow);
	}

	// the below method returns the payment amount displayed
	public String getPaymentAmount() {
		//return paymentAmount.getText();
		return WebTestActions.getObjectText(paymentAmount);
	}

	// the below method returns the payment amount displayed
	public String getBillingName() {
		//return billingAddressName.getText();
		return WebTestActions.getObjectText(billingAddressName);
	}

	// the below method returns the first line of the billing address
	public String getBillingAddressFirstLine() {
		//return billingAddressLine1.getText();
		return WebTestActions.getObjectText(billingAddressLine1);
	}

	// the below method returns the second line of the billing address
	public String getBillingAddressSecondLine() {
		//return billingAddressLine2.getText();
		return WebTestActions.getObjectText(billingAddressLine2);
	}

	// the below method returns the billing city
	public String getBillingCity() {
		//return billingAddressCity.getText();
		return WebTestActions.getObjectText(billingAddressCity);
	}

	// the below method returns the billing country
	public String getBillingCountry() {
		//return billingAddressCountry.getText();
		return WebTestActions.getObjectText(billingAddressCountry);
	}

	// the below method returns the billing post code
	public String getBillingPostCode() {
		//return billingAddressPostCode.getText();
		return WebTestActions.getObjectText(billingAddressPostCode);
	}

	// the below method returns the page title
	public String getPaymentPageTitle() {
		//return Seleniumdriver.getDriver().getTitle();
		return WebTestActions.PageTitle();
	}

	// the below method waits for the card number editbox to be displayed
	public void waitForCardNumberEdit() {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(cardNumber));
		WebTestActions.waitForElementToBeVisibile(cardNumber);
	}

	// the below method returns the invalid card number details
	public String getInvalidCardDetailsMessage() {
		//return invalidCardNumberText.getText();
		return WebTestActions.getObjectText(invalidCardNumberText);
	}

	// the below method clicks on cancel on the page
	public void clickCancelPayment() {
		//paymentCancel.click();
		WebTestActions.clickElement(paymentCancel);
	}

}
