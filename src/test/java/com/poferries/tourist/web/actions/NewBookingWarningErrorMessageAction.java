package com.poferries.tourist.web.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class NewBookingWarningErrorMessageAction {

	
	@FindBy(how = How.XPATH, using = "//select[@id='RouteFilter']//option[@value='TIL-ZEE']")
    public WebElement TilburyToZeebruggeRoute;
	
	@FindBy(how = How.ID, using = "generateFormButton")
    public WebElement generateFormButton;
	
//	 @FindBy(how = How.XPATH, using = "//select[@id='UnitType_0']//option[@value='sdx']")
//	    public WebElement unitTypeDropdown;
	
	@FindBy(how = How.ID, using = "UnitType_0")
    public WebElement unitTypeDropdown; 
	
	 @FindBy(how = How.ID, using = "SubmitBooking")
	    public WebElement SubmitBooking;
	 
	 @FindBy(how = How.ID, using = "SDVErrorMessageText")
	    public WebElement VMessage;
		
	 @FindBy(how = How.XPATH, using = "//em[@class='error invalid-feedback'][not(@style=\"display: none;\")]")
	    public List<WebElement> ErrorMessages;
	    
	    @FindBys({ @FindBy(how = How.XPATH, using = "//em[@class='error invalid-feedback'][not(@style=\"display: none;\")]") })
		public List<WebElement> ErrorMessageList;
	 
	 Actions WebTestActions;
		ConfigReader configReader = new ConfigReader();
	 
	 public NewBookingWarningErrorMessageAction(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		    PageFactory.initElements(WebTestActions.driver, this);
		}
	 
	 public void clickTilburyToZeebruggeRouteOption(){
	        //createBookingPageLocators.europoortHullRouteOption.click();
	    	WebTestActions.clickElement(TilburyToZeebruggeRoute);
	    }
	 public void waitTilburyToZeebruggeRouteOption() throws TimeoutException
		{
			
		WebTestActions.waitForElementToBeClickable(TilburyToZeebruggeRoute);
		}
	 public void clickGobtn(){
	    	WebTestActions.clickElement(generateFormButton);
	    }
	 
	 public void click_Submit_Booking_Button() {
			try {
				//createBookingPageLocators.SubmitBooking.click();
				WebTestActions.clickElement(SubmitBooking);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	 public void clickUnitTypeDropdown() throws InterruptedException{
	        //createBookingPageLocators.unitTypeDropdown.click();
	        WebTestActions.clickElement(unitTypeDropdown);
	        
	        }
	 public List<String> getErrorMessages(){		
			return WebTestActions.getObjectText(ErrorMessageList);
	    }
	 public void selectFilterUnitTypeFromDropDown(String UType) throws InterruptedException {
			
			WebElement Element = WebTestActions.driver.findElement(By.xpath("//select[@id='UnitType_0']//option[text()='" + UType + "']"));
			JavascriptExecutor js = (JavascriptExecutor) WebTestActions.driver;
			js.executeScript("arguments[0].scrollIntoView(true);", Element);
			Element.click();
			Thread.sleep(5000);	
		}

}
