package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.UtilityMethods;
import com.web.actions.Actions;

public class BookingConfirmationPageActions {
	
	@FindBy(how = How.LINK_TEXT, using = "Sign Out")
	public WebElement logOutBtn;
//	@FindBy(how = How.LINK_TEXT, using = "Logout")
//	public WebElement logOutBtn;

	@FindBy(how = How.ID, using = "rev-vehUnitId")
	public WebElement confirmedVehicleReg;

	@FindBy(how = How.ID, using = "rev-vehLength")
	public WebElement confirmedVehicleLen;

	@FindBy(how = How.ID, using = "rev-vehHeight")
	public WebElement confirmedVehicleHeight;

	@FindBy(how = How.ID, using = "rev-vehWidth")
	public WebElement confirmedVehicleWidth;

	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']/div/div[2]/div[1]/div/div[2]/div[2]")
	public WebElement confirmedVehicleWeight;

	@FindBy(how = How.ID, using = "rev-adults")
	public WebElement confirmedPass;

	@FindBy(how = How.ID, using = "rev-netAmount")
	public WebElement confirmedNetPrice;

	@FindBy(how = How.ID, using = "rev-vatAmount")
	public WebElement confirmedVatAmount;

	@FindBy(how = How.ID, using = "rev-totalAmount")
	public WebElement confirmedTotalPrice;

	@FindBy(how = How.ID, using = "rev-returnNetAmount")
	public WebElement confirmedReturnNetPrice;

	@FindBy(how = How.ID, using = "rev-returnVatAmount")
	public WebElement confirmedReturnVatAmount;

	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']/div/div[1]/div[2]/div/p[4]/span[2]")
	public WebElement singleJourneyWaybillNo;

	@FindBy(how = How.XPATH, using = "// *[@id=\"confirm-booking\"]/div/div[1]/div[2]/div/p[5]/span[2]")
	public WebElement returnJourneyOutwardWaybillNo;

	@FindBy(how = How.XPATH, using = "// *[@id=\"confirm-booking\"]/div/div[1]/div[2]/div/p[6]/span[2]")
	public WebElement returnJourneyReturnWaybillNo;

	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']/div/div[1]/div[1]/div/div[1]/div[2]/div/span[1]")
	public WebElement confirmedRouteFrom;

	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']/div/div[1]/div[1]/div/div[1]/div[2]/div/span[2]")
	public WebElement confirmedRouteTo;

	@FindBy(how = How.ID, using = "rev-bookingRoute")
	public WebElement confirmedOnwardRoute;

	@FindBy(how = How.ID, using = "rev-returnRoute")
	public WebElement confirmedReturnRoute;

	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']/div/div[3]/div[2]/div/p[4]/span[2]")
	public WebElement confirmedPayStatus;

	@FindBy(how = How.XPATH, using = "// *[@id='confirm-booking']/div/div[3]/div[2]/div/p[2]/span[2]")
	public WebElement confirmedPayDate;

	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']/div/div[3]/div[2]/div/p[3]/span[2]")
	public WebElement confirmedPayType;

	@FindBy(how = How.LINK_TEXT, using = "Go To Home")
	public WebElement goToHomeLink;

	@FindBy(how = How.LINK_TEXT, using = "New Booking")
	public WebElement newBookingLink;

	@FindBy(how = How.XPATH, using = "//*[@id=\'confirm-booking\']/div/div/div/div/p[2]/span[2]")
	public WebElement paymentCancelledError;

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-orange text-white ml-3']")
	public WebElement amendBookingLink;

	@FindBy(how = How.ID, using = "PaySuccessSurveyCancel")

	public WebElement paySurveyNoThanks;

	@FindBy(how = How.ID, using = "SurveyModal")
	public WebElement paySurveyPopup;

	@FindBy(how = How.XPATH, using = "//*[@id=\"SurveyModal\"]/div/div/div[1]/h5")
	public WebElement paySurveyText;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/h2")
	public WebElement amendBookingHeader;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/p[1]")
	public WebElement amendBookingMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div[1]/div/div[1]/span")
	public WebElement amendBookingPortOffice;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div[1]/div/div[2]/span")
	public WebElement amendBookingOpenTiming;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div[1]/div/p[1]")
	public WebElement amendBookingTelephoneNo;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div[1]/div/p[2]/a")
	public WebElement amendBookingEmailAddress;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/p[3]")
	public WebElement amendBookingSecondMessage;

