package com.poferries.tourist.web.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.Seleniumdriver;
import com.web.actions.Actions;

public class BookNowPageActions {
	
	@FindBy(how = How.ID, using = "route")
	public WebElement routeDropDown;

	@FindBy(how = How.ID, using = "UserDefCurrency")
	public WebElement currencyDropDown;

	@FindBy(how = How.ID, using = "UserDefCountry")
	public WebElement originCountryDropDown;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	public WebElement logOutLink;

	@FindBy(how = How.ID, using = "passengerAdults")
	public WebElement noPassengersDropDown;

	@FindBy(how = How.ID, using = "StepOneContinue")
	public WebElement routeSelectionContinue;

	@FindBy(how = How.ID, using = "goods")
	public WebElement dangerousGoodsChk;

	@FindBy(how = How.ID, using = "pets")
	public WebElement petsChk;

	@FindBy(how = How.ID, using = "goodsCheckBoxTxt")
	public WebElement goodsChkTxt;

	@FindBy(how = How.ID, using = "petsCheckBoxTxt")
	public WebElement petsChkTxt;

	@FindBy(how = How.ID, using = "HeaderDefVals")
	public WebElement lengthLanguageLabel;

	@FindBy(how = How.ID, using = "UserDefCurrency")
	public WebElement currencySelect;

	@FindBy(how = How.ID, using = "SaveUserMeasures")
	public WebElement languageCurrencySave;

	@FindBy(how = How.ID, using = "CloseUserMeasures")
	public WebElement languageCurrencyClose;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/span")
	public WebElement dangerousPetsMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/span")
	public WebElement dangerousGoodsMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[1]/span")
	public WebElement dangerousGoodsPort;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[1]/span")
	public WebElement petsPort;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[2]/span")
	public WebElement dangerousGoodsTiming;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[2]/span")
	public WebElement petsTiming;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[1]/a")
	public WebElement dangerousGoodsTelephoneNo;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[1]/a")
	public WebElement PetsTelephoneNo;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[2]/a")
	public WebElement dangerousGoodsEmail;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[2]/a")
	public WebElement petsEmail;

	@FindBy(how = How.LINK_TEXT, using = "Back")
	public WebElement dangerousGoodsPetsBack;

	@FindBys({ @FindBy(how = How.NAME, using = "journeytype") })
	public List<WebElement> journeyType;

	//****************************************************
	
	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public BookNowPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// the below method returns the BookNow page title
	public String getBookNowPageTitle() {
		return Seleniumdriver.getDriver().getTitle();
	}

	// the below method selects the route from the route drop down
	public void selectRoute(String routeToSelect) {
		/*Select routeDropDown = new Select(routeDropDown);
		routeDropDown.selectByVisibleText(routeToSelect);*/
		WebTestActions.SelectByVisibleText(routeToSelect, routeDropDown);
	}

	// the below method checks if vehicle Reg field is displayed
	public boolean isRouteDropDownDisplayed() {
		//return routeDropDown.isDisplayed();
		return WebTestActions.VerifyObjectIsDisplayed(routeDropDown);
	}

	// the below method clicks the radio button concerning the journey type
	/*public void selectJourneyType(String journeyType) throws InterruptedException {

		// wait till the element is ready
		/*Seleniumdriver.getWaitDriver()
				.until(ExpectedConditions.elementToBeClickable(journeyType.get(0)));
		WebTestActions.waitForElementToBeClickable(journeyType.);

		// based on the journey type click the one way or return journey types
		if (journeyType.equalsIgnoreCase("oneway")) {
			journeyType.get(0).click();
		} else if (journeyType.equalsIgnoreCase("return")) {
			journeyType.get(1).click();
		}

	}*/

	// the below method selects the number of passengers from the passengers
	// drop down
	public void selectNoOfPassengers(String noPassengers) {
		/*Select passDropDown = new Select(noPassengersDropDown);
		passDropDown.selectByVisibleText(noPassengers);*/
		WebTestActions.SelectByVisibleText(noPassengers, noPassengersDropDown);
	}

	// the below method selects the currency from the drop down
	public void selectCurrencyFromDropDown(String currency) {
		/*Select currencyDropDown = new Select(currencyDropDown);
		currencyDropDown.selectByVisibleText(currency);*/
		WebTestActions.SelectByVisibleText(currency, currencyDropDown);
	}

	// the below method selects the country of origin from the drop down
	public void selectCountryOfOriginFromDropDown(String country) {
		/*Select countryDropDown = new Select(originCountryDropDown);
		countryDropDown.selectByVisibleText(country);*/
		WebTestActions.SelectByVisibleText(country, originCountryDropDown);
	}

