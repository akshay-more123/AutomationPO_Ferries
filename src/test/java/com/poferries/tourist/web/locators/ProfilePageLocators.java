package com.poferries.tourist.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePageLocators {

	@FindBy(how = How.ID, using = "Title")
	public WebElement SelectTitle;
	
	@FindBy(how = How.ID, using = "FirstName")
	public WebElement FirstName;

	@FindBy(how = How.ID, using = "LastName")
	public WebElement lastName;
	
	@FindBy(how = How.ID, using = "Mobile")
	public WebElement Mobile;

	@FindBy(how = How.ID, using = "Language")
	public WebElement SelectLanguage;	

	@FindBy(how = How.ID, using = "JobTitle")
	public WebElement JobTitle;
	
	@FindBy(how = How.ID, using = "Email")
	public WebElement Email;
	
	@FindBy(how = How.ID, using = "CompanyName")
	public WebElement CompanyName;
	
	@FindBy(how = How.ID, using = "CompanyCountry")
	public WebElement SelectCompanyCountry;
	
	@FindBy(how = How.ID, using = "PostCode")
	public WebElement postCode;
	
	@FindBy(how = How.ID, using = "selectaddress")
	public WebElement SelectAddress;
	
	@FindBy(how = How.ID, using = "AddressLine1")
	public WebElement AddressLine1;
	
	@FindBy(how = How.ID, using = "AddressLine2")
	public WebElement AddressLine2;
	
	@FindBy(how = How.ID, using = "TownCity")
	public WebElement TownCity;
	
	@FindBy(how = How.ID, using = "County")
	public WebElement County;

	@FindBy(how = How.ID, using = "numberOfAccounts")
	public WebElement numberOfAccounts;

	@FindBy(how = How.ID, using = "AccountNumber1")
	public WebElement AccountNumber1;

	@FindBy(how = How.ID, using = "Username")
	public WebElement Username;
	
	@FindBy(how = How.ID, using = "ConfirmUsername")
	public WebElement ConfirmUsername;

	@FindBy(how = How.XPATH, using = "//span[@class='checkmark']")
	public WebElement iAgreeTermsConditions;
	
	@FindBy(how = How.ID, using = "apply")
	public WebElement ApplyBtn;

	@FindBy(how = How.XPATH, using = "//a[@href='/CreditUserProfile']")
	public WebElement CreditUserProfileLink;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/AddUserToAccount']")
	public WebElement AddUserToAccount;	
	
	@FindBy(how = How.ID, using = "Title-error")
	public WebElement TitleEerror;
	//Title is required

	@FindBy(how = How.ID, using = "FirstName-error")
	public WebElement FirstNameEerror;
	//First Name is required
	//First Name cannot exceed 40 Characters
	
	@FindBy(how = How.ID, using = "LastName-error")
	public WebElement LastNameError;
	//Last Name is required
	//Last Name cannot exceed 80 Characters
	
	@FindBy(how = How.ID, using = "JobTitle-error")
	public WebElement JobTitleError;
	//Job Title is required
	//Job Title Cannot exceed 255 Characters

	@FindBy(how = How.ID, using = "Email-error")
	public WebElement EmailError;
	//Email is required
	//Last Name cannot exceed 76 Characters

	@FindBy(how = How.ID, using = "Mobile-error")
	public WebElement MobileError;
	//Mobile is required
	//Mobile number cannot exceed 12 Characters

	@FindBy(how = How.ID, using = "CompanyName-error")
	public WebElement CompanyNameError;
	//Company Name is required
	//Company name cannot exceed 255 Characters
	
	@FindBy(how = How.ID, using = "CompanyCountry-error")
	public WebElement CompanyCountryError;
	//Please Select a valid Country
	
	@FindBy(how = How.ID, using = "PostCode-error")
	public WebElement PostCodeError;
	//Postcode is required
	//Please enter no more than 20 characters.
	
	@FindBy(how = How.ID, using = "AddressLine1-error")
	public WebElement AddressLine1Error;
	//Address 1 is required
	//Address Line 1 cannot exceed 255 characters
	
	@FindBy(how = How.ID, using = "AddressLine2-error")
	public WebElement AddressLine2Error;
	//Address Line 2 cannot exceed 255 character
	
	@FindBy(how = How.ID, using = "TownCity-error")
	public WebElement TownCityError;
	//Address 1 is required
	//City/Town cannot exceed 40 characters
	
	@FindBy(how = How.ID, using = "County-error")
	public WebElement CountyError;
	//County Cannot Exceed 50 chars
	
	@FindBy(how = How.ID, using = "AccountNumber1-error")
	public WebElement AccountNumber1Error;
	//Account number is required
	//Account number should contain 6 characters only
	
	@FindBy(how = How.ID, using = "Username-error")
	public WebElement UsernameError;
	//Username is required
	//Username cannot exceed 50 chars
	
	@FindBy(how = How.ID, using = "ConfirmUsername-error")
	public WebElement ConfirmUsernameError;
	//Confirm Username is required
	//Username and Confirm Username Should be same
	
	@FindBy(how = How.ID, using = "iAgreeTermsConditions-error")
	public WebElement iAgreeTermsConditionsError;
	//Kindly agree the Terms and Condition
	
}
