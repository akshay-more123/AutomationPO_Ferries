package com.poferries.tourist.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPageLocators {

	@FindBy(how = How.ID, using = "title")
	public WebElement SelectTitle;
	
	@FindBy(how = How.ID, using = "firstname")
	public WebElement FirstName;

	@FindBy(how = How.ID, using = "lastname")
	public WebElement lastName;
	
	@FindBy(how = How.ID, using = "phoneNumber")
	public WebElement Mobile;

	@FindBy(how = How.ID, using = "preferredlanguage")
	public WebElement SelectLanguage;	

	@FindBy(how = How.ID, using = "jobtittle")
	public WebElement JobTitle;
	
	@FindBy(how = How.ID, using = "email")
	public WebElement Email;
	
	@FindBy(how = How.ID, using = "companyname")
	public WebElement CompanyName;
	
	@FindBy(how = How.ID, using = "vatcountry")
	public WebElement vatcountry;
	
	@FindBy(how = How.ID, using = "vatnumber")
	public WebElement vatnumber;
	
	@FindBy(how = How.ID, using = "companyregistrationNumber")
	public WebElement companyregistrationNumber;
	
	@FindBy(how = How.ID, using = "companytype")
	public WebElement companytype;
	
	@FindBy(how = How.NAME, using = "multiselectFormText")
	public WebElement RoutesDropDown;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='Calais-Dover']")
	public WebElement CalaisDover;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='Dover-Calais']")
	public WebElement DoverCalais;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='Hull-Europoort']")
	public WebElement HullEuropoort;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='Europoort-Hull']")
	public WebElement EuropoortHull;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='Hull-Zeebrugge']")
	public WebElement HullZeebrugge;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='Zeebrugge-Hull']")
	public WebElement ZeebruggeHull;
	
	@FindBy(how = How.ID, using = "numberofshipments")
	public WebElement numberofshipments;
	
	@FindBy(how = How.ID, using = "companytelephone")
	public WebElement companytelephone;
	
	@FindBy(how = How.ID, using = "Currency")
	public WebElement SelectCurrency;
	
	@FindBy(how = How.ID, using = "findaddresscountry")
	public WebElement SelectCountry;
	
	@FindBy(how = How.ID, using = "postcode")
	public WebElement postcode;
	
	@FindBy(how = How.ID, using = "selectaddress")
	public WebElement selectaddress;

	@FindBy(how = How.ID, using = "address1")
	public WebElement address1;

	@FindBy(how = How.ID, using = "address2")
	public WebElement address2;

	@FindBy(how = How.ID, using = "city")
	public WebElement city;
	
	@FindBy(how = How.ID, using = "addresscountry")
	public WebElement addresscountry;

	@FindBy(how = How.XPATH, using = "//span[@class='checkmark']")
	public WebElement iAgreeTermsConditions;
	
	@FindBy(how = How.ID, using = "SaveProfileBtn")
	public WebElement SubmitBtn;

	@FindBy(how = How.XPATH, using = "//a[@href='/UserAccountTypes']")
	public WebElement SignUp;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/CreditCustomerApplicationform']")
	public WebElement CreditCustomerApplicationform;	
	
	@FindBy(how = How.ID, using = "title-error")
	public WebElement TitleEerror;
	//Title is required

	@FindBy(how = How.ID, using = "firstname-error")
	public WebElement FirstNameEerror;
	//First Name is required
	//First Name cannot exceed 40 Characters
	
	@FindBy(how = How.ID, using = "lastname-error")
	public WebElement LastNameError;
	//Last Name is required
	//Last Name cannot exceed 80 Characters
	
	@FindBy(how = How.ID, using = "jobtittle-error")
	public WebElement jobtittleError;
	//Job Title is Required
	//Last Name cannot exceed 80 Characters
	
	@FindBy(how = How.ID, using = "email-error")
	public WebElement EmailError;
	//Email is required
	//Last Name cannot exceed 76 Characters

	@FindBy(how = How.ID, using = "phoneNumber-error")
	public WebElement MobileError;
	//Mobile is required
	//Mobile number cannot exceed 12 Characters

	@FindBy(how = How.ID, using = "companyname-error")
	public WebElement CompanyNameError;
	//Company Name is required
	//Company name cannot exceed 255 Characters
	
	@FindBy(how = How.ID, using = "companytype-error")
	public WebElement companytypeError;
	
	@FindBy(how = How.ID, using = "vatcountry-error")
	public WebElement vatcountryError;
	
	@FindBy(how = How.ID, using = "vatnumber-error")
	public WebElement vatnumberError;
	
	@FindBy(how = How.ID, using = "companyregistrationNumber-error")
	public WebElement companyregistrationNumberError;
	//Company Registration Number is Required
	
	@FindBy(how = How.ID, using = "numberofshipments-error")
	public WebElement numberofshipmentsError;
	//Anticipated No of Shipments per month is Required
	
	@FindBy(how = How.ID, using = "postcode-error")
	public WebElement postcodeError;
	//Post code is required
	//Please enter no more than 20 characters.
	
	@FindBy(how = How.ID, using = "companytelephone-error")
	public WebElement companytelephoneError;
	//Company Telephone is Required
	//Company Telephone Cannot exceed 255 Characters
	
	@FindBy(how = How.ID, using = "findaddresscountry-error")
	public WebElement CountyError;
	//Pick valid Country name
	
	@FindBy(how = How.ID, using = "address1-error")
	public WebElement AddressLine1Error;
	//Address 1 is required
	//Address Line 1 cannot exceed 255 characters
	
	@FindBy(how = How.ID, using = "address2-error")
	public WebElement AddressLine2Error;
	//Enter Valid Address Line 2
	//Address Line 2 cannot exceed 255 character
	
	@FindBy(how = How.ID, using = "city-error")
	public WebElement TownCityError;
	//City/Town is Required
	//City/Town cannot exceed 40 characters
	
	@FindBy(how = How.ID, using = "addresscountry-error")
	public WebElement addresscountryError;
		
	@FindBy(how = How.ID, using = "TermsCheckbox-error")
	public WebElement iAgreeTermsConditionsError;
	//Kindly agree the Terms and Conditions
	
}