	@FindBy(how = How.LINK_TEXT, using = "Back")
	public WebElement amendBookingBack;
	
	//********************************************************

	ConfigReader configReader = new ConfigReader();
	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public BookingConfirmationPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// The below method returns the vehicle reg from the booking confirmation
	// page
	public String getConfirmedVehicleReg() {
		//return confirmedVehicleReg.getText();
		return WebTestActions.getObjectText(confirmedVehicleReg);
	}

	// The below method returns the vehicle length from the booking confirmation
	// page
	public String getConfirmedVehicleLength() {
		//return confirmedVehicleLen.getText();
		return WebTestActions.getObjectText(confirmedVehicleLen);
	}

	// The below method returns the vehicle height from the booking confirmation
	// page
	public String getConfirmedVehicleHeight() {
		//return confirmedVehicleHeight.getText();
		return WebTestActions.getObjectText(confirmedVehicleHeight);
	}

	// The below method returns the vehicle width from the booking confirmation
	// page
	public String getConfirmedVehicleWidth() {
		//return confirmedVehicleWidth.getText();
		return WebTestActions.getObjectText(confirmedVehicleWidth);
	}

	// The below method returns the vehicle weight from the booking confirmation
	// page
	public String getConfirmedVehicleWeight() {
		// using substring to get the weight as 44 tons text is currently not present in
		// the right tag
		//return confirmedVehicleWeight.getText().substring(confirmedVehicleWeight.getText().length() - 7);
		return WebTestActions.getObjectText(confirmedVehicleWeight).substring(confirmedVehicleWeight.getText().length() - 7);
	}

	// The below method returns the number of passengers from the booking
	// confirmation page
	public String getConfirmedPass() {
		//return confirmedPass.getText();
		return WebTestActions.getObjectText(confirmedPass);
	}

	// The below method returns the confirmed net price from the booking
	// confirmation page
	public String getConfirmedNetPrice() {
		//return confirmedNetPrice.getText();
		return WebTestActions.getObjectText(confirmedNetPrice);
	}

	// The below method returns the confirmed VAT Amount from the booking
	// confirmation page
	public String getConfirmedVATAmount() {
		//return confirmedVatAmount.getText();
		return WebTestActions.getObjectText(confirmedVatAmount);
	}

	// The below method returns the confirmed total price from the booking
	// confirmation page
	public String getConfirmedTotalPrice() {
		//return confirmedTotalPrice.getText();
		return WebTestActions.getObjectText(confirmedTotalPrice);
	}

	// The below method returns the return waybill No
	public String getReturnWaybillNo() {
		//return returnJourneyReturnWaybillNo.getText();
		return WebTestActions.getObjectText(returnJourneyReturnWaybillNo);
	}

	// The below method returns the confirmed pay status from the booking
	// confirmation page
	public String getConfirmedPayStatus() {
		//return confirmedPayStatus.getText();
		return WebTestActions.getObjectText(confirmedPayStatus);
	}

	// The below method returns the confirmed route from the booking
	// confirmation page
	public String getConfirmedRoute() {
		//return confirmedRouteFrom.getText() + " " + "to" + " "+ confirmedRouteTo.getText();
		return WebTestActions.getObjectText(confirmedRouteFrom) + " " + "to" + " "+ WebTestActions.getObjectText(confirmedRouteTo);
	}

	// The below method returns the onward journey from the review booking page
	public String getOnwardJourney() {
		//return confirmedOnwardRoute.getText();
		return WebTestActions.getObjectText(confirmedOnwardRoute);
	}

	// The below method returns the destination port from the review booking page
	public String getReturnJourney() {
		//return confirmedReturnRoute.getText();
		return WebTestActions.getObjectText(confirmedReturnRoute);
	}

	// The below method returns the confirmed route from the booking
	// confirmation page
	public String getConfirmedPayDate() {
		//return confirmedPayDate.getText();
		return WebTestActions.getObjectText(confirmedPayDate);
	}

