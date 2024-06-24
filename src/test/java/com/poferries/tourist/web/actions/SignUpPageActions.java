package com.poferries.tourist.web.actions;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.locators.OutlookPageLocators;
import com.poferries.tourist.web.locators.SignUpPageLocators;
import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.TestDataUtil;
import com.web.actions.Actions;

public class SignUpPageActions {

	SignUpPageLocators SignUpPageLocators = null;
	OutlookPageLocators OutlookPageLocators = null;
	ConfigReader configReader = new ConfigReader();
	TestDataUtil testdata = new TestDataUtil();
	String TestdataFile = System.getProperty("user.dir") + configReader.configWeb.getProperty("DriverPlugInTestData");
	Actions WebTestActions;
	private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public SignUpPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		this.SignUpPageLocators = new SignUpPageLocators();
		this.OutlookPageLocators = new OutlookPageLocators();
		PageFactory.initElements(WebTestActions.driver, SignUpPageLocators);
		PageFactory.initElements(WebTestActions.driver, OutlookPageLocators);
	}
	
	public void navigateToCreditCustomerApplicationform() {
		//https://uk-sitecore-freight-tst-rg-323540-cd.azurewebsites.net/CreditCustomerApplicationform
		/*Seleniumdriver.getDriver().navigate().to("https://uk-sitecore-freight-tst-rg-323540-cd.azurewebsites.net/CreditCustomerApplicationform");
		Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(SignUpPageLocators.SubmitBtn));*/
		//Thread.sleep(3000);
		
		WebTestActions.navigateToURL("https://uk-sitecore-freight-tst-rg-323540-cd.azurewebsites.net/CreditCustomerApplicationform");
		WebTestActions.waitForElementToBeVisibile(SignUpPageLocators.SubmitBtn);
	}
	
	public void navigateToOutlookApp() throws InterruptedException {
		/*Seleniumdriver.getDriver().navigate().to("https://outlook.office.com/mail/");
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(OutlookPageLocators.EmailInput));
		Thread.sleep(3000);*/
		
		WebTestActions.navigateToURL("https://outlook.office.com/mail/");
		Thread.sleep(3000);
	}
	
	public void loginToOutlookApp() throws InterruptedException {
		OutlookPageLocators.EmailInput.clear();
		OutlookPageLocators.EmailInput.sendKeys("Shrikant.Khairnar@poferries.com");
		OutlookPageLocators.submitBtn.click();
		Thread.sleep(3000);
		
		if(OutlookPageLocators.passwordInput.isDisplayed()) {
			OutlookPageLocators.passwordInput.clear();
			OutlookPageLocators.passwordInput.sendKeys("Shreeraj!@12");
			OutlookPageLocators.submitBtn.click();
			Thread.sleep(3000);
		}
		
		//Actions actions = new Actions(Seleniumdriver.getDriver());
		//actions.sendKeys(Keys.ENTER);
		
		OutlookPageLocators.SelectMobile.click();
		Thread.sleep(100000);
		//OutlookPageLocators.InputMobileOTP.sendKeys("Enigma123$");
		OutlookPageLocators.submitBtn.click();
		Thread.sleep(3000);
		
		OutlookPageLocators.NotnowLink.click();
		Thread.sleep(3000);
	}

	private void enterDataToFiled(WebElement webElement, String value) throws InterruptedException{
		//JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		//js.executeScript("arguments[0].scrollIntoView(true);", webElement);
		
		/*webElement.clear();
		webElement.sendKeys(value);*/
		
		WebTestActions.writeText(value, webElement);
		Thread.sleep(2000);
	}
	
	private void selectDropdownValue(WebElement webElement, String value) throws InterruptedException{
		//JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		//js.executeScript("arguments[0].scrollIntoView(true);", webElement);
		
		//webElement.click();
		WebTestActions.clickElement(webElement);
		WebTestActions.SelectByValue(value, webElement);
		
		
        /*Select dropdown = new Select(webElement);
        //dropdown.selectByVisibleText(value);
        dropdown.selectByValue(value);*/
        Thread.sleep(2000);
    }
	
	private void clickWebElement(WebElement webElement) throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		//js.executeScript("arguments[0].scrollIntoView(true);", webElement);
		
		//webElement.click();
		WebTestActions.clickElement(webElement);
		Thread.sleep(2000);
	}
		
	private String generateRandomString(int len) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
	
	private String generateRandomNumbers(int len) {
		String chars = "0123456789";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
	
	private void verifyTextOnWebElement(String webFieldName, String expectedValue, WebElement webElement){
		int rowNuber = testdata.getresultDataRowCount() + 1;
		testdata.setCellData(rowNuber,0,webFieldName);
		testdata.setCellData(rowNuber,1,expectedValue);
		try {
			testdata.setCellData(rowNuber,2,webElement.getText());
			if(WebTestActions.findWebElement(webElement).getText().equalsIgnoreCase(expectedValue)){
				testdata.setCellData(rowNuber,3,"PASS");
				logger.info("Validated Text for " + webFieldName + ", Expected Value = " + expectedValue + ", Actual Value = " + webElement.getText());
			} else {
				testdata.setCellData(rowNuber,3,"FAIL");
				logger.warn("Validated Text for " + webFieldName + ", Expected Value = " + expectedValue + ", Actual Value = " + webElement.getText());
			}
		}catch(Exception e) {
			testdata.setCellData(rowNuber,3,"FAIL");
			logger.warn("Validated Text for " + webFieldName + ", Expected Value = " + expectedValue + ", Actual Value = " + webElement.getText());
		}
	}
	
	/*
	
	// Enter the first Name
	public void enterFirstName(String firstName) {
		SignUpPageLocators.FirstName.clear();
		SignUpPageLocators.FirstName.sendKeys(firstName);
	}
	
	public void SelectTitle(String Title) throws InterruptedException{
		SignUpPageLocators.SelectTitle.click();
        Select titleDropdown = new Select(SignUpPageLocators.SelectTitle);
        titleDropdown.selectByVisibleText(Title);
    }
	
	public void enterlastName(String lastName) {
		SignUpPageLocators.lastName.clear();
		SignUpPageLocators.lastName.sendKeys(lastName);
	}
	
	public void enterMobile(String Mobile) {
		SignUpPageLocators.Mobile.clear();
		SignUpPageLocators.Mobile.sendKeys(Mobile);
	}
	
	public void SelectLanguage(String Language) throws InterruptedException{
		SignUpPageLocators.SelectLanguage.click();
        Select titleDropdown = new Select(SignUpPageLocators.SelectLanguage);
        titleDropdown.selectByVisibleText(Language);
    }
	
	public void enterJobTitle(String JobTitle) {
		SignUpPageLocators.JobTitle.clear();
		SignUpPageLocators.JobTitle.sendKeys(JobTitle);
	}
	
	public void enterEmail(String Email) {
		SignUpPageLocators.Email.clear();
		SignUpPageLocators.Email.sendKeys(Email);
	}
	
	public void enterCompanyName(String CompanyName) {
		SignUpPageLocators.CompanyName.clear();
		SignUpPageLocators.CompanyName.sendKeys(CompanyName);
	}
	
	public void SelectCompanyCountry(String CompanyCountry) throws InterruptedException{
		SignUpPageLocators.SelectCompanyCountry.click();
        Select titleDropdown = new Select(SignUpPageLocators.SelectCompanyCountry);
        titleDropdown.selectByVisibleText(CompanyCountry);
    }
	
	public void enterpostCode(String postCode) {
		SignUpPageLocators.postCode.clear();
		SignUpPageLocators.postCode.sendKeys(postCode);
	}
	
	public void SelectAddress(String Address) throws InterruptedException{
		SignUpPageLocators.SelectAddress.click();
        Select titleDropdown = new Select(SignUpPageLocators.SelectAddress);
        titleDropdown.selectByVisibleText(Address);
    }
	
	public void enterAddressLine1(String AddressLine1) {
		SignUpPageLocators.AddressLine1.clear();
		SignUpPageLocators.AddressLine1.sendKeys(AddressLine1);
	}
	
	public void enterAddressLine2(String AddressLine2) {
		SignUpPageLocators.AddressLine2.clear();
		SignUpPageLocators.AddressLine2.sendKeys(AddressLine2);
	}
	
	public void enterTownCity(String TownCity) {
		SignUpPageLocators.TownCity.clear();
		SignUpPageLocators.TownCity.sendKeys(TownCity);
	}
	
	public void enterCounty(String County) {
		SignUpPageLocators.County.clear();
		SignUpPageLocators.County.sendKeys(County);
	}
	
	public void enternumberOfAccounts(String numberOfAccounts) {
		SignUpPageLocators.numberOfAccounts.clear();
		SignUpPageLocators.numberOfAccounts.sendKeys(numberOfAccounts);
	}
	
	public void enterAccountNumber1(String AccountNumber1) {
		SignUpPageLocators.AccountNumber1.clear();
		SignUpPageLocators.AccountNumber1.sendKeys(AccountNumber1);
	}
	
	public void enterUsername(String Username) {
		SignUpPageLocators.Username.clear();
		SignUpPageLocators.Username.sendKeys(Username);
	}
	
	public void enterConfirmUsername(String ConfirmUsername) {
		SignUpPageLocators.ConfirmUsername.clear();
		SignUpPageLocators.ConfirmUsername.sendKeys(ConfirmUsername);
	}
	
	public void ClickAgreeTermsConditions() {
		SignUpPageLocators.iAgreeTermsConditions.clear();
		SignUpPageLocators.iAgreeTermsConditions.click();
	}
	
	public void ClickApplyBtn() throws InterruptedException {
		SignUpPageLocators.ApplyBtn.click();
		Thread.sleep(1000);
	}
		
	public void enterProfileData() throws InterruptedException {
		
		SelectTitle("Title");
	
		enterFirstName("firstName");

		enterlastName("lastName");
	
		enterMobile("Mobile");

		SelectLanguage("Language");	

		enterJobTitle("JobTitle");
	
		enterEmail("Email");
	
		enterCompanyName("CompanyName");
	
		SelectCompanyCountry("CompanyCountry");
		
		enterpostCode("postCode");
	
		SelectAddress("Address");
	
		enterAddressLine1("AddressLine1");
	
		enterAddressLine2("AddressLine2");
	
		enterTownCity("TownCity");
	
		enterCounty("County");

		enternumberOfAccounts("numberOfAccounts");

		enterAccountNumber1("AccountNumber1");

		enterUsername("Username");

		enterConfirmUsername("ConfirmUsername");

		ClickAgreeTermsConditions();

		ClickApplyBtn();
	}*/

	public void VerifyAllErrorMessages() throws InterruptedException {
			
		testdata.setWorkbook();
		testdata.setCellData(0,0,"FIELD");
		testdata.setCellData(0,1,"EXPECTED_ERROR_MESSAGE");
		testdata.setCellData(0,2,"ACTUL_ERROR_MESSAGE");
		testdata.setCellData(0,3,"TEST_RESULT");
		
		VerifyErrorMessagesOfBlankFields();
		
		testdata.saveWorkbook();
	}
	
	private void VerifyErrorMessagesOfBlankFields() throws InterruptedException {
				
		clickWebElement(SignUpPageLocators.SubmitBtn);
		
		verifyTextOnWebElement("Title","Title is required",SignUpPageLocators.TitleEerror);
		
		verifyTextOnWebElement("First Name","First Name is Required",SignUpPageLocators.FirstNameEerror);
		
		enterDataToFiled(SignUpPageLocators.FirstName,generateRandomString(41));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("First Name","First Name Cannot Exceed 40 Characters",SignUpPageLocators.FirstNameEerror);
				
		verifyTextOnWebElement("Last Name","Last Name is Required",SignUpPageLocators.LastNameError);
		
		enterDataToFiled(SignUpPageLocators.lastName,generateRandomString(81));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Last Name","Last Name cannot Exceed 80 Characters",SignUpPageLocators.LastNameError);
				
		verifyTextOnWebElement("Job Title","Job Title is Required",SignUpPageLocators.jobtittleError);
		
		enterDataToFiled(SignUpPageLocators.JobTitle,generateRandomString(256));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Job Title","Please enter no more than 255 characters.",SignUpPageLocators.jobtittleError);
		
		verifyTextOnWebElement("Email","Email is Required",SignUpPageLocators.EmailError);
		
		enterDataToFiled(SignUpPageLocators.Email,generateRandomString(2));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Email","Enter Valid Email",SignUpPageLocators.EmailError);
		
		enterDataToFiled(SignUpPageLocators.Email,generateRandomString(81) + "@gmail.com");
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Email","Please enter no more than 80 characters.",SignUpPageLocators.EmailError);
		
		verifyTextOnWebElement("Mobile","Mobile is Required",SignUpPageLocators.MobileError);
		
		enterDataToFiled(SignUpPageLocators.Mobile,generateRandomNumbers(13));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Mobile","Please enter no more than 12 characters.",SignUpPageLocators.MobileError);
		
		enterDataToFiled(SignUpPageLocators.Mobile,generateRandomString(2));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Mobile","Enter Valid Mobile",SignUpPageLocators.MobileError);
		
		verifyTextOnWebElement("Company Name","Company Name is Required",SignUpPageLocators.CompanyNameError);
		
		enterDataToFiled(SignUpPageLocators.CompanyName,generateRandomString(256));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Company Name","Please enter no more than 255 characters.",SignUpPageLocators.CompanyNameError);
		
		enterDataToFiled(SignUpPageLocators.vatnumber,generateRandomString(5));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Country","Pick valid Country name",SignUpPageLocators.vatcountryError);
		///enterDataToFiled(SignUpPageLocators.vatnumber,generateRandomString(16));
		//clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("VAT Number","Sorry this VAT number is not recognized please try again, or you can proceed without entering",SignUpPageLocators.vatnumberError);
				
		verifyTextOnWebElement("Company Registration Number","Company Registration Number is Required",SignUpPageLocators.companyregistrationNumberError);
		
		enterDataToFiled(SignUpPageLocators.companyregistrationNumber,generateRandomString(5));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Company Registration Number","Enter valid Company Registration Number",SignUpPageLocators.companyregistrationNumberError);
		
		enterDataToFiled(SignUpPageLocators.companyregistrationNumber,generateRandomString(16));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Company Registration Number","Company Registration Number cannot exceed 15 Chars.",SignUpPageLocators.companyregistrationNumberError);
		
		enterDataToFiled(SignUpPageLocators.companytype,generateRandomString(256));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Company Type","Please enter no more than 255 characters.",SignUpPageLocators.companytypeError);
		
		verifyTextOnWebElement("Anticipated No of Shipments","Anticipated No of Shipments per month is Required",SignUpPageLocators.numberofshipmentsError);
		
		enterDataToFiled(SignUpPageLocators.numberofshipments,generateRandomString(10));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Anticipated No of Shipments","Enter Valid anticipated No of Shipments per month",SignUpPageLocators.numberofshipmentsError);
		
		//verifyTextOnWebElement("Company Registration Number","Company Registration Number is Required",SignUpPageLocators.companyregistrationNumberError);
		verifyTextOnWebElement("Company Telephone Number","Company Telephone is Required",SignUpPageLocators.companytelephoneError);
		
		enterDataToFiled(SignUpPageLocators.companytelephone,generateRandomNumbers(41));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Company Telephone Number","Please enter no more than 40 characters.",SignUpPageLocators.companytelephoneError);
		
		enterDataToFiled(SignUpPageLocators.companytelephone,generateRandomString(10));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Company Telephone Number","Enter Valid Company Telephone",SignUpPageLocators.companytelephoneError);
		
		verifyTextOnWebElement("Country name","Pick valid Country name",SignUpPageLocators.CountyError);
		
		verifyTextOnWebElement("Post code","Post code is Required",SignUpPageLocators.postcodeError);
		
		enterDataToFiled(SignUpPageLocators.postcode,generateRandomNumbers(21));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Post code","Post Code cannot exceed 20 chars",SignUpPageLocators.postcodeError);
		
		verifyTextOnWebElement("Address 1","Address 1 is required",SignUpPageLocators.AddressLine1Error);
		
		/*enterDataToFiled(SignUpPageLocators.address1,generateRandomNumbers(300));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Address 1","Address Line 1 cannot have more than 255 chars",SignUpPageLocators.AddressLine1Error);*/
		
		verifyTextOnWebElement("Address 2","Enter Valid Address Line 2",SignUpPageLocators.AddressLine2Error);
		
		/*enterDataToFiled(SignUpPageLocators.address2,generateRandomNumbers(300));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Address 2","Address Line 2 cannot have more than 255 chars",SignUpPageLocators.AddressLine2Error);*/
		
		verifyTextOnWebElement("City/Town","City/Town is Required",SignUpPageLocators.TownCityError);
		
		/*enterDataToFiled(SignUpPageLocators.city,generateRandomNumbers(41));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("City/Town","City/Town cannot exceeds 40 Chars",SignUpPageLocators.TownCityError);
		
		enterDataToFiled(SignUpPageLocators.addresscountry,generateRandomNumbers(51));
		clickWebElement(SignUpPageLocators.SubmitBtn);
		verifyTextOnWebElement("Address County","County cannot exceeds 50 Chars",SignUpPageLocators.addresscountryError);*/
		
		verifyTextOnWebElement("Terms and Conditions","Kindly agree the Terms and Conditions",SignUpPageLocators.iAgreeTermsConditionsError);
				
	}
		
	public String FillCreditUserApplicationForm() throws InterruptedException {
		
		String lastName = "User" + generateRandomString(2);
		String userName = "Credit User Application Form - Test " + lastName;
		
		selectDropdownValue(SignUpPageLocators.SelectTitle, "Mr");
		
		enterDataToFiled(SignUpPageLocators.FirstName,"Test");
				
		enterDataToFiled(SignUpPageLocators.lastName,lastName);
		
		enterDataToFiled(SignUpPageLocators.JobTitle,"Testing");
				
		enterDataToFiled(SignUpPageLocators.Email,"Shrikant.Khairnar@poferries.com");
		
		enterDataToFiled(SignUpPageLocators.Mobile,"1234567890");
		
		//*******************************
		
		enterDataToFiled(SignUpPageLocators.CompanyName,"P&O Freight");
		
		//enterDataToFiled(SignUpPageLocators.vatnumber,generateRandomString(5));
		
		selectDropdownValue(SignUpPageLocators.vatcountry, "FR");
		
		enterDataToFiled(SignUpPageLocators.companyregistrationNumber,"123456789");
				
		enterDataToFiled(SignUpPageLocators.companytype,"Service");
		
		enterDataToFiled(SignUpPageLocators.numberofshipments,"12345");
		
		enterDataToFiled(SignUpPageLocators.companytelephone,"123456789");
		
		selectDropdownValue(SignUpPageLocators.SelectCurrency, "Euro");
		
		//*******************************
		
		selectDropdownValue(SignUpPageLocators.SelectCountry, "FR");
		
		enterDataToFiled(SignUpPageLocators.postcode,"75001");
		
		enterDataToFiled(SignUpPageLocators.address1,"Add1");
		
		enterDataToFiled(SignUpPageLocators.address2,"Add2");
		
		enterDataToFiled(SignUpPageLocators.city,"Paris");
		
		enterDataToFiled(SignUpPageLocators.addresscountry,"France");
		
		clickWebElement(SignUpPageLocators.iAgreeTermsConditions);
		
		clickWebElement(SignUpPageLocators.SubmitBtn);
		
		verifyCreditUserApplicationForm(userName);
		
		return userName;		
	}
		
	public void verifyCreditUserApplicationForm(String emailSubject) throws InterruptedException {
		
		navigateToOutlookApp();
		loginToOutlookApp();
		
		OutlookPageLocators.SearchInput.clear();
		OutlookPageLocators.SearchInput.sendKeys(emailSubject);
		OutlookPageLocators.SearchBtn.click();
		/*Actions actions = new Actions(Seleniumdriver.getDriver());
		actions.sendKeys(Keys.ENTER);*/
		OutlookPageLocators.SelectConversation.click();
	}
}