package com.poferries.tourist.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;
import com.web.actions.WebActions;

public class LoginPageActions{
	
	@FindBy(how = How.ID, using = "LoginEmail")
	public WebElement userNameEdit;

	@FindBy(how = How.ID, using = "LoginPass")
	public WebElement passwordEdit;

	@FindBy(how = How.ID, using = "LoginUserBtn")
	public WebElement loginUserBtn;

	@FindBy(how = How.XPATH, using = "html/body/div[3]/div")
	public WebElement invalidCredentialsError;

	@FindBy(how = How.XPATH, using = "//*[@id='LoginPass-error']")
	public WebElement passwordError;

	@FindBy(how = How.XPATH, using = "//*[@id='LoginEmail-error']")
	public WebElement usernameError;
	
	@FindBy(how = How.XPATH, using = "//a[@class='closeAds']")
	public WebElement closeAds;
	
	

	ConfigReader configReader = new ConfigReader();
	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public LoginPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// the below method returns the title of the login Page
	public String getLoginPageTitle() {
		//return Seleniumdriver.getDriver().getTitle();
		return WebTestActions.PageTitle();
	}

	// the below method returns the invalid credentials error message
	public String getInvalidCredentialsErrorMessage() {
		//return loginPageLocators.invalidCredentialsError.getText();
		return WebTestActions.getObjectText(invalidCredentialsError);
	}

	// the below method returns the error message displayed below the useraname edit
	public String getUserNameError() {
		//return loginPageLocators.usernameError.getText();
		return WebTestActions.getObjectText(usernameError);
	}

	// the below method returns the error message displayed below the password edit
	public String getPasswordError() {
		//return loginPageLocators.passwordError.getText();
		return WebTestActions.getObjectText(passwordError);
	}

	// method to enter the username
	public void enterUserName(String userName) {
		//loginPageLocators.userNameEdit.sendKeys(userName);
		WebTestActions.writeText(userName,userNameEdit);
	}

	// method to enter the password details
	public void enterPassword(String password) {
		//loginPageLocators.passwordEdit.sendKeys(password);
		WebTestActions.writeText(password,passwordEdit);
	}

	// method to clear the password details
	public void clearPassword() {
		//loginPageLocators.passwordEdit.clear();
		WebTestActions.ClearText(passwordEdit);
	}

	// method to click the signIn Link
	public void clickLogin() {
		WebTestActions.clickElement(loginUserBtn);
		for(int r = 0; r < 1; r++){
			if(WebTestActions.getAllObjects(By.xpath("//a[@class='closeAds']")).size()>0) {
				WebTestActions.clickElement(closeAds);
				break;
			}
		}
	}

	// method to get the reset password alert text
	public String getResetPasswordAlertMessage() {
		return WebTestActions.AlertText(); //Seleniumdriver.getDriver().switchTo().alert().getText();
	}

	// method to close the reset password alert
	public void closeResetPasswordDialog() {
		//Seleniumdriver.getDriver().switchTo().alert().dismiss();
		WebTestActions.AlertDismiss();
	}

	// method to accept the reset password alert
	public void acceptResetPasswordDialog() {
		//Seleniumdriver.getDriver().switchTo().alert().accept();
		WebTestActions.AlertAccept();
	}

	// this method enters the username ,password and clicks login
	public void logInCashUser() {
		enterUserName(configReader.configWeb.getProperty("cashUserName"));
		enterPassword(configReader.configWeb.getProperty("cashPassword"));
		clickLogin();
	}
	
	public void logInSpecialCashUser() {
		enterUserName(configReader.configWeb.getProperty("SpecialcashUser"));
		enterPassword(configReader.configWeb.getProperty("SpecialcashUserPass"));
		WebTestActions.clickElement(loginUserBtn);
	}
	
	public void logInSpecialCashUser1() {
		enterUserName(configReader.configWeb.getProperty("SpecialcashUserName1"));
		enterPassword(configReader.configWeb.getProperty("SpecialcashPassword1"));
		clickLogin();
	}
	
	public void logInSpecialCashUser2() {
		enterUserName(configReader.configWeb.getProperty("SpecialcashUserName2"));
		enterPassword(configReader.configWeb.getProperty("SpecialcashPassword2"));
		clickLogin();
	}

	// this method enters the username ,password and clicks login
	public void logInCreditUser() {
		enterUserName(configReader.configWeb.getProperty("creditUserName"));
		enterPassword(configReader.configWeb.getProperty("creditPassword"));
		clickLogin();
	}

	// wait for book now button to be displayed
	public void waitForUserNameWebEdit() throws TimeoutException {
		//Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(loginPageLocators.userNameEdit));
		WebTestActions.waitForElementToBeVisibile(userNameEdit);
	}

}