	// The below method returns the confirmed route from the booking
	// confirmation page
	public String getConfirmedPayType() {
		//return confirmedPayType.getText();
		return WebTestActions.getObjectText(confirmedPayType);
	}

	// the below method returns the page title of the booking confirmation page
	public String getBookingConfirmationPageTitle() {
		//return Seleniumdriver.getDriver().getTitle();
		return WebTestActions.PageTitle();
	}

	// The below method clicks the Go To Home Link
	public void clickGoToHomeLink() {
		//goToHomeLink.click();
		WebTestActions.clickElement(goToHomeLink);
	}

	// the below function gets the payment cancellation error message
	public String getPaymentCancellationError() {
		//return paymentCancelledError.getText();
		return WebTestActions.getObjectText(paymentCancelledError);
	}

	// the below method waits for the amend booking link to be displayed
	public void waitForAmendBookingsLink() throws Throwable {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(amendBookingLink));
		WebTestActions.waitForElementToBeVisibile(amendBookingLink);
	}

	// method to enter the login details and click the signIn Link
	public void logoutFromApplication() {
		//logOutBtn.click();
		WebTestActions.clickElement(logOutBtn);
	}

	// the below method checks if the payment success pop up is displayed
	public boolean isPaymentSuccessSurveyPopupDisplayed() throws InterruptedException {

		boolean isPopUpDisplayed = false;
		int count = 0;
		boolean exitLoop = false;

		do {

			if (paySurveyPopup.getAttribute("class")
					.equalsIgnoreCase("modal fade show")) {
				isPopUpDisplayed = true;
			}

			Thread.sleep(1000);
			count++;

			if (isPopUpDisplayed == true || count > 10) {
				exitLoop = true;
			}

		} while (exitLoop == false);

		return isPopUpDisplayed;

	}

	// the below method closes the payment success survey pop up
	public void closePaymentSuccessSurveyPopup() throws InterruptedException {
		/*paySurveyNoThanks.click();
		Thread.sleep(2000);*/
		WebTestActions.clickElement(paySurveyNoThanks);
	}

	// the below method clicks on the amend booking link
	public void clickAmendBookingLink() {
		//amendBookingLink.click();
		WebTestActions.clickElement(amendBookingLink);
	}

	// the below method waits for the amend booking link to be displayed
	public void waitForAmendBookingPage() throws Throwable {

		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(amendBookingHeader));
		WebTestActions.waitForElementToBeVisibile(amendBookingHeader);
	}

	// the below method returns the amend booking message
	public String getAmendBookingMessage() {
		//return amendBookingMessage.getText();
		return WebTestActions.getObjectText(amendBookingMessage);
	}

	// the below method returns the amend Booking Port Office.
	public String getAmendBookingPortOffice() {
		//return amendBookingPortOffice.getText();
		return WebTestActions.getObjectText(amendBookingPortOffice);
	}

	// the below method returns the amend Booking Open timing.
	public String getAmendBookingTelephoneNo() {
		//return amendBookingTelephoneNo.getText();
		return WebTestActions.getObjectText(amendBookingTelephoneNo);
	}

	// the below method returns the amend Booking email address.
	public String getAmendBookingEmailAddress() {
		//return amendBookingEmailAddress.getText();
		return WebTestActions.getObjectText(amendBookingEmailAddress);
	}

	// the below method returns the amend Booking second message
	public String getAmendBookingSecondMessage() {
		//return amendBookingSecondMessage.getText();
		return WebTestActions.getObjectText(amendBookingSecondMessage);
	}

	// the below method returns the amend Booking second message
	public String getAmendBookingOpenTiming() {
		//return amendBookingOpenTiming.getText();
		return WebTestActions.getObjectText(amendBookingOpenTiming);
	}

	// the below method clicks the back link on the amend booking page
	public void clickBackOnAmendBookingPage() {
		//amendBookingBack.click();
		WebTestActions.clickElement(amendBookingBack);
	}

	// the below method moves to the pay status
	public void moveToPayStatus() {
		UtilityMethods.moveToElement(confirmedPayStatus);
	}

}
