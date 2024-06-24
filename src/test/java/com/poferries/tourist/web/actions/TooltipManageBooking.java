package com.poferries.tourist.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.locators.ManageBookingsLocators;
import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.Seleniumdriver;
import com.web.actions.Actions;


public class TooltipManageBooking {

		
	@FindBy(how = How.XPATH, using = "//div[@class='actionColumns']//a[@class='helpIcon']")
	public WebElement Tooltip;
	@FindBy(how = How.XPATH, using = "//select[@id='Route']//option[@value='LAR-CYN']")
    public WebElement larnecairnryanRouteOption;
	@FindBy(how = How.XPATH, using = "//select[@id='Route']//option[@value='LIV-DUB']")
    public WebElement liverpooldublinRouteOption;
	@FindBy(how = How.XPATH, using = "//div[@id='panelGMRPBNHelpPanelBody']/div/p[@class='heading']")
	public WebElement GMRtext;
		
	@FindBy(how = How.LINK_TEXT, using = "Brexit page")
	public WebElement pbngmrtext;
	
	
	Actions WebTestActions;
	ConfigReader configReader = new ConfigReader();


	public TooltipManageBooking(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
	    PageFactory.initElements(WebTestActions.driver, this);
	}
	
	public void LCRouteSelect() {
		WebTestActions.clickElement(larnecairnryanRouteOption);
	}
	public void LDRouteSelect() {
		WebTestActions.clickElement(liverpooldublinRouteOption);
	}
	public void clickOnTooltipLink() throws InterruptedException {
		WebTestActions.clickElement(Tooltip);
		waitForTooltipLink();
		Thread.sleep(2000);
		//clickOnpbntext();
	//	waitForpbntext();
	}
	
	public void waitForTooltipLink() throws TimeoutException
	{
		
	WebTestActions.waitForElementToBeClickable(Tooltip);
	}

	public void clickOnpbntext() {
		
		
		WebTestActions.clickElement(pbngmrtext);
		waitForpbntext();
	}
	
	public void waitForpbntext() throws TimeoutException {
		
		
		WebTestActions.waitForElementToBeClickable(pbngmrtext);
	}

	
}
	
	
		
	
	

