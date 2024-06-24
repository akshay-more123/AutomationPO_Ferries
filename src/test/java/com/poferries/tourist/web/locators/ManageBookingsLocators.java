package com.poferries.tourist.web.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManageBookingsLocators {


//	@FindBy(how = How.XPATH, using = "//a[@href='/ManageBookings']")
//	public WebElement ManageBookings;
	
	@FindBy(how = How.LINK_TEXT, using = "Manage Bookings")
	public WebElement ManageBookings;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Filter By']")
	public WebElement Filter;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Filter By'][@class='filterBtn']")
	public WebElement filterBtn;
	@FindBy(how = How.ID, using = "ChooseAccount")
	public WebElement FILTER_BOOKINGS_BY_ChooseAccount;
	
	@FindBy(how = How.ID, using = "Route")
	public WebElement FILTER_BOOKINGS_BY_Route;
	
	@FindBy(how = How.ID, using = "UnitType")
	public WebElement FILTER_BOOKINGS_BY_UnitType;
	
	@FindBy(how = How.ID, using = "sailingFilterCheckBox")
	public WebElement FILTER_BOOKINGS_sailingFilterCheckBox;
	
	@FindBy(how = How.ID, using = "ui-datepicker-div")
	public WebElement FILTER_BOOKINGS_datepicker;	
	
	@FindBy(how = How.ID, using = "scheduleFilterDatePicker")
	public WebElement FILTER_BOOKINGS_scheduleFilterDatePicker;
	
	@FindBy(how = How.ID, using = "selectTime")
	public WebElement FILTER_BOOKINGS_selectTime;
	
	@FindBy(how = How.ID, using = "scheduleDatePicker")
	public WebElement FILTER_BOOKINGS_BY_scheduleDatePicker;
	
	@FindBy(how = How.ID, using = "scheduleDatePicker2")
	public WebElement FILTER_BOOKINGS_BY_scheduleDatePicker2;
	
	@FindBy(how = How.ID, using = "UnitID")
	public WebElement FILTER_BOOKINGS_BY_UnitID;
	
	@FindBy(how = How.ID, using = "waybill")
	public WebElement FILTER_BOOKINGS_BY_waybill;
	
	@FindBy(how = How.ID, using = "jobReference")
	public WebElement FILTER_BOOKINGS_BY_jobReference;
	
	@FindBy(how = How.ID, using = "apply")
	public WebElement ApplyBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='PageContentArea']/section[1]/div[1]/div/div[1]/a/span")
	public WebElement selectAccount;
	
	@FindBy(how = How.XPATH, using = "//*[@id='AccountBand_248500']/a")
	public WebElement select248500Account;
	
	@FindBy(how = How.ID, using = "pannelClear")
	public WebElement ClearBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='panelFilter']//a[@class='close icon']")
	public WebElement closeFilter;
	
	@FindBy(how = How.XPATH, using = "//div[@id='panelDetail']//a[@class='close icon']")
	public WebElement close_BOOKING_DETAILS;
	
	//************************************
		//Successful Bookings
	//************************************
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='viewField']/label[text()='From:']/../div")
	public WebElement successfulBookings_VerifyText_From;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='viewField']/label[text()='To:']/../div")
	public WebElement successfulBookings_VerifyText_To;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Way Bill No: ']/span")
	public WebElement successfulBookings_VerifyWayBillNo;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Travel Date:  ']/span")
	public WebElement successfulBookings_VerifyTravelDate;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Unit Type: ']/span")
	public WebElement successfulBookings_VerifyUnitTypes;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Unit ID: ']/span")
	public WebElement successfulBookings_VerifyUnitIDs;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Job Reference: ']/span")
	public WebElement successfulBookings_VerifyJobReference;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Account: ']/span")
	public WebElement successfulBookings_VerifyAccount;
	
	//************************************
		//BOOKING DETAILS
	//************************************
		
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Account: ']/../div")
	public WebElement VerifyText_Account_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='From:']/../div")
	public WebElement VerifyText_From_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='To:']/../div")
	public WebElement VerifyText_To_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='WayBill No: ']/../div")
	public WebElement VerifyText_WayBillNo_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Booking Date:']/../div")
	public WebElement VerifyText_BookingDate_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Unit Type: ']/../div")
	public WebElement VerifyText_UnitType_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Unit ID: ']/../div")
	public WebElement VerifyText_UnitID_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Unit Length (M):']/../div")
	public WebElement VerifyText_UnitLength_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Plug-in:']/../div")
	public WebElement VerifyText_PlugIn_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Drivers:']/../div")
	public WebElement VerifyText_Drivers_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Temp (°C):']/../div")
	public WebElement VerifyText_Temp_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Job Reference:']/../div")
	public WebElement VerifyText_JobReference_BD;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showDetails']//div[@class='viewField']/label[text()='Description:']/../div")
	public WebElement VerifyText_Description_BD;

//************************************
	//Quick Search
//************************************
	
	@FindBy(how = How.ID, using = "QuickSearchInput")
	public WebElement mngBooking_QuickSearch;
	
//	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']/div[@class='eachLine']//span[@class='openViewPanel']")
//	public WebElement mngBooking_FirstWayBillNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']//div[@class='infoColOne']//*[text()='WayBill No: ']/span")
	public WebElement mngBooking_FirstWayBillNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']//div[@class='infoColTwo']//*[text()='Unit ID: ']/span")
	public WebElement mngBooking_FirstWayUnitID;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']//div[@class='infoColTwo']//*[text()='Job Reference: ']/span")
	public WebElement mngBooking_FirstJobRef;
	
	@FindBy(how = How.XPATH, using = "//a[@class='helpIcon']")
	public List<WebElement> mngBooking_helpIcons;
	//a[@class='helpIcon']/..//input[@name='GMR'][@placeholder='Enter GMR']
	
	@FindBy(how = How.XPATH, using = "//*[@class='overlayRtPanel open']//button[@class='btn-secondary closePanelSide'][text()='CLOSE']")
	public WebElement mngBooking_helpIcon_Close;
	
	@FindBy(how = How.XPATH, using = "//*[@class='overlayRtPanel open']//div[@class='helpPara']/p[2]")
	public List<WebElement> mngBooking_helpParas;
		
	@FindBy(how = How.XPATH, using = "//div[@id='tileContainer']//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='WayBill No: ']/span[text()='?']")
	public WebElement mngBooking_FindWayBillNumber;
		
	@FindBy(how = How.XPATH, using = "//div[@id='tileContainer']//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='WayBill No: ']/span")
	public WebElement mngBooking_Find_VerifyText_WayBillNo;

	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='divRoute']")
	public WebElement mngBooking_VerifyText_Route;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='viewField']/label[text()='From:']/../div")
	public WebElement mngBooking_VerifyText_From;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='viewField']/label[text()='To:']/../div")
	public WebElement mngBooking_VerifyText_To;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='Travel Date: ']/./span")
	public WebElement mngBooking_VerifyText_TravelDate;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='Unit Type: ']/./span")
	public WebElement mngBooking_VerifyText_UnitType;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='Unit ID: ']/./span")
	public WebElement mngBooking_VerifyText_UnitID;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='Job Reference: ']/./span")
	public WebElement mngBooking_VerifyText_JobReference;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachItem'][not(contains(@style,'display: none;'))]//div[@class='eachLine'][text()='Account: ']/./span")
	public WebElement mngBooking_VerifyText_Account;
	
}
