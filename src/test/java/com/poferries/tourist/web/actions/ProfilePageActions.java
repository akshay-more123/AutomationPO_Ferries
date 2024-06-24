package com.poferries.tourist.web.actions;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.TestDataUtil;
import com.web.actions.Actions;

public class ProfilePageActions {
	
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

//	@FindBy(how = How.XPATH, using = "//a[@href='/CreditUserProfile']")
//	public WebElement CreditUserProfileLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Profile")
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
	
	@FindBy(how = How.ID, using = "ChooseAccount")
	public WebElement ChooseAccount;
	
	
	//*******************************************************************

	ConfigReader configReader = new ConfigReader();
	TestDataUtil testdata = new TestDataUtil();
	String TestdataFile = System.getProperty("user.dir") + configReader.configWeb.getProperty("DriverPlugInTestData");
	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public ProfilePageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}
	
	public void navigateToCreditUserProfileLink() throws InterruptedException {
		WebTestActions.clickElement(CreditUserProfileLink);
		Thread.sleep(3000);
	}
	
	public void navigateToAddUserToExistingAccount() throws InterruptedException {
		WebTestActions.clickElement(AddUserToAccount); //AddUserToAccount.click();
		Thread.sleep(3000);
	}
	
	// Enter the first Name
	public void enterFirstName(String firstName) {
		/*FirstName.clear();
		FirstName.sendKeys(firstName);*/
		WebTestActions.writeText(firstName, FirstName);
	}
	
	public void SelectTitle(String Title){
		/*SelectTitle.click();
        Select titleDropdown = new Select(SelectTitle);
        titleDropdown.selectByVisibleText(Title);*/
		WebTestActions.SelectByVisibleText(Title, SelectTitle);
    }
	
	public void SelectAccount(String AccountTxt){
		WebTestActions.SelectByVisibleText(AccountTxt, ChooseAccount);
    }
	
	public void ValidateAccount(String AccountTxt){
		WebTestActions.SelectByVisibleText(AccountTxt, ChooseAccount);
    }
	
	public void ValidateAccounts(String AccountTxt){
		WebTestActions.SelectByVisibleText(AccountTxt, ChooseAccount);
    }
	
	public void enterlastName(String lastNametxt) {
		/*lastName.clear();
		lastName.sendKeys(lastName);*/
		WebTestActions.writeText(lastNametxt, lastName);
	}
	
	public void enterMobile(String Mobiletxt) {
		/*Mobile.clear();
		Mobile.sendKeys(Mobile);*/
		WebTestActions.writeText(Mobiletxt, Mobile);
	}
	
	public void SelectLanguage(String Language){
		/*SelectLanguage.click();
        Select titleDropdown = new Select(SelectLanguage);
        titleDropdown.selectByVisibleText(Language);*/
        WebTestActions.SelectByVisibleText(Language, SelectLanguage);
    }
	
	public void enterJobTitle(String JobTitletxt) {
		/*JobTitle.clear();
		JobTitle.sendKeys(JobTitle);*/
		WebTestActions.writeText(JobTitletxt, JobTitle);
	}
	
	public void enterEmail(String Emailtxt) {
		/*Email.clear();
		Email.sendKeys(Email);*/
		WebTestActions.writeText(Emailtxt, Email);
	}
	
	public void enterCompanyName(String CompanyNametxt) {
		/*CompanyName.clear();
		CompanyName.sendKeys(CompanyName);*/
		WebTestActions.writeText(CompanyNametxt, CompanyName);
	}
	
	public void SelectCompanyCountry(String CompanyCountry) throws InterruptedException{
		/*SelectCompanyCountry.click();
        Select titleDropdown = new Select(SelectCompanyCountry);
        titleDropdown.selectByVisibleText(CompanyCountry);*/
        WebTestActions.SelectByVisibleText(CompanyCountry, SelectCompanyCountry);
    }
	
	public void enterpostCode(String postCodetxt) {
		/*postCode.clear();
		postCode.sendKeys(postCode);*/
		WebTestActions.writeText(postCodetxt, postCode);
	}
	
	public void SelectAddress(String Address) throws InterruptedException{
		/*SelectAddress.click();
        Select titleDropdown = new Select(SelectAddress);
        titleDropdown.selectByVisibleText(Address);*/
        WebTestActions.SelectByVisibleText(Address, SelectAddress);
    }
	
	public void enterAddressLine1(String AddressLine) {
		/*AddressLine1.clear();
		AddressLine1.sendKeys(AddressLine1);*/
		WebTestActions.writeText(AddressLine, AddressLine1);
	}
	
	public void enterAddressLine2(String AddressLine) {
		/*AddressLine2.clear();
		AddressLine2.sendKeys(AddressLine2);*/
		WebTestActions.writeText(AddressLine, AddressLine2);
	}
	
	public void enterTownCity(String TownCitytxt) {
		/*TownCity.clear();
		TownCity.sendKeys(TownCity);*/
		WebTestActions.writeText(TownCitytxt, TownCity);
	}
	
	public void enterCounty(String Countytxt) {
		/*County.clear();
		County.sendKeys(County);*/
		WebTestActions.writeText(Countytxt, County);
	}
	
	public void enternumberOfAccounts(String numberOfAccountstxt) {
		/*numberOfAccounts.clear();
		numberOfAccounts.sendKeys(numberOfAccounts);*/
		WebTestActions.writeText(numberOfAccountstxt, numberOfAccounts);
	}
	
	public void enterAccountNumber1(String AccountNumber) {
		/*AccountNumber1.clear();
		AccountNumber1.sendKeys(AccountNumber1);*/
		WebTestActions.writeText(AccountNumber, AccountNumber1);
	}
	
	public void enterUsername(String Usernametxt) {
		/*Username.clear();
		Username.sendKeys(Username);*/
		WebTestActions.writeText(Usernametxt, Username);
	}
	
	public void enterConfirmUsername(String ConfirmUsernametxt) {
		/*ConfirmUsername.clear();
		ConfirmUsername.sendKeys(ConfirmUsername);*/
		WebTestActions.writeText(ConfirmUsernametxt, ConfirmUsername);
	}
	
	public void ClickAgreeTermsConditions() {
		WebTestActions.ClearText(iAgreeTermsConditions); //iAgreeTermsConditions.clear();
		WebTestActions.clickElement(iAgreeTermsConditions); //iAgreeTermsConditions.click();
	}
	
	public void ClickApplyBtn() throws InterruptedException {
		WebTestActions.clickElement(ApplyBtn); //ApplyBtn.click();
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
	}

	public void VerifyAllErrorMessages() throws InterruptedException {
		
		int rowNuber = 0;
		rowNuber = rowNuber + 1;
		
		testdata.setWorkbook();
		testdata.setCellData(0,0,"FIELD");
		testdata.setCellData(0,1,"EXPECTED_ERROR_MESSAGE");
		testdata.setCellData(0,2,"ACTUL_ERROR_MESSAGE");
		testdata.setCellData(0,3,"TEST_RESULT");
		
		rowNuber = VerifyErrorMessagesOfBlankFields(testdata,rowNuber);
		
		VerifyErrorMessages(testdata,rowNuber);
		
		testdata.saveWorkbook();
	}
	
	private int VerifyErrorMessagesOfBlankFields(TestDataUtil testdata, int rowNuber) throws InterruptedException {
				
		ClickApplyBtn();
			
		//SelectTitle("Title");
		//Title is required
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Title");
		testdata.setCellData(rowNuber,1,"Title is required");
		String TitleEerrortxt = WebTestActions.getObjectText(TitleEerror);
		testdata.setCellData(rowNuber,2,TitleEerrortxt);
		if(TitleEerrortxt.equalsIgnoreCase("Title is required")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterFirstName("firstName");
		//First Name is required
		//First Name cannot exceed 40 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"First Name");
		testdata.setCellData(rowNuber,1,"First Name is required");
		String FirstNameEerrortxt = WebTestActions.getObjectText(FirstNameEerror);
		testdata.setCellData(rowNuber,2,FirstNameEerrortxt);
		if((FirstNameEerrortxt.equalsIgnoreCase("First Name is required")) ||
				(FirstNameEerrortxt.equalsIgnoreCase("First Name cannot exceed 40 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterlastName("lastName");
		//Last Name is required
		//Last Name cannot exceed 80 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Last Name");
		testdata.setCellData(rowNuber,1,"Last Name is required");
		String LastNameErrortxt = WebTestActions.getObjectText(LastNameError);
		testdata.setCellData(rowNuber,2,LastNameError.getText());
		if((LastNameErrortxt.equalsIgnoreCase("Last Name is required")) ||
				(LastNameErrortxt.equalsIgnoreCase("Last Name cannot exceed 80 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterJobTitle("JobTitle");
		//Job Title is required
		//Job Title Cannot exceed 255 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Job Title");
		testdata.setCellData(rowNuber,1,"Job Title is required");
		String JobTitleErrortxt = WebTestActions.getObjectText(JobTitleError);
		testdata.setCellData(rowNuber,2,JobTitleErrortxt);
		if((JobTitleErrortxt.equalsIgnoreCase("Job Title is required")) ||
				(JobTitleErrortxt.equalsIgnoreCase("Job Title Cannot exceed 255 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterEmail("Email");
		//Email is required
		//Last Name cannot exceed 76 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Email");
		testdata.setCellData(rowNuber,1,"Email is required");
		String EmailErrortxt = WebTestActions.getObjectText(EmailError);
		testdata.setCellData(rowNuber,2,EmailErrortxt);
		if((EmailErrortxt.equalsIgnoreCase("Email is required")) ||
				(EmailErrortxt.equalsIgnoreCase("Last Name cannot exceed 76 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
				
		//enterMobile("Mobile");
		//Mobile is required
		//Mobile number cannot exceed 12 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Mobile");
		testdata.setCellData(rowNuber,1,"Mobile is required");
		String MobileErrortxt = WebTestActions.getObjectText(MobileError);
		testdata.setCellData(rowNuber,2,MobileErrortxt);
		if((MobileErrortxt.equalsIgnoreCase("Mobile is required")) ||
				(MobileErrortxt.equalsIgnoreCase("Mobile number cannot exceed 12 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterCompanyName("CompanyName");
		//Company Name is required
		//Company name cannot exceed 255 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Company Name");
		testdata.setCellData(rowNuber,1,"Company Name is required");
		String CompanyNameErrortxt = WebTestActions.getObjectText(CompanyNameError);
		testdata.setCellData(rowNuber,2,CompanyNameErrortxt);
		if((CompanyNameErrortxt.equalsIgnoreCase("Company Name is required")) ||
				(CompanyNameErrortxt.equalsIgnoreCase("Company name cannot exceed 255 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//SelectCompanyCountry("CompanyCountry");
		//Please Select a valid Country
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Country Name");
		testdata.setCellData(rowNuber,1,"Please Select a valid Country");
		String CompanyCountryErrortxt = WebTestActions.getObjectText(CompanyCountryError);
		testdata.setCellData(rowNuber,2,CompanyCountryErrortxt);
		if(CompanyCountryErrortxt.equalsIgnoreCase("Please Select a valid Country")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterpostCode("postCode");
		//Postcode is required
		//Please enter no more than 20 characters.
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Postcode");
		testdata.setCellData(rowNuber,1,"Postcode is required");
		String PostCodeErrortxt = WebTestActions.getObjectText(PostCodeError);
		testdata.setCellData(rowNuber,2,PostCodeErrortxt);
		if((PostCodeErrortxt.equalsIgnoreCase("Postcode is required")) ||
				(PostCodeErrortxt.equalsIgnoreCase("Please enter no more than 20 characters."))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterAddressLine1("AddressLine1");
		//Address 1 is required
		//Address Line 1 cannot exceed 255 characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Address 1");
		testdata.setCellData(rowNuber,1,"Address 1 is required");
		String AddressLine1Errortxt = WebTestActions.getObjectText(PostCodeError);
		testdata.setCellData(rowNuber,2,AddressLine1Errortxt);
		if((AddressLine1Errortxt.equalsIgnoreCase("Address 1 is required")) ||
				(AddressLine1Errortxt.equalsIgnoreCase("Address Line 1 cannot exceed 255 characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		/*//enterAddressLine2("AddressLine2");
		//Address Line 2 cannot exceed 255 character
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Address Line 2");
		testdata.setCellData(rowNuber,1,"Address Line 2 cannot exceed 255 character");
		testdata.setCellData(rowNuber,2,AddressLine2Error.getText());
		if(AddressLine2Error.getText().equalsIgnoreCase("Address Line 2 cannot exceed 255 character")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}*/
		
		//enterTownCity("TownCity");
		//Address 1 is required
		//City/Town cannot exceed 40 characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"City/Town");
		testdata.setCellData(rowNuber,1,"City/Town is required");
		String TownCityErrortxt = WebTestActions.getObjectText(TownCityError);
		testdata.setCellData(rowNuber,2,TownCityErrortxt);
		if((TownCityErrortxt.equalsIgnoreCase("City/Town is required")) ||
				(TownCityErrortxt.equalsIgnoreCase("City/Town cannot exceed 40 characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		/*//enterCounty("County");
		//County Cannot Exceed 50 chars
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"County");
		testdata.setCellData(rowNuber,1,"County Cannot Exceed 50 chars");
		testdata.setCellData(rowNuber,2,CountyError.getText());
		if(CountyError.getText().equalsIgnoreCase("County Cannot Exceed 50 chars")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}*/
		
		//enterAccountNumber1("AccountNumber1");
		//Account number is required
		//Account number should contain 6 characters only
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Account number");
		testdata.setCellData(rowNuber,1,"Account number is required");
		String AccountNumber1Errortxt = WebTestActions.getObjectText(AccountNumber1Error);
		testdata.setCellData(rowNuber,2,AccountNumber1Errortxt);
		if((AccountNumber1Errortxt.equalsIgnoreCase("Account number is required")) ||
				(AccountNumber1Errortxt.equalsIgnoreCase("Account number should contain 6 characters only"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterUsername("Username");
		//Username is required
		//Username cannot exceed 50 chars
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Username");
		testdata.setCellData(rowNuber,1,"Username is required");
		String UsernameErrortxt = WebTestActions.getObjectText(UsernameError);
		testdata.setCellData(rowNuber,2,UsernameErrortxt);
		if((UsernameErrortxt.equalsIgnoreCase("Username is required")) ||
				(UsernameErrortxt.equalsIgnoreCase("Username cannot exceed 50 chars"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//enterConfirmUsername("ConfirmUsername");
		//Confirm Username is required
		//Username and Confirm Username Should be same
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Confirm Username");
		testdata.setCellData(rowNuber,1,"Confirm Username is required");
		String ConfirmUsernameErrortxt = WebTestActions.getObjectText(ConfirmUsernameError);
		testdata.setCellData(rowNuber,2,ConfirmUsernameErrortxt);
		if((ConfirmUsernameErrortxt.equalsIgnoreCase("Confirm Username is required")) ||
				(ConfirmUsernameErrortxt.equalsIgnoreCase("Username and Confirm Username Should be same"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		//Kindly agree the Terms and Condition
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Terms and Condition");
		testdata.setCellData(rowNuber,1,"Kindly agree the Terms and Condition");
		String iAgreeTermsConditionsErrortxt = WebTestActions.getObjectText(iAgreeTermsConditionsError);
		testdata.setCellData(rowNuber,2,iAgreeTermsConditionsErrortxt);
		if(iAgreeTermsConditionsErrortxt.equalsIgnoreCase("Kindly agree the Terms and Condition")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		return rowNuber;
				
	}
	
	private int VerifyErrorMessages(TestDataUtil testdata, int rowNuber) throws InterruptedException {
		
		ClickApplyBtn();
			
		enterFirstName(generateRandomString(41));
		ClickApplyBtn();
		//First Name is required
		//First Name cannot exceed 40 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"First Name");
		testdata.setCellData(rowNuber,1,"First Name cannot exceed 40 Characters");
		String FirstNameEerrortxt = WebTestActions.getObjectText(FirstNameEerror);
		testdata.setCellData(rowNuber,2,FirstNameEerrortxt);
		if((FirstNameEerrortxt.equalsIgnoreCase("Invalid First Name")) ||
				(FirstNameEerrortxt.equalsIgnoreCase("First Name cannot exceed 40 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterlastName(generateRandomString(81));
		ClickApplyBtn();
		//Last Name is required
		//Last Name cannot exceed 80 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Last Name");
		testdata.setCellData(rowNuber,1,"Last Name cannot exceed 80 Characters");
		String LastNameErrortxt = WebTestActions.getObjectText(LastNameError);
		testdata.setCellData(rowNuber,2,LastNameError.getText());
		if((LastNameErrortxt.equalsIgnoreCase("Invalid Last Name")) ||
				(LastNameErrortxt.equalsIgnoreCase("Last Name cannot exceed 80 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterJobTitle(generateRandomString(256));
		ClickApplyBtn();
		//Job Title is required
		//Job Title Cannot exceed 255 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Job Title");
		testdata.setCellData(rowNuber,1,"Job Title Cannot exceed 255 Characters");
		String JobTitleErrortxt = WebTestActions.getObjectText(JobTitleError);
		testdata.setCellData(rowNuber,2,JobTitleErrortxt);
		if((JobTitleErrortxt.equalsIgnoreCase("Invalid Job Title")) ||
				(JobTitleErrortxt.equalsIgnoreCase("Job Title Cannot exceed 255 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterEmail(generateRandomString(77));
		ClickApplyBtn();
		//Email is require
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Email");
		testdata.setCellData(rowNuber,1,"Email Invalid");
		String EmailErrortxt = WebTestActions.getObjectText(EmailError);
		testdata.setCellData(rowNuber,2,EmailErrortxt);
		if((EmailErrortxt.equalsIgnoreCase("Email is required")) ||
				(EmailErrortxt.equalsIgnoreCase("Email Invalid"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL - '@' and '.'  is not mendatory to validate email address");
		}
				
		enterMobile(generateRandomNumbers(13));
		ClickApplyBtn();
		//Mobile is required
		//Mobile number cannot exceed 12 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Mobile");
		testdata.setCellData(rowNuber,1,"Mobile number cannot exceed 12 Characters");
		String MobileErrortxt = WebTestActions.getObjectText(MobileError);
		testdata.setCellData(rowNuber,2,MobileErrortxt);
		if((MobileErrortxt.equalsIgnoreCase("Mobile is required")) ||
				(MobileErrortxt.equalsIgnoreCase("Mobile number cannot exceed 12 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterCompanyName(generateRandomString(256));
		ClickApplyBtn();
		//Company Name is required
		//Company name cannot exceed 255 Characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Company Name");
		testdata.setCellData(rowNuber,1,"Company name cannot exceed 255 Characters");
		String CompanyNameErrortxt = WebTestActions.getObjectText(CompanyNameError);
		testdata.setCellData(rowNuber,2,CompanyNameErrortxt);
		if((CompanyNameErrortxt.equalsIgnoreCase("Company Name is required")) ||
				(CompanyNameErrortxt.equalsIgnoreCase("Company name cannot exceed 255 Characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
			
		enterpostCode(generateRandomNumbers(21));
		ClickApplyBtn();
		//Postcode is required
		//Please enter no more than 20 characters.
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Postcode");
		testdata.setCellData(rowNuber,1,"Please enter no more than 20 characters.");
		String PostCodeErrortxt = WebTestActions.getObjectText(PostCodeError);
		testdata.setCellData(rowNuber,2,PostCodeErrortxt);
		if((PostCodeErrortxt.equalsIgnoreCase("Postcode is required")) ||
				(PostCodeErrortxt.equalsIgnoreCase("Please enter no more than 20 characters."))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterAddressLine1(generateRandomString(256));
		ClickApplyBtn();
		//Address 1 is required
		//Address Line 1 cannot exceed 255 characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Address 1");
		testdata.setCellData(rowNuber,1,"Address Line 1 cannot exceed 255 characters");
		String AddressLine1Errortxt = WebTestActions.getObjectText(AddressLine1Error);
		testdata.setCellData(rowNuber,2,AddressLine1Errortxt);
		if((AddressLine1Errortxt.equalsIgnoreCase("Address 1 is required")) ||
				(AddressLine1Errortxt.equalsIgnoreCase("Address Line 1 cannot exceed 255 characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterAddressLine2(generateRandomString(256));
		ClickApplyBtn();
		//Address Line 2 cannot exceed 255 character
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Address Line 2");
		testdata.setCellData(rowNuber,1,"Address Line 2 cannot exceed 255 characters");
		String AddressLine2Errortxt = WebTestActions.getObjectText(AddressLine2Error);
		testdata.setCellData(rowNuber,2,AddressLine2Errortxt);
		if(AddressLine2Errortxt.equalsIgnoreCase("Address Line 2 cannot exceed 255 characters")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterTownCity(generateRandomString(41));
		ClickApplyBtn();
		//Address 1 is required
		//City/Town cannot exceed 40 characters
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"City/Town");
		testdata.setCellData(rowNuber,1,"City/Town cannot exceed 40 characters");
		String TownCityErrortxt = WebTestActions.getObjectText(TownCityError);
		testdata.setCellData(rowNuber,2,TownCityErrortxt);
		if((TownCityErrortxt.equalsIgnoreCase("Invalid City/Town")) ||
				(TownCityErrortxt.equalsIgnoreCase("City/Town cannot exceed 40 characters"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterCounty(generateRandomString(51));
		ClickApplyBtn();
		//County Cannot Exceed 50 chars
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"County");
		testdata.setCellData(rowNuber,1,"County Cannot Exceed 50 chars");
		String CountyErrortxt = WebTestActions.getObjectText(CountyError);
		testdata.setCellData(rowNuber,2,CountyErrortxt);
		if((CountyErrortxt.equalsIgnoreCase("Invalid County")) || 
				CountyErrortxt.equalsIgnoreCase("County Cannot Exceed 50 chars")){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterAccountNumber1(generateRandomNumbers(7));
		ClickApplyBtn();
		//Account number is required
		//Account number should contain 6 characters only
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Account number");
		testdata.setCellData(rowNuber,1,"Account number should contain 6 characters only");
		String AccountNumber1Errortxt = WebTestActions.getObjectText(AccountNumber1Error);
		testdata.setCellData(rowNuber,2,AccountNumber1Errortxt);
		if((AccountNumber1Errortxt.equalsIgnoreCase("Account number is required")) ||
				(AccountNumber1Errortxt.equalsIgnoreCase("Account number should contain 6 characters only"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}
		
		enterUsername(generateRandomString(51));
		ClickApplyBtn();
		//Username is required
		//Username cannot exceed 50 chars
		rowNuber = rowNuber + 1;
		testdata.setCellData(rowNuber,0,"Username");
		testdata.setCellData(rowNuber,1,"Username cannot exceed 50 chars");
		String UsernameErrortxt = WebTestActions.getObjectText(UsernameError);
		testdata.setCellData(rowNuber,2,UsernameErrortxt);
		if((UsernameErrortxt.equalsIgnoreCase("Username is required")) ||
				(UsernameErrortxt.equalsIgnoreCase("Username cannot exceed 50 chars"))){
			testdata.setCellData(rowNuber,3,"PASS");
		} else {
			testdata.setCellData(rowNuber,3,"FAIL");
		}

		return rowNuber;
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
	
}