package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.web.actions.Actions;

public class GetQuotePageActions {
	
	@FindBy(how = How.ID, using = "StepThreeBack")
	public WebElement reviewBookingBack;

	@FindBy(how = How.ID, using = "rev-vehWidth")
	public WebElement reviewVehicleWidth;

	@FindBy(how = How.ID, using = "rev-vehWeight")
	public WebElement reviewVehicleWeight;

	@FindBy(how = How.ID, using = "rev-adults")
	public WebElement reviewPass;

	@FindBy(how = How.ID, using = "rev-routeFrom")
	public WebElement reviewRouteFrom;

	@FindBy(how = How.ID, using = "rev-routeTo")
	public WebElement reviewRouteTo;

	@FindBy(how = How.ID, using = "rev-bookingRoute")
	public WebElement reviewOnwardRoute;

	@FindBy(how = How.ID, using = "rev-returnRoute")
	public WebElement reviewReturnRoute;

	@FindBy(how = How.ID, using = "rev-netAmount")
	public WebElement reviewNetPrice;

	@FindBy(how = How.ID, using = "rev-vatAmount")
	public WebElement reviewVatAmount;

	@FindBy(how = How.ID, using = "rev-returnNetAmount")
	public WebElement reviewReturnNetPrice;

	@FindBy(how = How.ID, using = "rev-returnVatAmount")
	public WebElement reviewReturnVatAmount;

	@FindBy(how = How.ID, using = "rev-totalAmount")
	public WebElement reviewTotalPrice;

	@FindBy(how = How.ID, using = "rev-vehUnitId")
	public WebElement reviewVehicleReg;

	@FindBy(how = How.ID, using = "rev-vehLength")
	public WebElement reviewVehicleLen;

	@FindBy(how = How.ID, using = "rev-vehHeight")
	public WebElement reviewVehicleHeight;

	@FindBy(how = How.ID, using = "BillingAddrCB")
	public WebElement billingAddrChk;

	@FindBy(how = How.ID, using = "PaymentTermsCheckBox")
	public WebElement paymentTermsChk;

	@FindBy(how = How.ID, using = "proceedToPayBtn")
	public WebElement proceedToPayBtn;
	
	//**************************************************

	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public GetQuotePageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// The below method returns the vehicle reg from the review booking page
	public String returnVehicleReg() {
		//return reviewVehicleReg.getText();
		return WebTestActions.getObjectText(reviewVehicleReg);
	}

	// The below method returns the vehicle length from the review booking page
	public String returnVehicleLength() {
		//return reviewVehicleLen.getText();
		return WebTestActions.getObjectText(reviewVehicleLen);
	}

	// The below method returns the vehicle height from the review booking page
	public String returnVehicleHeight() {
		//return reviewVehicleHeight.getText();
		return WebTestActions.getObjectText(reviewVehicleHeight);
	}

	// The below method returns the vehicle width from the review booking page
	public String returnVehicleWidth() {
		//return reviewVehicleWidth.getText();
		return WebTestActions.getObjectText(reviewVehicleWidth);
	}

	// The below method returns the vehicle weight from the review booking page
	public String returnVehicleWeight() {
		//return reviewVehicleWeight.getText().substring(reviewVehicleWeight.getText().length() - 7);
		return WebTestActions.getObjectText(reviewVehicleWeight).substring(reviewVehicleWeight.getText().length() - 7);
	}

	// The below method returns the number of passengers from the review booking
	// page
	public String returnPass() {
		//return reviewPass.getText();
		return WebTestActions.getObjectText(reviewPass);
	}

	// The below method returns the departure port from the review booking page
	public String returnDeparturePort() {
		//return reviewRouteFrom.getText();
		return WebTestActions.getObjectText(reviewRouteFrom);
	}

	// The below method returns the destination port from the review booking
	// page
	public String returnArrivalPort() {
		//return reviewRouteTo.getText();
		return WebTestActions.getObjectText(reviewRouteTo);
	}

	// The below method returns the onward journey from the review booking page
	public String getOnwardJourney() {
		//return reviewOnwardRoute.getText();
		return WebTestActions.getObjectText(reviewOnwardRoute);
	}

	// The below method returns the destination port from the review booking page
	public String getReturnJourney() {
		//return reviewReturnRoute.getText();
		return WebTestActions.getObjectText(reviewReturnRoute);
	}

	// The below method returns the destination port from the review booking
	// page
	public String returnNetPrice() {
		//return reviewNetPrice.getText();
		return WebTestActions.getObjectText(reviewNetPrice);
	}

	// The below method returns the destination port from the review booking
	// page
	public String returnVATAmount() {
		//return reviewVatAmount.getText();
		return WebTestActions.getObjectText(reviewVatAmount);
	}

	// The below method returns the return net price from the review booking
	// page
	public String getReturnNetPrice() {
		//return reviewReturnNetPrice.getText();
		return WebTestActions.getObjectText(reviewReturnNetPrice);
	}

	// The below method returns the return vat amount from the review booking
	// page
	public String getReturnVATAmount() {
		//return reviewReturnVatAmount.getText();
		return WebTestActions.getObjectText(reviewReturnVatAmount);
	}

	// The below method returns the destination port from the review booking
	// page
	public String returnTotalPrice() {
		//return reviewTotalPrice.getText();
		return WebTestActions.getObjectText(reviewReturnVatAmount);
	}

	// The below method clicks the proceed to payment Button
	public void clickProceedToPayBtn() {
		//proceedToPayBtn.click();
		WebTestActions.clickElement(proceedToPayBtn);
	}

	// the below method clicks the back button on the review bookings page
	public void clickBackReviewBookings() {
		//reviewBookingBack.click();
		WebTestActions.clickElement(reviewBookingBack);
	}

	// The below method clicks the Billing Address Checkbox
	public void clickBillingAddressCheckBox() {
		//billingAddrChk.click();
		WebTestActions.clickElement(billingAddrChk);
	}

	// the below method clicks the agree terms checkBox
	public void clickAgreeTermsCheckBox() {
		//paymentTermsChk.click();
		WebTestActions.clickElement(paymentTermsChk);
	}

	// the below method checks if terms and conditions Checkbox is displayed
	public boolean isTermsConditionsDisplayed() {
		//return paymentTermsChk.isDisplayed();
		return WebTestActions.VerifyObjectIsDisplayed(paymentTermsChk);
	}

	// the below method waits for the terms and conditions check box to be displayed
	public void waitForTermsConditionsChk() {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(paymentTermsChk));
		WebTestActions.waitForElementToBeVisibile(paymentTermsChk);
	}

}
