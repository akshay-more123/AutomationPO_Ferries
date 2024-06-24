package com.poferries.tourist.web.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class CreateBookingPageLocators {
	
//	@FindBy(how = How.XPATH, using = "//a[@title='Home'][@class=' ']")
//    public WebElement HomeLink;
	@FindBy(how = How.LINK_TEXT, using = "Home")
    public WebElement HomeLink;
	
//	@FindBy(how = How.XPATH, using = "//a[@title='Manage bookings'][@class=' ']")
//    public WebElement ManageBookingLink;	
	
	@FindBy(how = How.LINK_TEXT, using = "Manage Bookings")
    public WebElement ManageBookingLink;	
	
	@FindBy(how = How.XPATH, using = "//a[@href='/CreateBookings'][@class=' ']")
    public WebElement CreateBookingLink;
	
//	@FindBy(how = How.XPATH, using = "//a[@title='New Booking'][@class=' ']")
//	public WebElement NewBooking;
	
	@FindBy(how = How.LINK_TEXT, using = "New Booking")
	public WebElement NewBooking;
	
	@FindBy(how = How.ID, using = "GMRSDVMessageText_0")
    public WebElement GMRSDVMessageText;
	
	@FindBy(how = How.XPATH, using = "//p[1]/a[@href='https://www.pofreight.com/brexit-advice']")
    public WebElement BrexitAdviceLink;
	
    @FindBy(how = How.ID, using = "route")
    public WebElement routeDropdown;
    
    @FindBy(how = How.NAME, using = "Route")
    public WebElement routeDropdowByName;
    
    @FindBy(how = How.ID, using = "RouteFilter")
    public WebElement RouteFilterDropdown;
    
    @FindBy(how = How.XPATH, using = "//select[@id='drivers_0'][@name='drivers']")
    public WebElement driversDropdown;  

    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='DVR-CQF']")
    public WebElement doverCalaisRouteOption;

    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='CQF-DVR']")
    public WebElement CalaisdoverRouteOption;
    
    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='CYN-LAR']")
    public WebElement CairnryanLarneRouteOption;
    
    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='CQF-DUB']")
    public WebElement CalaisDublinRouteOption;
    
    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='DUB-CQF']")
    public WebElement DublinCalaisRouteOption;
    
    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='LAR-CYN']")
    public WebElement LarneCairnryanRouteOption;
    
    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='RTM-HUL']")
    public WebElement europoortHullRouteOption;

    @FindBy(how = How.XPATH, using = "//select[@id='route']//option[@value='ZEE-TIL']")
    public WebElement zeebruggeTilburyRouteOption;
  //div[@class='fly-out form-field-vehicle-type-fly-out vehicleFlyOut0']//label[text()='Full-size']/../input[@type='radio']")
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']//label[text()='Return']")
    public WebElement Returnjourneytype;
    
    @FindBy(how = How.ID, using = "UserDefCurrency")
    public WebElement UserDefCurrency;
    
    @FindBy(how = How.XPATH, using = "//select[@id='UserDefCurrency']//option[@value='EUR']")
    public WebElement selectGBPCurrency;
    
    @FindBy(how = How.ID, using = "UserDefCountry")
    public WebElement Country;
        
    @FindBy(how = How.XPATH, using = "//select[@id='UserDefCountry']//option[@value='GBR']")
    public WebElement selectGBRCountry;
    
    @FindBy(how = How.ID, using = "passengerAdults")
    public WebElement passengerAdults;
    
    @FindBy(how = How.XPATH, using = "//select[@id='passengerAdults']//option[@value='2']")
    public WebElement selectpassengerAdults;

    @FindBy(how = How.ID, using = "goods")
    public WebElement selectGoodsChkBox;
    
    @FindBy(how = How.ID, using = "pets")
    public WebElement selectpetsChkBox;
    
    @FindBy(how = How.ID, using = "StepOneContinue")
    public WebElement StepOneContinue;
    
    @FindBy(how = How.ID, using = "vehicleNumber")
    public WebElement vehicleNumber;
	
    @FindBy(how = How.ID, using = "vehicleLength")
    public WebElement vehicleLength;
    
    @FindBy(how = How.ID, using = "vehicleWidth")
    public WebElement vehicleWidth;
    
    @FindBy(how = How.ID, using = "vehicleOverWeight")
    public WebElement vehicleOverWeight;
    
    @FindBy(how = How.ID, using = "StepTwoContinue")
    public WebElement StepTwoContinue;
    
    @FindBy(how = How.ID, using = "successfulBookingsBlock")
    public WebElement successfulBookingsBlock;
    
    //*********************************************************
    	
	@FindBy(how = How.ID, using = "rev-vehUnitId")
	public WebElement UnitIDLable;
	
	@FindBy(how = How.ID, using = "rev-vehLength")
	public WebElement LengthLable;
	
	@FindBy(how = How.ID, using = "rev-vehHeight")
	public WebElement HeightLable;
	
	@FindBy(how = How.ID, using = "rev-vehWidth")
	public WebElement WidthLable;
	
	@FindBy(how = How.ID, using = "rev-vehWeight")
	public WebElement WeightLable;
	
	@FindBy(how = How.ID, using = "rev-adults")
	public WebElement PassengersLable;
	
	@FindBy(how = How.ID, using = "BillingAddrCB")
	public WebElement BillingAddrCBCheckBox;
	
	@FindBy(how = How.ID, using = "SearchPostCodeIcon")
	public WebElement SearchPostCodeIcon;
	
	@FindBy(how = How.ID, using = "userDetsPostcode")
	public WebElement SearchuserDetsPostcode;
	
	@FindBy(how = How.CLASS_NAME, using = "form-check-input")
	public WebElement SelectbillingAddress;
	
	@FindBy(how = How.ID, using = "userDetsMultiAddrBtn")
	public WebElement SelectbillingAddressBtn;
	
	@FindBy(how = How.ID, using = "PaymentTermsCheckBox")
	public WebElement PaymentTermsCheckBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='paymentTermsCheckBox']")
	public WebElement paymentTermsCheckBox;
	
	@FindBy(how = How.ID, using = "proceedToPayBtn")
	public WebElement proceedToPayBtn;
	
	//*[@id="bookingTilesContainer"]/div[@data-element='0']//a[@class='amend']
	@FindBy(how = How.XPATH, using = "//div[@data-element='0']//a[@class='amend']")
	public WebElement AmendLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='panelAmend']//button[@class='btn-secondary closePanelSide']")
	public WebElement AmendCloseButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='panelAmend']//a[@class='close icon pgiconclose']")
	public WebElement AmendCloseLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']//a[text()='Amend booking']")
	public WebElement AmendBookingLink;	
		
    //*********************************************************
	
	@FindBy(how = How.ID, using = "amount")
	public WebElement amountLable;
	
	@FindBy(how = How.ID, using = "cardNumber")
	public WebElement cardNumber;
	
	@FindBy(how = How.ID, using = "expiryMonth")
	public WebElement expiryMonth;
	
	@FindBy(how = How.ID, using = "expiryYear")
	public WebElement expiryYear;
	
	@FindBy(how = How.ID, using = "csc")
	public WebElement csc;
	
	@FindBy(how = How.XPATH, using = "//select[@id='expiryMonth']//option[@value='12']")
	public WebElement selectexpiryMonth;
	
	@FindBy(how = How.XPATH, using = "//select[@id='expiryYear']//option[@value='2022']")
	public WebElement selectexpiryYear;
	
	@FindBy(how = How.ID, using = "btnCancel")
	public WebElement btnCancel;
	
	@FindBy(how = How.ID, using = "btnSubmit")
	public WebElement btnSubmit;
	
	@FindBy(how = How.XPATH, using = "//*[@id='confirm-booking']//span")
	public WebElement confirmBooking;
	
	@FindBy(how = How.ID, using = "GoToHome")
	public WebElement GoToHome;
	
	@FindBy(how = How.XPATH, using = "//a[@class='iconHelp']")
    public List<WebElement> tooltips;
	
	
	//*********************************************************
	//Cash Booking elements
	
	@FindBy(how = How.ID, using = "PluginCheckBox_0")
    public WebElement PluginCheckBox_0;
	
	@FindBy(how = How.ID, using = "UnitTemperature_0")
    public WebElement UnitTemperature_0;
	
	@FindBy(how = How.ID, using = "ReturnTripCheckBox_0")
    public WebElement ReturnTripCheckBox_0;
	
	@FindBy(how = How.ID, using = "ReturnJobReference_0")
    public WebElement ReturnJobReference_0;
	
	@FindBy(how = How.ID, using = "ReturnJobDescription_0")
    public WebElement ReturnJobDescription_0;
	
	@FindBy(how = How.ID, using = "copyButton_0")
    public WebElement copyButton_0;
	
	@FindBy(how = How.ID, using = "clearButton_0")
    public WebElement clearButton;
	
	@FindBy(how = How.ID, using = "deleteButton_0")
    public WebElement deleteButton_0;
	
	@FindBy(how = How.XPATH, using = "//div[@class='addBookingRow']/a")
    public WebElement addBookingRow;
	
	@FindBy(how = How.XPATH, using = "//input[@id='HazardousGoods']/../span")
    public WebElement HazardousGoodsChkbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='iAgree']/../span")
    public WebElement termschkbox;
	
	@FindBy(how = How.ID, using = "SubmitBooking")
    public WebElement SubmitBooking;
	
	@FindBy(how = How.XPATH, using = "//select[@id='userDetsAddrCountry']//option[@value='GB']")
    public WebElement selectbillingCountry;
	//*********
	
    @FindBy(how = How.ID, using = "AccountFilter")
    public WebElement chooseAccountDropdown;
    		
