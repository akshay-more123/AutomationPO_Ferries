package com.poferries.tourist.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class UpdateTW_WalletPage_3669 {
	
	@FindBy(how = How.XPATH, using = "//span[@class='text']")
    public WebElement ATWallet;
		
	@FindBy(how = How.XPATH, using = "//span[@class='checkmark']")
    public WebElement GoodsTransit;
	
	@FindBy(how = How.XPATH, using = "//label[@id='TransportingOption_CARRY_MAIL']")
    public WebElement mail;
	
//	@FindBy(how = How.XPATH, using = "//label[text()='I agree to the'][@class='checkBoxStyled']")
//    public WebElement Terms;
//	
	@FindBy(how = How.XPATH, using = "//button[text()='Activate'][@class='btn-primary walletSubmit']")
	public WebElement ActivateButton;
	
	 
	 Actions WebTestActions;
		ConfigReader configReader = new ConfigReader();
	 
	 public UpdateTW_WalletPage_3669(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		    PageFactory.initElements(WebTestActions.driver, this);
		}
	 
	 public void clickATWallet(){
	   
		 WebTestActions.clickElement(ATWallet);
		 
	 }
	 public void waitATWallet() throws TimeoutException
		{
			
		WebTestActions.waitForElementToBeClickable(ATWallet);
		}
	 public void SelectDestination(String Destination){
		    WebElement Element = WebTestActions.driver.findElement(By.className("form-control"));	    	
		    WebTestActions.SelectByVisibleText(Destination, Element);
		}
	 public void clickDestination(){
		   
		 SelectDestination("United Kingdom");
	 }
		
//	 public void waitDestination() throws TimeoutException
//		{
//			
//		WebTestActions.waitForElementToBeClickable(Destination);
//		}
		
	 public void clickGoodsTransit(){
	       
		 WebTestActions.clickElement(GoodsTransit);
		 clickmail();
	    }
	 public void waitGoodsTransit() throws TimeoutException
		{
			
		WebTestActions.waitForElementToBeClickable(GoodsTransit);
		}
	 
	 public void clickmail(){
		   
		 WebTestActions.clickElement(mail);
		 
	 }
	 public void clickTerms() throws InterruptedException{
		 WebElement Element = WebTestActions.driver.findElement(By.xpath("//div[@id='walletTermsFieldGroup']/label[text()='I agree to the']"));
		 JavascriptExecutor js = (JavascriptExecutor) WebTestActions.driver;
			js.executeScript("arguments[0].scrollIntoView(true);", Element);
			Element.click();
			Thread.sleep(5000);	
	 }
//	 public void waitTerms() throws TimeoutException
//		{
//			
//		WebTestActions.waitForElementToBeClickable(Terms);
//		}
	 
	 public void clickActivateButton(){
	       
		 WebTestActions.clickElement(ActivateButton);
	    }
	 public void waitActivateButton() throws TimeoutException
		{
			
		WebTestActions.waitForElementToBeClickable(ActivateButton);
		}
}

