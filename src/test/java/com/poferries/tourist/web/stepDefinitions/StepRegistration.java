//package com.poferries.tourist.web.stepDefinitions;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Map;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import com.driver.DriverType;
//import com.poferries.tourist.web.actions.Account_Registration;
//import com.poferries.tourist.web.actions.nopCommerce_LoginClass;
//import com.poferries.tourist.web.utilities.ConfigReader;
//import com.poferries.tourist.web.utilities.Seleniumdriver;
//import com.poferries.tourist.web.utilities.TestDataUtil;
//import com.web.actions.Actions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.*;
//
//public class StepRegistration {
//
//	Account_Registration registration;
//	
//	
//	
//	ConfigReader configReader = new ConfigReader();
//	TestDataUtil testdata = new TestDataUtil();
//
//	private String TestdataFile = System.getProperty("user.dir") + configReader.configWeb.getProperty("TestDataXLFile");
//	private Actions WebTestActions;
//	private static final Logger logger = LogManager.getLogger(Steps.class.getName());
//
//	//********************************************************************************************
//	//********************************************************************************************
//
//	@Before
//	public void setUpDriver() {
////		Seleniumdriver.setUpDriver();
//		this.WebTestActions = new Actions(DriverType.FirefoxDriver);
//		this.registration = new Account_Registration(this.WebTestActions);
//	}
//	
//	@Before
//	public void PrintScenarioName(Scenario scenario) throws IOException {
//		System.out.println("Executing --> " + scenario.getName());
//	}
//	
//	@AfterStep
//	public void addScreenshot(Scenario scenario) throws IOException {
//		File screenshot = ((TakesScreenshot) WebTestActions.driver).getScreenshotAs(OutputType.FILE);
//		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
//		scenario.attach(fileContent, "image/png", scenario.getName().toString());
//		}
//	
//	@After
//	public void tearDown(Scenario scenario) {
//		//System.out.println(scenario.isFailed());
//		WebTestActions.CloseBrowser();
//	}
//	
//	@Given("the user navigates to Register Account page")
//	public void the_user_navigates_to_register_account_page() {
//	     
//		registration.NavigateToRegister();
//	}
//
//	@When("the user enters the details into below fields")
//	public void the_user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) {
//		
//		registration.clickOnRadioButton();
//		
//        Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
//        registration.enterFirstName(dataMap.get("firstName"));
//        registration.enterLastName(dataMap.get("lastName"));
//        registration.selectBirthDate();
//        registration.enterEmail(dataMap.get("email"));
//        registration.enterPassword(dataMap.get("password"));
//        registration.enterConfirmPassword(dataMap.get("password"));
//        
//	}
//
//	@When("the user clicks on RegisterButton button")
//	public void the_user_clicks_on_Register_button() {
//
//		registration.clickOnRegisterButton();
//	}
//
//	@Then("the user account should get created successfully")
//	public void the_user_account_should_get_created_successfully() {
//	   
//		registration.verifySuccessfulMassage();
//		
//	}
//}