//    @FindBy(how = How.XPATH, using = "//select[@id='AccountFilter']//option[@value='248500']")
    @FindBy(how = How.XPATH, using = "//select[@id='AccountFilter']//option[@value='500984']")
    public WebElement pofAccount248500;
    
    @FindBy(how = How.XPATH, using = "//select[@id='AccountFilter']//option[@value='500984']")
    public WebElement pofAccount500984;
    
    @FindBy(how = How.XPATH, using = "//select[@id='RouteFilter']//option[@value='DVR-CQF']")
    public WebElement doverCalaisRoute;
    
    @FindBy(how = How.XPATH, using = "//select[@id='RouteFilter']//option[@value='HUL-RTM']")
    public WebElement HullToEuropoortRoute;
    
    
    @FindBy(how = How.XPATH, using = "//select[@id='RouteFilter']//option[@value='DUB-LIV']")
    public WebElement DublinToLiverpoolRoute;
    
    @FindBy(how = How.XPATH, using = "//em[@class='error invalid-feedback'][not(@style=\"display: none;\")]")
    public List<WebElement> ErrorMessages;
    
    @FindBys({ @FindBy(how = How.XPATH, using = "//em[@class='error invalid-feedback'][not(@style=\"display: none;\")]") })
	public List<WebElement> ErrorMessageList;
    
    @FindBy(how = How.ID, using = "numberOfBookingsFilter")
    public WebElement numberOfBookingsFilter;
    	    		
    @FindBy(how = How.XPATH, using = "//select[@id='numberOfBookingsFilter']//option[@value='1']")
    public WebElement numberOfBookingsFilterOption;
    
    @FindBy(how = How.ID, using = "generateFormButton")
    public WebElement generateFormButton;

    @FindBy(how = How.ID, using = "UnitType_0")
    public WebElement unitTypeDropdown;
   
    @FindBy(how = How.XPATH, using = "//input[@id='ReturnJobReference_0']")
    public WebElement ReturnJobReference;
    
    @FindBy(how = How.XPATH, using = "//input[@id='ReturnJobDescription_0']")
    public WebElement ReturnJobDescription;
    
    @FindBy(how = How.XPATH, using = "//select[@id='UnitType_0']//option[@value='CAR']")
    public WebElement Cashunitype;
    
    @FindBy(how = How.XPATH, using = "//select[@id='UnitType_0']//option[@value='cnx']")
    public WebElement containerUnitTypeOption;
    
    @FindBy(how = How.XPATH, using = "//select[@id='UnitType_0']//option[@value='cha']")
    public WebElement ChassisUnitTypeOption;

    @FindBy(how = How.ID, using = "JobDescription_0")
    public WebElement jobDescriptionInput;
    @FindBy(how = How.ID, using = "JobDescription_1")
    public WebElement copyjobDescriptionInput;

    @FindBy(how = How.XPATH, using = "(//*[@name='JobDescription_0'])[1]")
    public WebElement firstJobDescriptionInput;

    @FindBy(how = How.XPATH, using = "(//*[@name='JobDescription_0'])[2]")
    public WebElement secondJobDescriptionInput;
  
    @FindBy(how = How.ID, using = "SelectSailing_0")
    public WebElement cashselecttime;
    
    @FindBy(how = How.ID, using = "UnitID_0")
    public WebElement unitIDInput;
    
    @FindBy(how = How.ID, using = "UnitID_1")
    public WebElement unitcopyIDInput;
    
    @FindBy(how = How.ID, using = "UnitID_0-error")
    public WebElement unitIDInputError;

    @FindBy(how = How.XPATH, using = "(//*[@name='UnitID_0'])[1]")
    public WebElement firstUnitIDInput;

    @FindBy(how = How.XPATH, using = "(//*[@name='UnitID_0'])[2]")
    public WebElement secondUnitIDInput;

    /*@FindBy(how = How.ID, using = "drivers_0")
    public WebElement driverDropdown;*/
    
    @FindBy(how = How.XPATH, using = "//select[@id='drivers_0'][@name='drivers']")
    public WebElement driverDropdown;
    
    @FindBy(how = How.XPATH, using = "//select[@id='drivers_0'][@name='drivers'][@disabled='disabled']")
    public WebElement driverDropdown_disabled;
    
    @FindBy(how = How.ID, using = "PluginRequired_0")
    public WebElement PluginInput;
    
    @FindBy(how = How.ID, using = "SelectDate_0")
    public WebElement DatePicker;
    
    @FindBy(how = How.ID, using = "SelectDate_1")
    public WebElement copyDatePicker;
    
    @FindBy(how = How.ID, using = "scSelectDate")
    public WebElement cashDatePicker;
    
    @FindBy(how = How.ID, using = "SailingDateDUCA")
    public WebElement cashCUDADatePicker;
    
    @FindBy(how = How.ID, using = "SailingReturnDateDUCA")
    public WebElement cashReturnCUDADatePicker;
    
    @FindBy(how = How.XPATH, using = "//span[@class='ui-datepicker-month']")
    public WebElement DatePickerMonth;
    
    @FindBy(how = How.XPATH, using = "//span[@class='ui-datepicker-year']")
    public WebElement DatePickerYear;
    
    @FindBy(how = How.XPATH, using = "//td[@data-handler='selectDay']/a[text()='1']")
    public WebElement DatePickerDay; 
    
    @FindBy(how = How.XPATH, using = "//a[@class='ui-state-default ui-state-highlight']")
    public WebElement DatePickerActiveDate;
    
    @FindBy(how = How.XPATH, using = "//a[@data-handler='next']/span")
    public WebElement DatePickerNextBtn;
  
    
    @FindBy(how = How.ID, using = "userDetsPhoneNumber")
    public WebElement Setbillingno;
    
    @FindBy(how = How.ID, using = "SelectSailing_0")
    public WebElement SelectTime;
    
    @FindBy(how = How.ID, using = "SelectSailing_1")
    public WebElement SelectCopyTime;
    
    /*@FindBy(how = How.XPATH, using = "//input[@id='PluginRequired_0'][@name='PluginRequired'][@type='checkbox']")
    public WebElement PluginInput;*/
    
    @FindBy(how = How.XPATH, using = "//input[@id='PluginRequired_0'][@name='PluginRequired'][@type='checkbox'][@disabled='disabled']")
    public WebElement PluginInput_disabled;
    
    @FindBy(how = How.XPATH, using = "//select[@id='drivers_0']//option[@value='1']")
    public WebElement oneDriverOption;

    @FindBy(how = How.ID, using = "JobReference_0")
    public WebElement jobReferenceInput;
    
    @FindBy(how = How.ID, using = "JobReference_1")
    public WebElement copyjobReferenceInput;

    @FindBy(how = How.ID, using = "JobReference_0")
    public WebElement jobReferenceFilterInput;

    @FindBy(how = How.XPATH, using = "(//*[@name='JobReference_0'])[1]")
    public WebElement firstJobReferenceInput;

    @FindBy(how = How.XPATH, using = "(//*[@name='JobReference_0'])[2]")
    public WebElement secondJobReferenceInput;

    @FindBy(how = How.ID, using = "UnitLength_0")
    public WebElement unitLengthInput;
    
    @FindBy(how = How.ID, using = "UnitLength_1")
    public WebElement copyunitLengthInput;

    @FindBy(how = How.ID, using = "dangerousGoodsCheckBox")
    public WebElement dangerousGoodsCheckbox;

    @FindBy(how = How.XPATH, using = "(//*[@name='dangerousGoods'])[1]//following-sibling::span")
    public WebElement firstDangerousGoodsCheckbox;

    @FindBy(how = How.XPATH, using = "(//*[@name='dangerousGoods'])[2]//following-sibling::span")
    public WebElement secondDangerousGoodsCheckbox;

    @FindBy(how = How.ID, using = "iAgreeCheckbox")
    public WebElement iAgreeCheckbox;

    @FindBy(how = How.XPATH, using = "(//*[@name='iAgree'])[1]//following-sibling::span")
    public WebElement firstIAgreeCheckbox;

    @FindBy(how = How.XPATH, using = "(//*[@name='iAgree'])[2]//following-sibling::span")
    public WebElement secondIAgreeCheckbox;

    @FindBy(how = How.ID, using = "SubmitBooking")
    public WebElement submitBookingButton;

    @FindBy(how = How.XPATH, using = "(//*//button[text()='Submit'])[1]")
    public WebElement firstSubmitButton;

    @FindBy(how = How.XPATH, using = "(//*//button[text()='Submit'])[2]")
    public WebElement secondSubmitButton;

    @FindBy(how = How.XPATH, using = "//*//button[text()='Yes']")
    public WebElement yesPrompt;

    @FindBy(how = How.XPATH, using = "//*//nav//*[@title='Track']")
    public WebElement trackBookings;