	// the below method clicks the dangerous goods check box based on what
	// input value has been provided
	public void makeDangerousGoodsSelection(String yesNo) {

		String currentSelection = WebTestActions.getObjectText(goodsChkTxt); //goodsChkTxt.getText();
		if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("YES")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("NO")) {
			WebTestActions.clickElement(goodsChkTxt); //goodsChkTxt.click();
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("NO")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("YES")) {
			WebTestActions.clickElement(goodsChkTxt); //goodsChkTxt.click();
		}

	}

	// the below method clicks the pets check box based on what input has been
	// provided
	public void makePetsSelection(String yesNo) {
		String currentSelection = WebTestActions.getObjectText(petsChkTxt); //petsChkTxt.getText();
		if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("YES")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("NO")) {
			WebTestActions.clickElement(petsChkTxt); //petsChkTxt.click();
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("NO")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("YES")) {
			WebTestActions.clickElement(petsChkTxt); //petsChkTxt.click();
		}

	}

	// The below method clicks the continue button on form1
	public void clickContinueRouteSelect() {
		//routeSelectionContinue.click();
		WebTestActions.clickElement(routeSelectionContinue);
	}

	// The below method returns the dangerous goods & pets error message

	public String getDangerousGoodsPetsMessage(String errorMessage) throws InterruptedException {

		int loopCount = 0;
		String dangerGoodsPetsMessage = null;

		do {

			if (errorMessage.contains("pets")) {

				dangerGoodsPetsMessage = WebTestActions.getObjectText(dangerousPetsMessage); //dangerousPetsMessage.getText();
				Thread.sleep(1000);
				loopCount++;
			} else if (errorMessage.contains("goods")) {
				dangerGoodsPetsMessage = WebTestActions.getObjectText(dangerousGoodsMessage); //dangerousGoodsMessage.getText();
				Thread.sleep(1000);
				loopCount++;
			}

		} while (!dangerGoodsPetsMessage.contains(" ") && loopCount < 5);

		return dangerGoodsPetsMessage;
	}

	// The below method returns the dangerous goods & pets port public String
	public String getDangerousGoodsPort() throws InterruptedException {

		int loopCount = 0;
		String port = null;

		do {

			port = WebTestActions.getObjectText(dangerousGoodsPort); //dangerousGoodsPort.getText();
			Thread.sleep(1000);
			loopCount++;
		} while (!port.contains(" ") && loopCount < 10);

		return port;
	}

	// The below method returns the dangerous goods & pets port public String
	public String getPetsPort() throws InterruptedException {

		int loopCount = 0;
		String port = null;

		do {

			port = WebTestActions.getObjectText(petsPort); //petsPort.getText();
			Thread.sleep(1000);
			loopCount++;
		} while (!port.contains(" ") && loopCount < 10);

		return port;

	}

	// The below method returns the dangerous goods & pets timing
	public String getDangerousGoodsTiming() {
		//return dangerousGoodsTiming.getText();
		return WebTestActions.getObjectText(dangerousGoodsTiming);
	}

	// The below method returns the dangerous goods & pets timing
	public String getPetsTiming() {
		//return petsTiming.getText();
		return WebTestActions.getObjectText(petsTiming);
	}

	// The below method returns the dangerous goods & pets timing
	public String getDangerousGoodsTelephoneNo() throws InterruptedException {

		int loopCount = 0;
		String telephone = null;

		do {

			telephone = WebTestActions.getObjectText(dangerousGoodsTelephoneNo); //dangerousGoodsTelephoneNo.getText();
			Thread.sleep(1000);
			loopCount++;
		} while (!telephone.contains(" ") && loopCount < 10);

		return telephone;

	}

	// The below method returns the dangerous goods & pets timing
	public String getPetsTelephoneNo() throws InterruptedException {

		int loopCount = 0;
		String telephone = null;

		do {

			telephone = WebTestActions.getObjectText(PetsTelephoneNo); //PetsTelephoneNo.getText();
			Thread.sleep(1000);
			loopCount++;
		} while (!telephone.contains(" ") && loopCount < 10);

		return telephone;

	}

	// The below method returns the dangerous goods & pets timing
	public String getDangerousGoodsEmail() {
		//return dangerousGoodsEmail.getText();
		return WebTestActions.getObjectText(dangerousGoodsEmail);
	}

	// The below method returns the dangerous goods & pets timing
	public String getPetsEmail() {
		//return petsEmail.getText();
		return WebTestActions.getObjectText(petsEmail);
	}

	// The below method clicks back on the dangerous goods, pets error message page
	public void clickBackDangerousGoodsPets() {
		//dangerousGoodsPetsBack.click();
		WebTestActions.clickElement(dangerousGoodsPetsBack);
	}

	// The below method waits for the dangerous goods pets email to be displayed
	public void waitForDangerousGoodsPetsEmail() {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(dangerousGoodsEmail));
		WebTestActions.waitForElementToBeVisibile(dangerousGoodsEmail);
	}

}
