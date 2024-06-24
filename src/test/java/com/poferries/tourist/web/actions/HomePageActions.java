package com.poferries.tourist.web.actions;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class HomePageActions {
	
	@FindBy(how = How.ID, using = "route")
	public WebElement routeDropDown;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	public WebElement logOutLink;

//	@FindBy(how = How.XPATH, using = "//a[@href='/BookNow'][@class=' ']")
//	public WebElement bookLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Book")
	public WebElement bookLink;
	
	@FindBy(how = How.XPATH, using = "//a[@title='New Booking'][@class=' ']")
	public WebElement NewBooking;

	@FindBy(how = How.ID, using = "HomeBookNowBtn")
	public WebElement bookNowBtn;
	
	@FindBy(how = How.XPATH, using = "//section[@class='ccAccountBand']//a/span")
	public WebElement AccountBand;	

	@FindBy(how = How.LINK_TEXT, using = "PROFILE")
	public WebElement profileLink;
	
//	@FindBy(how = How.XPATH, using = "//nav//a[@title='Home']")
//	public WebElement NavigateToHome;
	
	@FindBy(how = How.LINK_TEXT,using = "Home")
	public WebElement NavigateToHome;

	@FindBy(how = How.ID, using = "PregressDiv")
	public WebElement progressBar;

	@FindBy(how = How.ID, using = "schedule-range")
	public WebElement newProgressBar;

	@FindBy(how = How.ID, using = "dropdownM")
	public WebElement lengthUnitSelect;

	@FindBy(how = How.XPATH, using = "//a[@data-value='Metre']")
	public WebElement metre;

	@FindBy(how = How.ID, using = "//a[@data-value='feet']")
	public WebElement feet;

	@FindBy(how = How.ID, using = "dropdownLanguage")
	public WebElement languageSelect;

	@FindBy(how = How.XPATH, using = "//div[@id='dropdownLanguageItems']/child::a[1]")
	public WebElement englishLang;

	@FindBy(how = How.ID, using = "//div[@id='dropdownLanguageItems']/child::a[2]")
	public WebElement polishLang;

	@FindBy(how = How.ID, using = "//div[@id='dropdownLanguageItems']/child::a[3]")
	public WebElement germanLang;

	@FindBy(how = How.ID, using = "//div[@id='dropdownLanguageItems']/child::a[4]")
	public WebElement frenchLang;

	@FindBy(how = How.ID, using = "//div[@id='dropdownLanguageItems']/child::a[5]")
	public WebElement dutchLang;

	@FindBy(how = How.ID, using = "//div[@id='dropdownLanguageItems']/child::a[6]")
	public WebElement spannishLang;

	@FindBy(how = How.XPATH, using = "//section//a[contains(@href,'CreateBookings')]")
	public WebElement createBookings;
	
	
//	@FindBy(how = How.XPATH, using = "//nav//a[contains(@href,'CreateBookings')]")
//	public WebElement Navigation_createBookings;
	
	@FindBy(how = How.LINK_TEXT, using = "Create Bookings")
	public WebElement Navigation_createBookings;
	
	//************************************************
	
	ConfigReader configReader = new ConfigReader();
	Actions WebTestActions;

	// Constructor initialising the page factory elements
	public HomePageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// the below method returns the title of the home Page
	public String getHomePageTitle() {
		return WebTestActions.PageTitle(); //Seleniumdriver.getDriver().getTitle();
	}
	
	public String getDefaultAccountText() {
		return WebTestActions.getObjectText(AccountBand);
	}
	
	public boolean NavigateToHome() {
		return WebTestActions.clickElement(NavigateToHome);
	}

	// method clicks the logout link
	public void clickLogOut() {
		//logOutLink.click();
		WebTestActions.clickElement(logOutLink);
	}
	
	public void WaitforBookLink() {
		WebTestActions.waitForElementToBeVisibile(bookLink);
	}

	// the below method clicks the book link
	public void clickBookLink() {
		//bookLink.click()
		WaitforBookLink();
		WebTestActions.clickElement(bookLink);
	}
	
	public void clickNewBooking() {
		WebTestActions.waitForElementToBeVisibile(NewBooking);
		WebTestActions.clickElement(NewBooking);
	}

	// wait for book now button to be displayed
	public void waitForBookThisRouteBtn() throws TimeoutException {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(bookNowBtn));
		WebTestActions.waitForElementToBeVisibile(bookNowBtn);
	}

	// the below method clicks the profile Link
	public void clickProfileLink() {
		//profileLink.click();
		WebTestActions.clickElement(profileLink);
	}

	// the below method waits for the progress bar to dissapear
	public void waitForProgressbarToDissapear() {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.invisibilityOf(progressBar));
		WebTestActions.waitForElementToBeInvisibile(progressBar);
	}

	// the below method waits for the progress bar to dissapear
	public void waitForNewProgressbarToDissapear() {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.invisibilityOf(newProgressBar));
		WebTestActions.waitForElementToBeInvisibile(newProgressBar);
	}

	// the below method waits for the progress bar to appear
	public void waitForProgressbarToappear() {
		/*Seleniumdriver.getWaitDriver().until(ExpectedConditions.attributeToBe(progressBar, "class",
				configReader.pagesWeb.getProperty("progressBarActiveClass")));*/
		
		WebTestActions.getWaitDriver().until(ExpectedConditions.attributeToBe(progressBar, "class",
				configReader.pagesWeb.getProperty("progressBarActiveClass")));
	}

	public void createBookingClick(){
		//createBookings.click();
		WebTestActions.waitForElementToBeClickable(createBookings);
		WebTestActions.clickElement(createBookings);
	}
	
	public void Nav_createBookingClick() throws InterruptedException{
		WebTestActions.clickElement(Navigation_createBookings);
		Thread.sleep(3000);
	}
	
	public void waitForCreateBookingsLonkToAppear(){
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(Navigation_createBookings));
		WebTestActions.waitForElementToBeVisibile(Navigation_createBookings);
	}
	
	// enter the length and the currency options
		/*public void makeLengthAndLanguageSelections(String lengthUnit, String language) throws InterruptedException {

			// click the label and wait for lengthUnit select
			Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(lengthUnitSelect));

			// make the language selection
			languageSelect.click();
			Thread.sleep(1000);

			Actions act = new Actions(Seleniumdriver.getDriver());

			// based on the language in the spreadsheet click on the corresponding language
			if (language.equalsIgnoreCase("en")) {

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ENTER).build().perform();

			} else if (language.equalsIgnoreCase("pl")) {

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ENTER).build().perform();

			} else if (language.equalsIgnoreCase("de")) {

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ENTER).build().perform();

			} else if (language.equalsIgnoreCase("fr")) {

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ENTER).build().perform();

			} else if (language.equalsIgnoreCase("nl")) {

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ENTER).build().perform();

			} else if (language.equalsIgnoreCase("es")) {

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act.sendKeys(Keys.ENTER).build().perform();
			}

			waitForProgressbarToappear();
			waitForProgressbarToDissapear();

			// Now select the unit selection
			lengthUnitSelect.click();
			Thread.sleep(1000);

			Actions act1 = new Actions(Seleniumdriver.getDriver());

			if (lengthUnit.equalsIgnoreCase("metre")) {

				act1.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act1.sendKeys(Keys.ENTER).build().perform();

			} else if (lengthUnit.equalsIgnoreCase("feet")) {

				act1.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act1.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(100);
				act1.sendKeys(Keys.ENTER).build().perform();
			}

			waitForProgressbarToappear();
			waitForProgressbarToDissapear();

		}*/

}