//    @FindBy(how = How.XPATH, using = "//*//nav//*[@title='Manage Bookings']")
//    public WebElement manageBookings;

    @FindBy(how = How.LINK_TEXT, using = "Manage Bookings")
    public WebElement manageBookings;
    
    @FindBy(how = How.XPATH, using = "//*//nav//*[@title='Block Bookings']")
    public WebElement blockBookings;

    @FindBy(how = How.XPATH, using = "//*[@class='panelHeader' and descendant::text()='BOOKING DETAILS']//*[@class='close icon']")
    public WebElement closeButton;
    
    @FindBy(how = How.XPATH, using = "//*[@class='panelHeader' and descendant::text()='Filter Bookings By:']//*[@class='close icon']")
    public WebElement filterCloseButton;

    @FindBy(how = How.XPATH, using="//*[@class='searchHolder']//*[@name='searchPort']")
    public WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//*[@class='filterBtn']")
    public WebElement filterButton;

    @FindBy(how = How.XPATH, using = "//*[@class='dateField' and descendant::input[@id='scheduleDatePicker']]")
    public WebElement startDatePicker;

    @FindBy(how = How.XPATH, using="//*[text()='19']")
    public WebElement nineteenthDate;

    @FindBy(how = How.XPATH, using="//*[text()='26']")
    public WebElement twentySixthDate;

    @FindBy(how = How.XPATH, using = "//*//button[text()='APPLY']")
    public WebElement applyButton;
    
    @FindBy(how = How.ID, using = "UnitWeight_0")
    public WebElement UnitWeight_Input;
    
    @FindBy(how = How.ID, using = "Gmr_0")
    public WebElement GMR;
    
    @FindBy(how = How.ID, using = "ReturnTripCheckBox_0")
    public WebElement tripcheckbox;

    @FindBy(how = How.XPATH, using ="//div[3]/div/div[2]/button")
    public WebElement Flipicon;
    
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
	public WebElement successfulBookings_VerifyUnitType;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Unit ID: ']/span")
	public WebElement successfulBookings_VerifyUnitID;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Job Reference: ']/span")
	public WebElement successfulBookings_VerifyJobReference;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Account: ']/span")
	public WebElement successfulBookings_VerifyAccount;
	
	@FindBy(how = How.CLASS_NAME, using = "cancel")
	public WebElement FirstWayBillCanel;
	//*[@id="showTiles"]/div[2]/div/div[3]/div[1]
	@FindBy(how = How.XPATH, using = "//div[@class='optionsColumns']//div[@class='optionCol ']/a[@class='copy']")
	public WebElement FirstWayBillCopy;
	
	@FindBy(how = How.XPATH, using = "//div[@id='descriptionPannelButton']//div[@class='btnColTwo']//button[@class='btn-secondary closePanelSide printbutton text-uppercase']")
	public WebElement FirstWayBillPrint;
	
	@FindBy(how = How.LINK_TEXT, using = "View all bookings")
	public WebElement Copyviewallbutton;
	
	@FindBy(how = How.XPATH, using = "//div[@id='cancelPopUpBox']/div[1]//div[@class='btnColOne']//button[@class='btn-primary'][text()='Yes']")
	public WebElement WayBillCancelYesButton;

	
	
	//************************************
	//WayBill
	//************************************
	
	@FindBy(how = How.XPATH, using = "//div[@id='showTiles']/div[1]//div[@class='eachLine'][text()='WayBill No: ']")
	public WebElement FirstWayBillNo;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showTiles']/div[1]//a[@class='edit'][text()='Edit']")
	public WebElement FirstWayBillEdit;
	
	
	

}
