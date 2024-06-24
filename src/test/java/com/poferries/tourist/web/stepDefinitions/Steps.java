
package com.poferries.tourist.web.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.driver.DriverType;
import com.google.common.base.Verify;
import com.poferries.tourist.web.actions.Account_Registration;
import com.poferries.tourist.web.actions.BlockBookingsPageActions;
import com.poferries.tourist.web.actions.BookNowPageActions;
import com.poferries.tourist.web.actions.BookingConfirmationPageActions;
import com.poferries.tourist.web.actions.CreateBookingPageActions;
import com.poferries.tourist.web.actions.CreditCancelWaybillAction;
import com.poferries.tourist.web.actions.GetQuotePageActions;
import com.poferries.tourist.web.actions.HomePageActions;
import com.poferries.tourist.web.actions.LandingPageActions;
import com.poferries.tourist.web.actions.LoginPageActions;
import com.poferries.tourist.web.actions.ManageBookingsPageActions;
import com.poferries.tourist.web.actions.MyAccountPage;
import com.poferries.tourist.web.actions.NewBookingWarningErrorMessageAction;
import com.poferries.tourist.web.actions.PaymentFailurePageActions;
import com.poferries.tourist.web.actions.PaymentPageActions;
import com.poferries.tourist.web.actions.ProfilePageActions;
import com.poferries.tourist.web.actions.SignUpPageActions;
import com.poferries.tourist.web.actions.TrackBookingsPageActions;
import com.poferries.tourist.web.actions.UpdateTW_WalletPage_3669;
import com.poferries.tourist.web.actions.VehicleDetailsPageActions;
import com.poferries.tourist.web.actions.WayBill;
import com.poferries.tourist.web.actions.nopCommerce_LoginClass;
import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.Seleniumdriver;
import com.poferries.tourist.web.utilities.TestDataUtil;
import com.web.actions.Actions;
import com.web.hooks.RandomString;
import com.poferries.tourist.web.actions.TooltipManageBooking;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	private static nopCommerce_LoginClass loginPage;
	private static Account_Registration registration;
	private static MyAccountPage macc;
	//private static RandomString random;


	
	
	ConfigReader configReader = new ConfigReader();
	TestDataUtil testdata = new TestDataUtil();
	RandomString random = new RandomString();
	private String TestdataFile = System.getProperty("user.dir") + configReader.configWeb.getProperty("TestDataXLFile");
	private Actions WebTestActions;
	private static final Logger logger = LogManager.getLogger(Steps.class.getName());

	//********************************************************************************************
	//********************************************************************************************

	@Before
	public void setUpDriver() {
		//Seleniumdriver.setUpDriver();
		this.WebTestActions = new Actions(DriverType.FirefoxDriver);
		this.loginPage = new nopCommerce_LoginClass(this.WebTestActions);
		this.registration = new Account_Registration(this.WebTestActions);
		this.macc = new MyAccountPage(this.WebTestActions);

	}
	
	@Before
	public void PrintScenarioName(Scenario scenario) throws IOException {
		System.out.println("Executing --> " + scenario.getName());
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		File screenshot = ((TakesScreenshot) WebTestActions.driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", scenario.getName().toString());
		}
	
	@After
	public void tearDown(Scenario scenario) {
		//System.out.println(scenario.isFailed());
		WebTestActions.CloseBrowser();
	}
	//********************************************************************************************
		
		//********************************************************************************************
	
	// this is a test case for login
	@Given("the user is on the nopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() throws InterruptedException {
		
		loginPage.NavigateToLogin();
		Thread.sleep(3000);	
	}
	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_Email(String username, String pwd) throws InterruptedException
	{
		loginPage.enterEmail(username);
		loginPage.enterPassword(pwd);
	}
	
	@When("the user enters invalid credentials")
	public void the_user_enters_invalid_credentials_username_Email() throws InterruptedException
	{
		loginPage.enterEmail(random.getEmail());
		loginPage.enterPassword(random.randomAlphaNumeric());
	}
	//********************************************************************************************
		// Credit Copy on create booking page..............................
		//********************************************************************************************
	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button()
	{
		loginPage.clickOnLogin();
		
	}
	
	@Then("the user should be redirected to the My Account page")
	public void the_user_should_be_redirected_to_the_my_account_page()
	{
		//loginPage.acc_buttonIsVisible();
		boolean targetpage=macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true);
		
		macc.clickLogout();
	}
	
	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	   
		loginPage.getWelcomeMassage();
	}
	
	@Then("the user should see an error massage")
	public void the_user_should_see_an_error_message() {
	   
		loginPage.getErrorMassage();
	}
	
	//
	
	
	
	
	
	//this is the testcase for user registration.....................................
	//********************************************************************************************
	@Given("the user navigates to Register Account page")
	public void the_user_navigates_to_register_account_page() {
	     
		registration.NavigateToRegister();
	}

	@When("the user enters the details into below fields")
	public void the_user_enters_the_details_into_below_fields() {
		String password= random.randomAlphaNumeric();
		registration.clickOnRadioButton();
        registration.enterFirstName(random.generateFirstName());
        registration.enterLastName(random.generateLastName());
        registration.selectBirthDate();
        registration.enterEmail(random.getEmail());
        registration.enterPassword(password);
        registration.enterConfirmPassword(password);
        
	}

	@When("the user clicks on RegisterButton button")
	public void the_user_clicks_on_Register_button() {

		registration.clickOnRegisterButton();
	}

	@Then("the user account should get created successfully")
	public void the_user_account_should_get_created_successfully() {
	   
		registration.verifySuccessfulMassage();
		
	}
}
