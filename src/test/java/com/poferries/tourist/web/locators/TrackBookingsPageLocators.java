package com.poferries.tourist.web.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TrackBookingsPageLocators {

	@FindBy(how = How.XPATH, using = "//a[@href='/TrackBooking\'][@class=' ']")
	public WebElement TrackBookingLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Track")
	public WebElement TrackBookinglink;
	
	@FindBy(how = How.XPATH, using = "//div[@id='panelFilter']//a[@class='close icon']")
	public WebElement closeFilter;
		
	@FindBy(how = How.XPATH, using = "//a[@title='Filter By'][@class='filterBtn']")
	public WebElement filterBtn;
	
	@FindBy(how = How.XPATH, using = "//select[@id='Route']/..//div[@name='multiselectFormText']")
	public WebElement RouteDropDown;
	
	@FindBy(how = How.XPATH, using = "//select[@id='Route']/..//label[text()='Dover to Calais']/../input[@type='checkbox']")
	public WebElement RouteCheckBox;	

	@FindBy(how = How.ID, using = "apply")
	public WebElement ApplyBtn;

	@FindBy(how = How.ID, using = "pannelClear")
	public WebElement ClearBtn;
	
	@FindBy(how = How.ID, using = "UnitType")
	public WebElement UnitType;
	
}
