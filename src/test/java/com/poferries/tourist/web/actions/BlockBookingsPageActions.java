package com.poferries.tourist.web.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.Seleniumdriver;
import com.web.actions.Actions;

public class BlockBookingsPageActions {
	
//	@FindBy(how = How.XPATH, using = "//a[@href='/BlockBooking'][@class=' ']")
//	public WebElement BlockBookingLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Block Bookings")
	public WebElement BlockBookingLink;
	 
	@FindBy(how = How.ID, using = "Route")
	public WebElement routeDropDown;

	@FindBy(how = How.ID, using = "UnitType")
	public WebElement UnitTypeSelect;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	public WebElement logOutLink;

	
	//****************************************************
	
	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	public BlockBookingsPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	public String getBlockBookingsPageTitle() {
		return Seleniumdriver.getDriver().getTitle();
	}
	
	public void GoToBlockBookingsPage() {
		WebTestActions.clickElement(BlockBookingLink);
	}

	public void selectRoute(String routeToSelect) {
		WebTestActions.SelectByVisibleText(routeToSelect, routeDropDown);
	}

	public boolean isRouteDropDownDisplayed() {
		return WebTestActions.VerifyObjectIsDisplayed(routeDropDown);
	}
	
	public void selectUnitType(String UnitTypeToSelect) {
		WebTestActions.waitForElementToBeVisibile(UnitTypeSelect);
		WebTestActions.SelectByVisibleText(UnitTypeToSelect, UnitTypeSelect);
	}
	
	public boolean verifyUnitType(String UnitTypeToSelect) {
		boolean match = false;
		List<WebElement> UnitTypeValues = WebTestActions.getDropdownOption(UnitTypeSelect);
		for(WebElement UnitType : UnitTypeValues) {
            if(UnitType.getText().equalsIgnoreCase(UnitTypeToSelect)) {
            	System.out.println("verify Unit Type: " + UnitTypeToSelect);
            	match =  true;
            }
		}
		return match;
	}

}
