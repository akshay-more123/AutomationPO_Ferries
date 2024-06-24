package com.poferries.tourist.web.actions;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.poferries.tourist.web.locators.CreateBookingPageLocators;
import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.Seleniumdriver;
import com.poferries.tourist.web.utilities.TestDataUtil;
import com.web.actions.Actions;

public class CreateBookingPageActions {
    
    CreateBookingPageLocators createBookingPageLocators = null;
    WayBill WayBillPageActions;
    ConfigReader configReader = new ConfigReader();
    TestDataUtil testdata = new TestDataUtil();
	String TestdataFile = System.getProperty("user.dir") + configReader.configWeb.getProperty("TestDataXLFile");
	Actions WebTestActions;
	
	@FindBy(how = How.ID, using = "Route_0")
    public WebElement selectroutedata;

	
	//@FindBy(how = How.ID, using = "")
	@FindBy(how = How.LINK_TEXT, using = "View receipt")
	public WebElement ViewRecipt;
	
	@FindBy(how = How.XPATH, using = "//div[@class='appSectionArea']/section/h1]")
	public WebElement CashFB;
	
	@FindBy(how = How.XPATH, using = "//div[@class='eachLine']//div[@id='txtOnward1Waybill']")
    public WebElement Cashwaybillno;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

    public CreateBookingPageActions(Actions WebTestActions){
    	this.WebTestActions = WebTestActions;
    	WayBillPageActions = new WayBill(WebTestActions);
    	createBookingPageLocators = new CreateBookingPageLocators();
        PageFactory.initElements(WebTestActions.driver, createBookingPageLocators);
    }

    public void clickFlipicon(){
        WebTestActions.clickElement(createBookingPageLocators.Flipicon);
    }
    public void clicktripcheckbox(){
        WebTestActions.clickElement(createBookingPageLocators.tripcheckbox);
    }
    public void clickRouteDropdown(){
        //createBookingPageLocators.routeDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.routeDropdown);
    }
    public void clickVerifyWayBillNo(){
        //createBookingPageLocators.routeDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
    }
    public void clickcopyfirstwaybill() throws InterruptedException{
        //createBookingPageLocators.routeDropdown.click();
    if(Seleniumdriver.getDriver().findElements(By.xpath("//div[@class='optionsColumns']//div[@class='optionCol ']/a[@class='copy']")).size() > 0) 
    	{
        WebTestActions.clickElement(createBookingPageLocators.FirstWayBillCopy);
    }
    else
    {
    	WebTestActions.clickElement(createBookingPageLocators.Copyviewallbutton);
    	Thread.sleep(3000);
    	WebTestActions.clickElement(createBookingPageLocators.FirstWayBillCopy);
    }
    }
    public void clickprintfirstwaybill(){
        //createBookingPageLocators.routeDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.FirstWayBillPrint);
    }
    public void clickfirstwaybill(){
        //createBookingPageLocators.routeDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.FirstWayBillNo);
    }
    public void ViewRecipt()
    {
    	WebTestActions.clickElement(ViewRecipt);
    	//WebTestActions.VerifyObjectIsDisplayed(ViewRecipt);
    }
    public void clickRouteDropdownByName(){
        //createBookingPageLocators.routeDropdowByName.click();
        WebTestActions.clickElement(createBookingPageLocators.routeDropdowByName);
    }
    
    public void selectRouteFromDropDown(String Route) throws InterruptedException {
		/*WebElement Element = Seleniumdriver.getDriver().findElement(By.xpath("//select[@name='Route']//option[text()='" + Route + "']"));
		JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		Element.click();
		Thread.sleep(2000);*/
    	WebTestActions.driver.findElement(By.xpath("//select[@name='Route']//option[text()='" + Route + "']")).click();
    	Thread.sleep(1000);
    	JavascriptExecutor js = (JavascriptExecutor) WebTestActions.driver;
    	js.executeScript("arguments[0].scrollIntoView();", createBookingPageLocators.generateFormButton);
    	Thread.sleep(1000);
    }

    
    public void clickDoverCalaisRouteOption(){
        //createBookingPageLocators.doverCalaisRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.doverCalaisRouteOption);
    }
    public void clickCalaisDoverRouteOption(){
        //createBookingPageLocators.doverCalaisRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.CalaisdoverRouteOption);
    }
    public void clickCairnryanLarneRouteOption(){
        //createBookingPageLocators.doverCalaisRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.CairnryanLarneRouteOption);
    }
    public void clickCalaisDublinRouteOption(){
        //createBookingPageLocators.doverCalaisRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.CalaisDublinRouteOption);
    }
    public void clickDublinCalaisRouteOption(){
        //createBookingPageLocators.doverCalaisRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.DublinCalaisRouteOption);
    }
    public void clickLarneCairnryanRouteOption(){
        //createBookingPageLocators.doverCalaisRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.LarneCairnryanRouteOption);
    }
    public void clickEuropoortHullRouteOption(){
        //createBookingPageLocators.europoortHullRouteOption.click();
    	WebTestActions.clickElement(createBookingPageLocators.europoortHullRouteOption);
    }
    
    public void clickAccountDropdown(){
        //createBookingPageLocators.chooseAccountDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.chooseAccountDropdown);
    }
    
    public String getDefaultAccount(){
        return WebTestActions.getFirstSelectedOption(createBookingPageLocators.chooseAccountDropdown);
    }
        
	public void ISelectReturn() throws InterruptedException{
    	//createBookingPageLocators.Returnjourneytype.click();
    	
    	WebTestActions.clickElement(createBookingPageLocators.Returnjourneytype);
    //	ClickElementJS(createBookingPageLocators.Returnjourneytype);
    	Thread.sleep(3000);
	}
	
	public void IclickCurrencydropdown(){
		//createBookingPageLocators.UserDefCurrency.click();
		WebTestActions.clickElement(createBookingPageLocators.UserDefCurrency);
	}
	
	public void IselectGBPCurrency() throws InterruptedException{
		//createBookingPageLocators.selectGBPCurrency.click();
		WebTestActions.clickElement(createBookingPageLocators.selectGBPCurrency);
		Thread.sleep(2000);
	}
	
	public void clickCountryofOriginatingdropdown(){
		//createBookingPageLocators.Country.click();
		WebTestActions.clickElement(createBookingPageLocators.Country);
	}
	
	public void select_United_Kingdom_Country(){
		//createBookingPageLocators.selectGBRCountry.click();
		WebTestActions.clickElement(createBookingPageLocators.selectGBRCountry);
	}
	
	public void click_Number_of_passengers_dropdown(){
		//createBookingPageLocators.passengerAdults.click();
		WebTestActions.clickElement(createBookingPageLocators.passengerAdults);
	}
	
	public void select_Number_of_passengers(){
		//createBookingPageLocators.selectpassengerAdults.click();
		WebTestActions.clickElement(createBookingPageLocators.selectpassengerAdults);
	}
	
	public void click_transporting_dangerous_goods_ckeckbox(){
		//createBookingPageLocators.selectGoodsChkBox.click();
		WebTestActions.clickElement(createBookingPageLocators.selectGoodsChkBox);
	}
	
	public void click_transporting_any_pets_checkbox(){
		//createBookingPageLocators.selectpetsChkBox.click();
		WebTestActions.clickElement(createBookingPageLocators.selectpetsChkBox);
	}
	
	public void click_Continue_Booking(){
		//createBookingPageLocators.StepOneContinue.click();
		WebTestActions.clickElement(createBookingPageLocators.StepOneContinue);
	}
	//**************************
	
	public void enter_Vehicle_registration_number(){
		//createBookingPageLocators.vehicleNumber.sendKeys("1234");
		WebTestActions.waitForElementToBeVisibile(createBookingPageLocators.vehicleNumber);
		WebTestActions.writeText("1234", createBookingPageLocators.vehicleNumber);
	}
	
	public void enter_Vehicle_length_Metre5(){
		//createBookingPageLocators.vehicleLength.sendKeys("5");
		WebTestActions.writeText("5", createBookingPageLocators.vehicleLength);
	}
	
	public void select_My_vehicle_width(){
		//createBookingPageLocators.vehicleWidth.click();
		WebTestActions.clickElement(createBookingPageLocators.vehicleWidth);
	}
	
	public void select_My_vehicle_weight(){
		//createBookingPageLocators.vehicleOverWeight.click();
		WebTestActions.clickElement(createBookingPageLocators.vehicleOverWeight);
	}
	
	public void clicked_Continue_Booking() throws InterruptedException{
		//createBookingPageLocators.StepTwoContinue.click();
		WebTestActions.clickElement(createBookingPageLocators.StepTwoContinue);
		Thread.sleep(6000);
	}
    
    //**************************
	
	public void verify_Review_booking_details_Vehicle_UnitID(){
		//createBookingPageLocators.UnitIDLable.getText();
		WebTestActions.getObjectText(createBookingPageLocators.UnitIDLable);
	}
	
	public void verify_Review_booking_details_Vehicle_Length(){
		//createBookingPageLocators.LengthLable.getText();
		WebTestActions.getObjectText(createBookingPageLocators.LengthLable);
	}
	
	public void verify_Review_booking_details_Vehicle_Height(){
		//createBookingPageLocators.HeightLable.getText();
		WebTestActions.getObjectText(createBookingPageLocators.HeightLable);
	}
	
	public void verify_Review_booking_details_Vehicle_Width(){
		//createBookingPageLocators.WidthLable.getText();
		WebTestActions.getObjectText(createBookingPageLocators.WidthLable);
	}
	
	public void verify_Review_booking_details_Vehicle_Weight(){
		//createBookingPageLocators.WeightLable.getText();
		WebTestActions.getObjectText(createBookingPageLocators.WeightLable);
	}
	
	public void verify_Review_booking_details_Vehicle_Passengers(){
		//createBookingPageLocators.PassengersLable.getText();
		WebTestActions.getObjectText(createBookingPageLocators.PassengersLable);
	}
	
	public void click_Billing_address_checkbox() throws InterruptedException{
		/*if(createBookingPageLocators.SearchPostCodeIcon.isDisplayed()) {
			createBookingPageLocators.BillingAddrCBCheckBox.click();
		}*/
		//WebTestActions.clickElement(createBookingPageLocators.BillingAddrCBCheckBox);
		createBookingPageLocators.Setbillingno.sendKeys("1234567890");
		WebTestActions.clickElement(createBookingPageLocators.selectbillingCountry);
		click_Billing_address();
	}
	public void click_Billing_address() throws InterruptedException{
	
		createBookingPageLocators.SearchuserDetsPostcode.clear();
		createBookingPageLocators.SearchuserDetsPostcode.sendKeys("SW1A2AA");
		WebTestActions.clickElement(createBookingPageLocators.SearchuserDetsPostcode);
		WebTestActions.clickElement(createBookingPageLocators.SelectbillingAddress);
		WebTestActions.clickElement(createBookingPageLocators.SelectbillingAddressBtn);
		click_Proceed_to_payment();
		Thread.sleep(1000);
	}
	
	public void click_agree_Terms_and_Conditions_checkbox(){
		/*JavascriptExecutor jse = (JavascriptExecutor)Seleniumdriver.getDriver();
		jse.executeScript("arguments[0].click()", createBookingPageLocators.PaymentTermsCheckBox);
		//createBookingPageLocators.PaymentTermsCheckBox.click();*/
		WebTestActions.clickElementJS(createBookingPageLocators.PaymentTermsCheckBox);
	}
	
	public void click_Proceed_to_payment(){
		//createBookingPageLocators.proceedToPayBtn.click();
		WebTestActions.clickElement(createBookingPageLocators.proceedToPayBtn);
	}
	
	//**************************
	
	public String verify_booking_Amount(){
		//return createBookingPageLocators.amountLable.getText();
		return WebTestActions.getObjectText(createBookingPageLocators.amountLable);
	}
	
	public void enter_Card_Number(){
		//createBookingPageLocators.cardNumber.sendKeys("4111111111111111");
		WebTestActions.writeText("4560000000000053", createBookingPageLocators.cardNumber);
	}
	
	public void click_Expiry_Date_Month(){
		//createBookingPageLocators.expiryMonth.click();
		WebTestActions.clickElement(createBookingPageLocators.expiryMonth);
	}
	
	public void select_Expiry_Date_Month(){
		//createBookingPageLocators.selectexpiryMonth.click();
		WebTestActions.clickElement(createBookingPageLocators.selectexpiryMonth);
	}
	
	public void click_Date_Year(){
		//createBookingPageLocators.expiryYear.click();
		WebTestActions.clickElement(createBookingPageLocators.expiryYear);
	}
	
	public void select_Date_Year(){
		//createBookingPageLocators.selectexpiryYear.click();
		WebTestActions.clickElement(createBookingPageLocators.selectexpiryYear);
	}
	
	public void enter_CSC(){
		//createBookingPageLocators.csc.sendKeys("456");
		WebTestActions.writeText("456", createBookingPageLocators.csc);
	}
	
	public void click_Cancel_button(){
		//createBookingPageLocators.btnCancel.click();
		WebTestActions.clickElement(createBookingPageLocators.btnCancel);
	}
	
	public void click_Submit_button() throws InterruptedException{
		//createBookingPageLocators.btnSubmit.click();
		WebTestActions.clickElement(createBookingPageLocators.btnSubmit);
	}
	
	
	public String verify_booking_confirmation_message(){
		//createBookingPageLocators.confirmBooking.getText();
		return WebTestActions.getObjectText(createBookingPageLocators.confirmBooking);
	}
	
	public void click_Go_To_Home(){
		//createBookingPageLocators.GoToHome.click();
		WebTestActions.clickElement(createBookingPageLocators.GoToHome);
	}
	public void click_Cancel(){
		WebTestActions.clickElement(createBookingPageLocators.FirstWayBillCanel);
	}
	
	public void clickYesbutton()
	{
		WebTestActions.waitForElementToBeVisibile(createBookingPageLocators.WayBillCancelYesButton);
		WebTestActions.clickElement(createBookingPageLocators.WayBillCancelYesButton);
	}
	public String CancelgetWayBillNo()
	{
		String WaybillNo =null;
		WaybillNo= createBookingPageLocators.successfulBookings_VerifyWayBillNo.getText();//FirstWayBillNo.getText()
			return WaybillNo;
	}
	
	
	//**************************
	
	public void click_Plugin_Required_Checkbox(){
		//createBookingPageLocators.PluginCheckBox_0.click();
		WebTestActions.clickElement(createBookingPageLocators.PluginCheckBox_0);
	}
	
	public void input_UnitTemperature_in_Unit_Temperature (String UnitTemperature){
		/*createBookingPageLocators.UnitTemperature_0.clear();
		createBookingPageLocators.UnitTemperature_0.sendKeys(UnitTemperature);*/
		WebTestActions.writeText(UnitTemperature, createBookingPageLocators.UnitTemperature_0);
	}
	
	public void click_return_trip_required_Checkbox(){
		//createBookingPageLocators.ReturnTripCheckBox_0.click();
		WebTestActions.clickElement(createBookingPageLocators.ReturnTripCheckBox_0);
	}
	
	public void input_JobReference_in_return_trip_Job_Reference(String JobReference){
		/*createBookingPageLocators.ReturnJobReference_0.clear();
		createBookingPageLocators.ReturnJobReference_0.sendKeys(JobReference);*/
		WebTestActions.writeText(JobReference, createBookingPageLocators.ReturnJobReference_0);
	}
	
	public void input_LoadDescription_in_return_trip_LOAD_DESCRIPTION(String LoadDescription){
		/*createBookingPageLocators.ReturnJobReference_0.clear();
		createBookingPageLocators.ReturnJobDescription_0.sendKeys(LoadDescription);*/
		WebTestActions.writeText(LoadDescription, createBookingPageLocators.ReturnJobReference_0);
	}
	
	public Boolean verifBbookingSuccessful() {
		boolean a = false;
		try {
			Thread.sleep(2000);
			/*Seleniumdriver.getWaitDriver()
			.until(ExpectedConditions.visibilityOf(createBookingPageLocators.successfulBookingsBlock));
			return createBookingPageLocators.successfulBookingsBlock.isDisplayed();*/
			WebTestActions.waitForElementToBeVisibile(createBookingPageLocators.successfulBookingsBlock);
			a = WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.successfulBookingsBlock);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
		
	public String getWayBillNo() {
		String WayBillNo = null;
		if(verifBbookingSuccessful()) {
			//WayBillNo =  createBookingPageLocators.successfulBookings_VerifyWayBillNo.getText();
			WayBillNo = WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
		}
		return WayBillNo;
	}

	public Boolean verify_Copy_button_exits(){
		/*Boolean b = createBookingPageLocators.copyButton_0.isDisplayed();
		return b;*/
		return WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.copyButton_0);
	}
	
	public Boolean verify_Clear_button_exits() {
		//return createBookingPageLocators.clearButton_0.isDisplayed();
		return WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.clearButton);
	}
		
	public Boolean verify_add_Booking_Row_button_exits() {
		//return createBookingPageLocators.addBookingRow.isDisplayed();
		return WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.addBookingRow);
	}
	
	public void click_booking_complies_confirm_Checkbox() {
		try {
			/*if(createBookingPageLocators.HazardousGoodsChkbox.isDisplayed()) {
				createBookingPageLocators.HazardousGoodsChkbox.click();
			}*/
			if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.HazardousGoodsChkbox)) {
				WebTestActions.clickElement(createBookingPageLocators.HazardousGoodsChkbox);
			}
		}catch(Exception e) {
			
		}
	}
	
	public void click_Tearms_and_Conditions_Checkbox() {
		try {
			/*if(createBookingPageLocators.termschkbox.isDisplayed()) {
				createBookingPageLocators.termschkbox.click();
			}*/
			
			if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.termschkbox)) {
				WebTestActions.clickElement(createBookingPageLocators.termschkbox);
			}
		}catch(Exception e) {
			
		}
		
	}
	
	public void click_Submit_Booking_Button() {
		try {
			//createBookingPageLocators.SubmitBooking.click();
			WebTestActions.clickElement(createBookingPageLocators.SubmitBooking);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    public void clickPOFAccount248500(){
        //createBookingPageLocators.pofAccount248500.click();
        WebTestActions.clickElement(createBookingPageLocators.pofAccount248500);
    }
    
    public void clickPOFAccount500984(){
        //createBookingPageLocators.pofAccount500984.click();
        WebTestActions.clickElement(createBookingPageLocators.pofAccount500984);
    }
    
    public void clickFilterRouteDropdown(){
    	/*WebElement Element = createBookingPageLocators.RouteFilterDropdown;
		JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		Element.click();*/
    	//createBookingPageLocators.RouteFilterDropdown.click();
    	WebTestActions.clickElement(createBookingPageLocators.RouteFilterDropdown);
	}
    
    public void selectFilterRouteFromDropDown(String Route) throws InterruptedException {
		
		WebElement Element = WebTestActions.driver.findElement(By.xpath("//select[@id='RouteFilter']//option[text()='" + Route + "']"));
		JavascriptExecutor js = (JavascriptExecutor) WebTestActions.driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		Element.click();
		Thread.sleep(5000);	
	}
    
    public void clickDoverCalaisRouteOptn(){
        //createBookingPageLocators.doverCalaisRoute.click();
        WebTestActions.clickElement(createBookingPageLocators.doverCalaisRoute);
    }
    
    public void clickHullToEuropoortRouteOptn(){
        //createBookingPageLocators.HullToEuropoortRoute.click();
        WebTestActions.clickElement(createBookingPageLocators.HullToEuropoortRoute);
    }
    
    public void clickDublinToLiverpoolRouteOptn(){
    	/*WebElement Element = createBookingPageLocators.DublinToLiverpoolRoute;
		JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		Element.click();*/
    	//createBookingPageLocators.DublinToLiverpoolRoute.click();
    	WebTestActions.clickElement(createBookingPageLocators.DublinToLiverpoolRoute);
    }

    public void clicknumberOfBookingsFilter(){
        //createBookingPageLocators.numberOfBookingsFilter.click();
        WebTestActions.clickElement(createBookingPageLocators.numberOfBookingsFilter);
    }
    
    public void clicknumberOfBookingsFilterOption(){
        //createBookingPageLocators.numberOfBookingsFilterOption.click();
        WebTestActions.clickElement(createBookingPageLocators.numberOfBookingsFilterOption);
    }
    
    public void clickGenerateForm(){
    	WebTestActions.clickElement(createBookingPageLocators.generateFormButton);
    }
    
    public List<String> getErrorMessages(){		
		return WebTestActions.getObjectText(createBookingPageLocators.ErrorMessageList);
    }
        
    public void clickUnitTypeDropdown() throws InterruptedException{
        //createBookingPageLocators.unitTypeDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.unitTypeDropdown);
        
        /*WebElement Element = createBookingPageLocators.unitTypeDropdown;
		JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		Element.click();*/
    }
    
    public boolean selectUnitTypeFromDropDown(String UnitType) {
    	boolean Iserror;
    	try {
    		WebTestActions.driver.findElement(By.xpath("//select[@id='UnitType_0']//option[text()='" + UnitType + "']")).click();
			/*WebElement Element = Seleniumdriver.getDriver().findElement(By.xpath("//select[@id='UnitType_0']//option[text()='" + UnitType + "']"));
			JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
			js.executeScript("arguments[0].scrollIntoView(true);", Element);
			Element.click();*/
			Thread.sleep(1000);
			Iserror = false;
    	}catch(Exception e) {
    		Iserror = true;
    	}
		return Iserror;
	}

    public void clickContainerUnitTypeOption() throws InterruptedException{	
        createBookingPageLocators.containerUnitTypeOption.clear();
        Thread.sleep(3000);
        WebTestActions.clickElement(createBookingPageLocators.containerUnitTypeOption);
    }
    
    public void clickChassisUnitTypeOption() throws InterruptedException{
    	Thread.sleep(1000);
        //createBookingPageLocators.ChassisUnitTypeOption.click();
        WebTestActions.clickElement(createBookingPageLocators.ChassisUnitTypeOption);
    }
    public void clickcashUnitTypeOption() throws InterruptedException{
    	Thread.sleep(1000);
        //createBookingPageLocators.ChassisUnitTypeOption.click();
        WebTestActions.clickElement(createBookingPageLocators.Cashunitype);
    }
    

    //public void enterJobDescriptionInput(String jobDescription){
    public void enterJobDescriptionInput(){    	
    	createBookingPageLocators.jobDescriptionInput.clear();
        createBookingPageLocators.jobDescriptionInput.sendKeys(configReader.configWeb.getProperty("loadDescription"));
    }
    
    public void GMR(String GMRtext){    	
    	  WebTestActions.writeText(GMRtext, createBookingPageLocators.GMR);
    }
    public void enterJobDescriptionInput(String jobDescription){   	
    	/*createBookingPageLocators.jobDescriptionInput.clear();
        createBookingPageLocators.jobDescriptionInput.sendKeys(jobDescription);*/
        WebTestActions.writeText(jobDescription, createBookingPageLocators.jobDescriptionInput);
    }
 
   public void enterRandomReturnJobReferenceInput(){
    	//Max 20 Characters
    	LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
    	String dateTime = date.format(formatter);
    	//System.out.println("Job Reference=" + dateTime);
    	
    //    createBookingPageLocators.jobReferenceInput.clear();
       // createBookingPageLocators.jobReferenceInput.sendKeys("JR" + dateTime);
        WebTestActions.writeText("JR" + dateTime, createBookingPageLocators.ReturnJobReference);
    }
    public void enterReturnRandomJobDescriptionInput(){
    	//Max 20 Characters
    	LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_hh_mm_ss");
    	String dateTime = date.format(formatter);
    	
    	System.out.println("Job Description=" + dateTime);
    	
    	createBookingPageLocators.ReturnJobDescription.clear();
       // createBookingPageLocators.jobDescriptionInput.sendKeys("JD" + dateTime);
        WebTestActions.writeText("JD" + dateTime, createBookingPageLocators.ReturnJobDescription);
    }
        
    public void enterRandomJobDescriptionInput(){
    	//Max 20 Characters
    	LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_hh_mm_ss");
    	String dateTime = date.format(formatter);
    	
    	System.out.println("Job Description=" + dateTime);
    	
    	createBookingPageLocators.jobDescriptionInput.clear();
       // createBookingPageLocators.jobDescriptionInput.sendKeys("JD" + dateTime);
        WebTestActions.writeText("JD" + dateTime, createBookingPageLocators.jobDescriptionInput);
    }

    public void enterFirstJobDescriptionInput(String jobDescription){
        /*createBookingPageLocators.firstJobDescriptionInput.clear();
        createBookingPageLocators.firstJobDescriptionInput.sendKeys(jobDescription);*/
        WebTestActions.writeText(jobDescription, createBookingPageLocators.firstJobDescriptionInput);
    }

    public void enterSecondJobDescriptionInput(String jobDescription){
        /*createBookingPageLocators.secondJobDescriptionInput.clear();
        createBookingPageLocators.secondJobDescriptionInput.sendKeys(jobDescription);*/
        WebTestActions.writeText(jobDescription, createBookingPageLocators.secondJobDescriptionInput);
    }

    public void enterUnitIDInput(String unitID){
        /*createBookingPageLocators.unitIDInput.clear();
        createBookingPageLocators.unitIDInput.sendKeys(unitID);*/
        WebTestActions.writeText(unitID, createBookingPageLocators.unitIDInput);
     }
    
    //public void enterUnitIDInput(String unitID){
    public void enterUnitIDInput(){
        createBookingPageLocators.unitIDInput.clear();
        createBookingPageLocators.unitIDInput.sendKeys(configReader.configWeb.getProperty("unitID"));
    }
    
    public void validateUnitIDInput(){
    	clickGenerateForm();
        if(validateUnitIDInputUpperCase() == true) {
        	System.out.println("Unit Type Id Filed has Upper Case");
        } else {
        	System.out.println("Unit Type Id Filed has Lower Case");
        }
        
        if(validateUnitIDInputSpecialChar() == true) {
        	System.out.println("Please enter a valid Unit ID : Unit Type Id Filed not accept Special Characters");
        } else {
        	System.out.println("Unit Type Id Filed accept Special Characters");
        }
    }
    
    public boolean validateUnitIDInputSpecialChar(){
        createBookingPageLocators.unitIDInput.clear();
        createBookingPageLocators.unitIDInput.sendKeys("!validate lower$");
        createBookingPageLocators.jobReferenceInput.clear();
        createBookingPageLocators.jobReferenceInput.sendKeys("Test 2");
        boolean hasError = createBookingPageLocators.unitIDInputError.getText().equalsIgnoreCase("Please enter a valid Unit ID");
        return hasError;
    }
    
    public boolean validateUnitIDInputUpperCase(){
        createBookingPageLocators.unitIDInput.clear();
        createBookingPageLocators.unitIDInput.sendKeys("validate lower");
        createBookingPageLocators.jobReferenceInput.clear();
        createBookingPageLocators.jobReferenceInput.sendKeys("Test 1");
        String unitIDInputValue = WebTestActions.getWebElementProperty("value", createBookingPageLocators.unitIDInput);
        boolean hasUppercase = !unitIDInputValue.equals("validate lower".toLowerCase());
        System.out.println("Unit Type Id Filed text is : " + unitIDInputValue);
		return hasUppercase;
    }
    
    public void enterRandomUnitIDInput(){
    	//Unit ID cannot exceed 13 charecters
    	LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddhhmmss");
    	String dateTime = date.format(formatter);
    	
    	System.out.println("Unit ID=" + dateTime);
        
    	//createBookingPageLocators.unitIDInput.clear();
        //createBookingPageLocators.unitIDInput.sendKeys(dateTime);*/
        WebTestActions.writeText(dateTime, createBookingPageLocators.unitIDInput);
    }

    public void enterFirstUnitIDInput(String unitID){
        /*createBookingPageLocators.firstUnitIDInput.clear();
        createBookingPageLocators.firstUnitIDInput.sendKeys(unitID);*/
        WebTestActions.writeText(unitID, createBookingPageLocators.firstUnitIDInput);
    }

    public void enterSecondUnitIDInput(String unitID){
        /*createBookingPageLocators.secondUnitIDInput.clear();
        createBookingPageLocators.secondUnitIDInput.sendKeys(unitID);*/
        WebTestActions.writeText(unitID, createBookingPageLocators.secondUnitIDInput);
    }

    public void clickDriverDropdown(){
        //createBookingPageLocators.driverDropdown.click();
        WebTestActions.clickElement(createBookingPageLocators.driverDropdown);
    }
    
    public boolean IsDriverFieldEnabled(){
        //boolean e = createBookingPageLocators.driverDropdown.isEnabled();
        return WebTestActions.VerifyObjectEnabled(createBookingPageLocators.driverDropdown);
    }
    
    public String DriverFieldSelectedValue(){
	    /*Select select = new Select(Seleniumdriver.getDriver().findElement(By.xpath("//select[@id='drivers_0'][@name='drivers']")));
	    WebElement option = select.getFirstSelectedOption();
	    String defaultItem = option.getText();
	    return defaultItem;*/
    	
    	return WebTestActions.getFirstSelectedOption(createBookingPageLocators.driversDropdown);
    }
    
    public boolean IsDriverFieldDisplayed(){
    	/*boolean isDisplayed;
    	try {
        	 isDisplayed = createBookingPageLocators.driverDropdown_disabled.isDisplayed();
        }catch (Exception e) {
        	isDisplayed = false;
        }
        return isDisplayed;*/
        
        return WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.driverDropdown_disabled);
    }
        
    public boolean IsPlugInFieldEnabled(){
        //boolean p = createBookingPageLocators.PluginInput.isEnabled();
    	return WebTestActions.VerifyObjectEnabled(createBookingPageLocators.PluginInput);
    	
    	/*boolean result = true;
         try {
             if (createBookingPageLocators.PluginInput.getAttribute("disabled") == null){
                 result = true;
             } else if (createBookingPageLocators.PluginInput.getAttribute("disabled") != null) {
            	 result = false;
             }
         } catch (Exception e) {}

         return result;*/
    }
      
    public boolean IsPlugInFieldDisplayed(){
    	/*boolean isDisplayed=true;
    	try {
        	 isDisplayed = createBookingPageLocators.PluginInput_disabled.isDisplayed();
        }catch (Exception e) {
        	isDisplayed = false;
        }
        return isDisplayed;*/
        
        return WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.PluginInput_disabled);
    }

    public void clickOneDriverOption(){
        //createBookingPageLocators.oneDriverOption.click();
        WebTestActions.clickElement(createBookingPageLocators.oneDriverOption);
    }

    //public void enterJobReferenceInput(String jobReference){
    public void enterJobReferenceInput(){
       // createBookingPageLocators.jobReferenceInput.clear();
        createBookingPageLocators.jobReferenceInput.sendKeys(configReader.configWeb.getProperty("jobReference"));
    }
        
    public void enterRandomJobReferenceInput(){
    	//Max 20 Characters
    	LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
    	String dateTime = date.format(formatter);
    	//System.out.println("Job Reference=" + dateTime);
    	
    //    createBookingPageLocators.jobReferenceInput.clear();
       // createBookingPageLocators.jobReferenceInput.sendKeys("JR" + dateTime);
        WebTestActions.writeText("JR" + dateTime, createBookingPageLocators.jobReferenceInput);
    }
    
    public void enterJobReferenceFilterInput(String jobReference){
        /*createBookingPageLocators.jobReferenceFilterInput.clear();
        createBookingPageLocators.jobReferenceFilterInput.sendKeys(jobReference);*/
        WebTestActions.writeText(jobReference, createBookingPageLocators.jobReferenceFilterInput);
    }

    public void enterFirstJobReferenceInput(String jobReference){
        /*createBookingPageLocators.firstJobReferenceInput.clear();
        createBookingPageLocators.firstJobReferenceInput.sendKeys(jobReference);*/
        WebTestActions.writeText(jobReference, createBookingPageLocators.firstJobReferenceInput);
    }

    public void enterSecondJobReferenceInput(String jobReference){
        /*createBookingPageLocators.secondJobReferenceInput.clear();
        createBookingPageLocators.secondJobReferenceInput.sendKeys(jobReference);*/
        WebTestActions.writeText(jobReference, createBookingPageLocators.secondJobReferenceInput);
    }

    public void enterUnitLengthInput(String unitLength){
    	try {
	    	if(WebTestActions.VerifyObjectEnabled(createBookingPageLocators.unitLengthInput)) {
		    	int iTest = Integer.valueOf(unitLength.substring(0,unitLength.indexOf(".")));
		    	WebTestActions.writeText(String.valueOf(iTest), createBookingPageLocators.unitLengthInput);
	    	}
    	}catch(Exception e) {
    		WebTestActions.writeText(unitLength, createBookingPageLocators.unitLengthInput);
    	}
    }
    
    public void enterUnitLengthInput(){
        if(createBookingPageLocators.unitLengthInput.isEnabled()) {
	    	createBookingPageLocators.unitLengthInput.clear();
	        createBookingPageLocators.unitLengthInput.sendKeys(configReader.configWeb.getProperty("unitLength"));
        }
    }
    
    public void enterDateInput() throws InterruptedException{
        //createBookingPageLocators.DatePicker.click();
        WebTestActions.clickElement(createBookingPageLocators.DatePicker);
        Thread.sleep(1000);
        WebTestActions.driver.findElement(By.xpath("//a[@class='ui-state-default'][text()='24']")).click();
        //createBookingPageLocators.SelectActiveDate.click();
    }
    
    public void SelectTimeInput() throws InterruptedException{
    	Thread.sleep(3000);
        /*createBookingPageLocators.SelectTime.click();
        Select accountDropdown = new Select(createBookingPageLocators.SelectTime);
        accountDropdown.selectByIndex(1);;*/
    	WebTestActions.SelectByIndex(1, createBookingPageLocators.SelectTime);        
    }

    public void clickDangerousGoodsCheckbox(){
        //createBookingPageLocators.dangerousGoodsCheckbox.click();
        WebTestActions.clickElement(createBookingPageLocators.dangerousGoodsCheckbox);
    }

    public void clickFirstDangerousGoodsCheckbox(){
        //createBookingPageLocators.firstDangerousGoodsCheckbox.click();
        WebTestActions.clickElement(createBookingPageLocators.firstDangerousGoodsCheckbox);
    }

    public void clickSecondDangerousGoodsCheckbox(){
        //createBookingPageLocators.secondDangerousGoodsCheckbox.click();
        WebTestActions.clickElement(createBookingPageLocators.secondDangerousGoodsCheckbox);
    }

    public void clickIAgreeCheckbox(){
        //createBookingPageLocators.iAgreeCheckbox.click();
        WebTestActions.clickElement(createBookingPageLocators.iAgreeCheckbox);
    }

    public void clickFirstIAgreeCheckbox(){
        //createBookingPageLocators.firstIAgreeCheckbox.click();
        WebTestActions.clickElement(createBookingPageLocators.firstIAgreeCheckbox);
    }
    
    public void clickSecondIAgreeCheckbox(){
        //createBookingPageLocators.secondIAgreeCheckbox.click();
        WebTestActions.clickElement(createBookingPageLocators.secondIAgreeCheckbox);
    }

    public void clickSubmitBookingButton(){
        //createBookingPageLocators.submitBookingButton.click();
        WebTestActions.clickElement(createBookingPageLocators.submitBookingButton);
    }
    
    public void clickFirstSubmitButton(){
        //createBookingPageLocators.firstSubmitButton.click();
        WebTestActions.clickElement(createBookingPageLocators.firstSubmitButton);
    }
    
    public void clickSecondSubmitButton(){
        //createBookingPageLocators.secondSubmitButton.click();
        WebTestActions.clickElement(createBookingPageLocators.secondSubmitButton);
    }

    public void clickYesPrompt(){
        //createBookingPageLocators.yesPrompt.click();
        WebTestActions.clickElement(createBookingPageLocators.yesPrompt);
    }

    public void clickTrackBookings(){
        //createBookingPageLocators.trackBookings.click();
        WebTestActions.clickElement(createBookingPageLocators.trackBookings);
    }

    public void clickManageBookings(){
        //createBookingPageLocators.manageBookings.click();
        WebTestActions.clickElement(createBookingPageLocators.manageBookings);
    }

    public void clickBlockBookings(){
        //createBookingPageLocators.blockBookings.click();
        WebTestActions.clickElement(createBookingPageLocators.blockBookings);
    }

    public void clickCloseButton(){
        //createBookingPageLocators.closeButton.click();
        WebTestActions.clickElement(createBookingPageLocators.closeButton);
    }

    public void clickFilterCloseButton(){
        //createBookingPageLocators.filterCloseButton.click();
        WebTestActions.clickElement(createBookingPageLocators.filterCloseButton);
    }

    public void enterSearchInput(String search){
        /*createBookingPageLocators.searchInput.clear();
        createBookingPageLocators.searchInput.sendKeys(search);*/
        WebTestActions.writeText(search, createBookingPageLocators.searchInput);
    }

    public void clickFilterButton(){
        //createBookingPageLocators.filterButton.click();
        WebTestActions.clickElement(createBookingPageLocators.filterButton);
    }

    public void clickStartDatePicker(){
        //createBookingPageLocators.startDatePicker.click();
        WebTestActions.clickElement(createBookingPageLocators.startDatePicker);
    }

    public void click19thDate(){
        //createBookingPageLocators.nineteenthDate.click();
        WebTestActions.clickElement(createBookingPageLocators.nineteenthDate);
    }
    
    public void click26thDate(){
        //createBookingPageLocators.twentySixthDate.click();
        WebTestActions.clickElement(createBookingPageLocators.twentySixthDate);
    }

    public void clickApplyButton(){
        //createBookingPageLocators.applyButton.click();
        WebTestActions.clickElement(createBookingPageLocators.applyButton);
    }

    public void clickZeebruggeTilburyRouteOption(){
        //createBookingPageLocators.zeebruggeTilburyRouteOption.click();
        WebTestActions.clickElement(createBookingPageLocators.zeebruggeTilburyRouteOption);
    }
    
    public void verifyBookingDetails(){
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyText_From);

    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyText_To);
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyTravelDate);
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitType);
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitID);
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyJobReference);
    	
    	WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyAccount);
    }
    
    public void SelectAccount(String AccountName){
        WebTestActions.SelectByVisibleText(AccountName, createBookingPageLocators.chooseAccountDropdown);
    }
    
    public void SelectRoute(String Route){
	    WebElement Element = WebTestActions.driver.findElement(By.xpath("//select[@id='RouteFilter']"));	    	
	    WebTestActions.SelectByVisibleText(Route, Element);
	}
    
    public void SelectNumberOfBookings(String NumberOfBookings){
    	int iTest = Integer.valueOf(NumberOfBookings.substring(0,NumberOfBookings.indexOf(".")));
    	WebTestActions.SelectByVisibleText(String.valueOf(iTest), createBookingPageLocators.numberOfBookingsFilter);
    }
    
    public boolean SelectUnitType(String UnitType){
    	boolean Iserror;
    	try {
    		//createBookingPageLocators.unitTypeDropdown.click();
    		//WebTestActions.clickElement(createBookingPageLocators.unitTypeDropdown);
    		//WebElement Element = WebTestActions.driver.findElement(By.xpath("//select[@id='UnitType_0']//option[text()='" + UnitType + "']"));
    		WebTestActions.SelectByVisibleText(UnitType, createBookingPageLocators.unitTypeDropdown);
    		//WebTestActions.clickElement(Element);
    		//Thread.sleep(1000);
			Iserror = false;
    	}catch(Exception e) {
    		Iserror = true;
    	}
		return Iserror;
    }
    
    public void SelectNumberOfDriver(String NumberOfDriver){
        if(IsDriverFieldEnabled()) {
        	int iTest = Integer.valueOf(NumberOfDriver.substring(0,NumberOfDriver.indexOf(".")));
        	/*createBookingPageLocators.driverDropdown.click();
            Select accountDropdown = new Select(createBookingPageLocators.driverDropdown);
            accountDropdown.selectByVisibleText(String.valueOf(iTest));*/
        	System.out.println("No Of Drivers: " + String.valueOf(iTest));
        	WebTestActions.SelectByVisibleText(String.valueOf(iTest), createBookingPageLocators.driverDropdown);
        }
    }
    
    public void enterUnitTemparature(String UnitTemparature){
        if(IsPlugInFieldEnabled()) {
        	if(UnitTemparature != null) {
        		/*createBookingPageLocators.PluginCheckBox_0.click();
            	createBookingPageLocators.UnitTemperature_0.clear();
        		createBookingPageLocators.UnitTemperature_0.sendKeys(UnitTemparature);*/
        		WebTestActions.clickElement(createBookingPageLocators.PluginCheckBox_0);
        		WebTestActions.writeText(UnitTemparature, createBookingPageLocators.UnitTemperature_0);
        	} else {
	        	/*createBookingPageLocators.PluginCheckBox_0.click();
	        	createBookingPageLocators.UnitTemperature_0.clear();
	    		createBookingPageLocators.UnitTemperature_0.sendKeys("15");*/
	    		WebTestActions.clickElement(createBookingPageLocators.PluginCheckBox_0);
        		WebTestActions.writeText("15", createBookingPageLocators.UnitTemperature_0);
        	}
        }
    }
       
    public void enterUnitWeight(String UnitWeight){
    	try {
	    	if(WebTestActions.VerifyObjectEnabled(createBookingPageLocators.UnitWeight_Input)) {
		    	int iTest = Integer.valueOf(UnitWeight.substring(0,UnitWeight.indexOf(".")));
		        WebTestActions.writeText(String.valueOf(iTest), createBookingPageLocators.UnitWeight_Input);
	    	}
    	}catch(Exception e) {
    		WebTestActions.writeText(UnitWeight, createBookingPageLocators.UnitWeight_Input);
    	}
     }
    
    public void enterStartDate(String StartDate){
    	if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.DatePicker)) {
	    	/*createBookingPageLocators.DatePicker.clear();
	        createBookingPageLocators.DatePicker.sendKeys(StartDate);*/
	        WebTestActions.writeText(StartDate, createBookingPageLocators.DatePicker);
    	}
     }
    
    public void selectDate(String StrDate) { 
    	
    	if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.DatePicker)) {
	    	/*DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			LocalDate date = LocalDate.parse(StrDate,f1);
	    	String StrYear = String.valueOf(date.getYear());
	    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
	    	String StrDay = String.valueOf(date.getDayOfMonth());*/
    		
    		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
			LocalDate date = LocalDate.parse(StrDate.toString(),f1);
			date = date.plusDays(1);
	    	String StrYear = String.valueOf(date.getYear());
	    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
	    	String StrDay = String.valueOf(date.getDayOfMonth());
	    	
	    	//createBookingPageLocators.DatePicker.click();
	    	WebTestActions.clickElement(createBookingPageLocators.DatePicker);
	    	
	    	if((!createBookingPageLocators.DatePickerYear.getText().equalsIgnoreCase(StrYear)) || 
	    			!createBookingPageLocators.DatePickerMonth.getText().equalsIgnoreCase(StrMonth)){
	    		//createBookingPageLocators.DatePickerNextBtn.click();
	    		WebTestActions.clickElement(createBookingPageLocators.DatePickerNextBtn);
	    	}
	    	
	    	WebElement element = WebTestActions.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + StrDay + "']"));
	    	WebTestActions.clickElement(element);
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
    	}
    }
 public void cashselectDate(String StrDate) { 
    	
    	if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.cashDatePicker)) {
    		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
			LocalDate date = LocalDate.parse(StrDate.toString(),f1);
			date = date.plusDays(1);
	    	String StrYear = String.valueOf(date.getYear());
	    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
	    	String StrDay = String.valueOf(date.getDayOfMonth());
	    	
	    	//createBookingPageLocators.DatePicker.click();
	    	WebTestActions.clickElement(createBookingPageLocators.cashDatePicker);
	    	
	    	if((!createBookingPageLocators.DatePickerYear.getText().equalsIgnoreCase(StrYear)) || 
	    			!createBookingPageLocators.DatePickerMonth.getText().equalsIgnoreCase(StrMonth)){
	    		//createBookingPageLocators.DatePickerNextBtn.click();
	    		WebTestActions.clickElement(createBookingPageLocators.DatePickerNextBtn);
	    	}
	    	
	    	WebElement element = WebTestActions.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + StrDay + "']"));
	    	WebTestActions.clickElement(element);
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
    	}
    }
 public void cashCUDAselectDate(String StrDate) { 
 	
 	if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.cashCUDADatePicker)) {
 		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
			LocalDate date = LocalDate.parse(StrDate.toString(),f1);
			date = date.plusDays(1);
	    	String StrYear = String.valueOf(date.getYear());
	    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
	    	String StrDay = String.valueOf(date.getDayOfMonth());
	    	
	    	//createBookingPageLocators.DatePicker.click();
	    	WebTestActions.clickElement(createBookingPageLocators.cashCUDADatePicker);
	    	
	    	if((!createBookingPageLocators.DatePickerYear.getText().equalsIgnoreCase(StrYear)) || 
	    			!createBookingPageLocators.DatePickerMonth.getText().equalsIgnoreCase(StrMonth)){
	    		//createBookingPageLocators.DatePickerNextBtn.click();
	    		WebTestActions.clickElement(createBookingPageLocators.DatePickerNextBtn);
	    	}
	    	
	    	WebElement element = WebTestActions.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + StrDay + "']"));
	    	WebTestActions.clickElement(element);
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
 	}
 }
 public void cashReturnCUDAselectDate(String StrDate) { 
	 	
	 	if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.cashReturnCUDADatePicker)) {
	 		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
				StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
				LocalDate date = LocalDate.parse(StrDate.toString(),f1);
				date = date.plusDays(3);
		    	String StrYear = String.valueOf(date.getYear());
		    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
		    	String StrDay = String.valueOf(date.getDayOfMonth());
		    	
		    	//createBookingPageLocators.DatePicker.click();
		    	WebTestActions.clickElement(createBookingPageLocators.cashReturnCUDADatePicker);
		    	
		    	if((!createBookingPageLocators.DatePickerYear.getText().equalsIgnoreCase(StrYear)) || 
		    			!createBookingPageLocators.DatePickerMonth.getText().equalsIgnoreCase(StrMonth)){
		    		//createBookingPageLocators.DatePickerNextBtn.click();
		    		WebTestActions.clickElement(createBookingPageLocators.DatePickerNextBtn);
		    	}
		    	
		    	WebElement element = WebTestActions.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + StrDay + "']"));
		    	WebTestActions.clickElement(element);
		    	try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
	 	}
	 }

 
 public void CopySelectTime(String Time){
 	try {
	        if((WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.SelectCopyTime)) && (Time != null)) {
	        	/*createBookingPageLocators.SelectTime.click();
	            Select accountDropdown = new Select(createBookingPageLocators.SelectTime);
	            accountDropdown.selectByVisibleText(Time);*/
	        	WebTestActions.SelectByVisibleText(Time, createBookingPageLocators.SelectCopyTime);
	        } else if ((createBookingPageLocators.SelectCopyTime.isDisplayed()) && (Time == null)){
	        	createBookingPageLocators.SelectCopyTime.click();
	            Select accountDropdown = new Select(createBookingPageLocators.SelectCopyTime);
	            int opt = accountDropdown.getOptions().size();
	            if(opt > 1) {
		            if(opt == 2) {
		            	accountDropdown.selectByIndex(2);
		            } else if(opt > 2) {
		            	accountDropdown.selectByIndex(opt-1);
		            }
	            }
	        }	
 	}catch(Exception e) {
 		
 	}
  }
 
 public void selectcopyDate(String StrDate) { 
 	
 	if(WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.copyDatePicker)) {
	    	/*DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			LocalDate date = LocalDate.parse(StrDate,f1);
	    	String StrYear = String.valueOf(date.getYear());
	    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
	    	String StrDay = String.valueOf(date.getDayOfMonth());*/
 		
 		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
			LocalDate date = LocalDate.parse(StrDate.toString(),f1);
			date = date.plusDays(5);
	    	String StrYear = String.valueOf(date.getYear());
	    	String StrMonth = new DateFormatSymbols().getMonths()[date.getMonthValue()-1];
	    	String StrDay = String.valueOf(date.getDayOfMonth());
	    	
	    	//createBookingPageLocators.DatePicker.click();
	    	WebTestActions.clickElement(createBookingPageLocators.copyDatePicker);
	    	
	    	if((!createBookingPageLocators.DatePickerYear.getText().equalsIgnoreCase(StrYear)) || 
	    			!createBookingPageLocators.DatePickerMonth.getText().equalsIgnoreCase(StrMonth)){
	    		//createBookingPageLocators.DatePickerNextBtn.click();
	    		WebTestActions.clickElement(createBookingPageLocators.DatePickerNextBtn);
	    	}
	    	
	    	WebElement element = WebTestActions.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='" + StrDay + "']"));
	    	WebTestActions.clickElement(element);
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
 	}
 }

    public void SelectTime(String Time){
    	try {
	        if((WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.SelectTime)) && (Time != null)) {
	        	/*createBookingPageLocators.SelectTime.click();
	            Select accountDropdown = new Select(createBookingPageLocators.SelectTime);
	            accountDropdown.selectByVisibleText(Time);*/
	        	WebTestActions.SelectByVisibleText(Time, createBookingPageLocators.SelectTime);
	        } else if ((createBookingPageLocators.SelectTime.isDisplayed()) && (Time == null)){
	        	createBookingPageLocators.SelectTime.click();
	            Select accountDropdown = new Select(createBookingPageLocators.SelectTime);
	            int opt = accountDropdown.getOptions().size();
	            if(opt > 1) {
		            if(opt == 2) {
		            	accountDropdown.selectByIndex(2);
		            } else if(opt > 2) {
		            	accountDropdown.selectByIndex(opt-1);
		            }
	            }
	        }	
    	}catch(Exception e) {
    		
    	}
     }
    
    public void VerifyErrorMessage(){
    	try {
	        if((WebTestActions.VerifyObjectIsDisplayed(createBookingPageLocators.GMRSDVMessageText))) {
	        	System.out.println(WebTestActions.getObjectText(createBookingPageLocators.GMRSDVMessageText));
	        	WebTestActions.clickElement(createBookingPageLocators.BrexitAdviceLink);
	        	WebTestActions.CloseAllOpenedTabsExceptFirstTab();
	        }
    	}catch(Exception e) {
    		
    	}
     }
    
    public void ValidateRouteValidationMessage(String Route, String UnitType){
		
    	//WebTestActions.clickElement(createBookingPageLocators.CreateBookingLink);
		    					
    	SelectRoute(Route);

    	clickGenerateForm();
    					
    	SelectUnitType(UnitType);
    	
    	VerifyErrorMessage();
    					
    	enterUnitIDInput(generateRandomString(5));
    					
    	enterJobReferenceFilterInput(generateRandomString(5));
    					
    	enterJobDescriptionInput(generateRandomString(5));
    					
    	enterUnitLengthInput("5");
    				
    	enterUnitWeight("10");
    			    				
    	selectDate("");
    				
    	SelectTime(null);
    			
    	click_booking_complies_confirm_Checkbox();
    					
    	click_Tearms_and_Conditions_Checkbox();
    					
    	click_Submit_Booking_Button();
    								
    	getWayBillNo();

	}
    
    public void Create_Booking_Records(){
		
		testdata.readTestData(TestdataFile, "CREATEBOOKINGS");
		testdata.setWorkbook();
		testdata.setCellData(0,0,"WAYBILLNO");
		testdata.setCellData(0,1,"ROUTE");
		testdata.setCellData(0,2,"TRAVEL_DATE");
		testdata.setCellData(0,3,"UNIT_TYPE");
		testdata.setCellData(0,4,"UNIT_ID");
		testdata.setCellData(0,5,"JOB_REFERENCE");
		testdata.setCellData(0,6,"ACCOUNT");
		
		try {
			for(int r = 1; r <= 1; r++){
				//for(int r = 1; r <= testdata.testDataRowCount; r++){
				
				Create_Booking_Records(r);
				Thread.sleep(2000);
				/*String WayBillNo = Create_Booking_Records(r);
				
				//String WayBillNo = "CR00576099";
				WayBillNo = WayBillNo.trim();
				System.out.println("WayBillNo: " + WayBillNo);
				
				//Verify_Booking_Records(r, WayBillNo);
				//Seleniumdriver.getDriver().navigate().refresh();
				//Thread.sleep(10000);
				ManageBookingsPageActions.navigateToManageBookings();
				ManageBookingsPageActions.select248500Account();;
				ManageBookingsPageActions.OpenFilter();
				//ManageBookingsPageActions.ClickClearButton();
				ManageBookingsPageActions.SelectAccount(testdata.getTestData(r,"ACCOUNT"));
				ManageBookingsPageActions.enterWayBill(WayBillNo);
				ManageBookingsPageActions.ClickApplyButton();
				ManageBookingsPageActions.CloseFilter();
				ManageBookingsPageActions.QuickSearch(WayBillNo);
				
				ManageBookingsPageActions.validateBookingRecordsDataInQuickSearch(testdata, r);*/	
			}
		}catch(Exception e) {
			
		}
		
		testdata.saveWorkbook();
	}
    
    private String Create_Booking_Records(int rowNuber) throws InterruptedException {
		
    	//homePageActions.Nav_createBookingClick();
		
		clickGenerateForm();
			
		SelectAccount(testdata.getTestData(rowNuber,"ACCOUNT"));
				
		SelectRoute(testdata.getTestData(rowNuber,"ROUTE"));
				
		SelectNumberOfBookings(testdata.getTestData(rowNuber,"NO_OF_BOOKINGS"));
							
		/*SelectRoute(testdata.getTestData(rowNuber,"ROUTE"));*/
				
		clickGenerateForm();
				
		SelectUnitType(testdata.getTestData(rowNuber,"UNIT_TYPE"));
				
		enterUnitIDInput(testdata.getTestData(rowNuber,"UNIT_ID"));
				
		enterJobReferenceFilterInput(testdata.getTestData(rowNuber,"JOB_REFERENCE"));
				
		enterJobDescriptionInput(testdata.getTestData(rowNuber,"LOAD_DESCRIPTION"));
			
		SelectNumberOfDriver(testdata.getTestData(rowNuber,"NO_OF_DRIVERS"));
				
		enterUnitLengthInput(testdata.getTestData(rowNuber,"UNIT_LENGTH"));
			
		enterUnitWeight(testdata.getTestData(rowNuber,"WEIGHT"));
			
		enterUnitTemparature(testdata.getTestData(rowNuber,"UNIT_TEMPERATURE"));
			
		//enterStartDate(testdata.getTestData(rowNuber,"DATE"));
		selectDate(testdata.getTestData(rowNuber,"DATE"));
			
		SelectTime(testdata.getTestData(rowNuber,"TIME"));
		
		//click_booking_complies_confirm_Checkbox();
				
		//click_Tearms_and_Conditions_Checkbox();
				
		click_Submit_Booking_Button();
							
		String WayBillNo = getWayBillNo();
		
		Verify_Booking_Records(rowNuber, WayBillNo);
		
		return WayBillNo;
			
	}

    private void Verify_Booking_Records(int rowNuber, String WayBillNotxt) {
    	
    	int failcnt = 0;
    	
		testdata.setCellData(0,0,"WayBillNo");
		testdata.setCellData(0,1,"ROUTE");
		testdata.setCellData(0,2,"UNITTYPE");
		testdata.setCellData(0,3,"UNITID");
		testdata.setCellData(0,4,"JOB_REFERENCE");
		testdata.setCellData(0,5,"ACCOUNT");
		
		testdata.setCellData(0,6,"TEST_RESULT");
		
    	try {
    		//WebTestActions.clickElement(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
    		WayBillPageActions.WayBillValues(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
    		
    		String ROUTE = WayBillPageActions.From + " to " + WayBillPageActions.To; 
    		//validateText(testdata.getTestData(rowNuber,"ACCOUNT"),createBookingPageLocators.successfulBookings_VerifyText_From.getText());
    		//validateText(testdata.getTestData(rowNuber,"ACCOUNT"),createBookingPageLocators.successfulBookings_VerifyText_To.getText());
    		testdata.setCellData(rowNuber,1,ROUTE);
    		
    		if(validateText(WayBillNotxt,WayBillPageActions.WayBillNo)!=true) {
    			failcnt = failcnt + 1;
    		} 
    		testdata.setCellData(rowNuber,0,WayBillPageActions.WayBillNo);
    		
    		//validateText(testdata.getTestData(rowNuber,"ACCOUNT"),createBookingPageLocators.successfulBookings_VerifyTravelDate.getText());
    		
    		if(validateText(testdata.getTestData(rowNuber,"UNIT_TYPE"),WayBillPageActions.UnitType)!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,2,WayBillPageActions.UnitType);
    		
    		if(validateText(testdata.getTestData(rowNuber,"UNIT_ID"),WayBillPageActions.UnitID)!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,3,WayBillPageActions.UnitID);
    		
    		if(validateText(testdata.getTestData(rowNuber,"JOB_REFERENCE"),WayBillPageActions.JobReference)!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,4,WayBillPageActions.JobReference);
    		
    		if(validateText(testdata.getTestData(rowNuber,"ACCOUNT"),WayBillPageActions.Account)!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,5,WayBillPageActions.Account);
    		
    		if(failcnt > 0) {
    			testdata.setCellData(0,6,"Fail");
    		} else {
    			testdata.setCellData(0,6,"Pass");
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		    	
    }
    
    @SuppressWarnings("unused")
	private void Verify_Booking_RecordsOld(int rowNuber, String WayBillNo) {
    	
    	int failcnt = 0;
    	
		testdata.setCellData(0,0,"WayBillNo");
		testdata.setCellData(0,1,"ROUTE");
		testdata.setCellData(0,2,"UNITTYPE");
		testdata.setCellData(0,3,"UNITID");
		testdata.setCellData(0,4,"JOB_REFERENCE");
		testdata.setCellData(0,5,"ACCOUNT");
		
		testdata.setCellData(0,6,"TEST_RESULT");
		
    	try {
    		WebTestActions.clickElement(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
    		
    		String ROUTE = createBookingPageLocators.successfulBookings_VerifyText_From.getText() + " To " + createBookingPageLocators.successfulBookings_VerifyText_To.getText(); 
    		//validateText(testdata.getTestData(rowNuber,"ACCOUNT"),createBookingPageLocators.successfulBookings_VerifyText_From.getText());
    		//validateText(testdata.getTestData(rowNuber,"ACCOUNT"),createBookingPageLocators.successfulBookings_VerifyText_To.getText());
    		testdata.setCellData(rowNuber,1,ROUTE);
    		
    		if(validateText(WayBillNo,WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyWayBillNo))!=true) {
    			failcnt = failcnt + 1;
    		} 
    		testdata.setCellData(rowNuber,0,WayBillNo);
    		
    		//validateText(testdata.getTestData(rowNuber,"ACCOUNT"),createBookingPageLocators.successfulBookings_VerifyTravelDate.getText());
    		
    		if(validateText(testdata.getTestData(rowNuber,"UNIT_TYPE"),WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitType))!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,1,WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitType));
    		
    		if(validateText(testdata.getTestData(rowNuber,"UNIT_ID"),WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitID))!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,0,WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitID));
    		
    		if(validateText(testdata.getTestData(rowNuber,"JOB_REFERENCE"),WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyJobReference))!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,0,WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyJobReference));
    		
    		if(validateText(testdata.getTestData(rowNuber,"ACCOUNT"),WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyAccount))!=true) {
    			failcnt = failcnt + 1;
    		}
    		testdata.setCellData(rowNuber,0,WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyAccount));
    		
    		if(failcnt > 0) {
    			testdata.setCellData(0,6,"Fail");
    		} else {
    			testdata.setCellData(0,6,"Pass");
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		    	
    }
   
	@SuppressWarnings("unused")
	private boolean Verify_Booking_Records(String WayBillNo) {
		
    	boolean Verify_Booking = false;
		
    	try {
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyText_From);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyText_To);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyWayBillNo);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyTravelDate);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitType);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyUnitID);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyJobReference);
    		
    		WebTestActions.getObjectText(createBookingPageLocators.successfulBookings_VerifyAccount);
    		
    	}catch(Exception e) {
    		
    	}
		
    	return Verify_Booking;
    	
    }
    
    private boolean validateText(String ExpectedText, String ActualText) {
		boolean validation = false;
		if (ExpectedText.equalsIgnoreCase(ActualText)) {
			validation = true;
		}
		return validation;
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
    
	
	// Special Cash Flow *********************************
	
	public void clickNewBooking() {
		//WebTestActions.waitForElementToBeVisibile(createBookingPageLocators.NewBooking);
		WebTestActions.clickElement(createBookingPageLocators.NewBooking);
	}
	
	public void SelectRoute_SpecialCashFlow(String Route){
	  //  WebElement Element = WebTestActions.driver.findElement(By.xpath("//select[@data-index='0'][@id='Route_0']"));	
		WebElement Element = WebTestActions.driver.findElement(By.id("Route_0"));
	    WebTestActions.SelectByVisibleText(Route, Element);
	}
	
	public void enterUnitID_SpecialCashFlow(){
    	LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddhhmmss");
    	String dateTime = date.format(formatter);

        WebTestActions.writeText("UID" + dateTime, createBookingPageLocators.unitIDInput);
    }
	
	public void VarifyToolTips() {
				
		for(WebElement tooltip : createBookingPageLocators.tooltips){
			System.out.println("ToolTip : " + WebTestActions.getWebElementProperty("title",tooltip));
		}
	}
	
	public void ClickAmendLink() {
		//if ( WebTestActions.getAllObjects(By.xpath("//div[@data-element='0']//a[@class='amend']")).size() > 0 ) {
			WebTestActions.clickElementJS(createBookingPageLocators.AmendLink);
		//}
	}
	
	public void ClickAmendBookingLink() {
		//if ( WebTestActions.getAllObjects(By.xpath("//*[@id='confirm-booking']//a[text()='Amend booking']")).size() > 0 ) {
			WebTestActions.clickElementJS(createBookingPageLocators.AmendBookingLink);
		//}
	}
	
	public void ClickAmendCloseButton() {
		WebTestActions.clickElementJS(createBookingPageLocators.AmendCloseButton);
	}
	
	public void ClickAmendCloseLink() {
		WebTestActions.clickElementJS(createBookingPageLocators.AmendCloseLink);
	}
	
	public void NavigateToHome() {
		WebTestActions.clickElement(createBookingPageLocators.HomeLink);
	}
	
	public void NavigateToManageBookingPage() {
		WebTestActions.clickElement(createBookingPageLocators.ManageBookingLink);
	}
		
	public void varifyAmendBookingFromHomePage() throws InterruptedException {
//		NavigateToHome();
		ClickAmendLink();
		Thread.sleep(2000);
		ClickAmendCloseButton();		
	}
	
	public void varifyAmendBookingFromManageBookingPage() throws InterruptedException {
//		NavigateToManageBookingPage();		
		ClickAmendLink();
		Thread.sleep(2000);
		ClickAmendCloseButton();		
	}
	
	public void varifyAmendBookingFromCreateBookingPage() {
		ClickAmendBookingLink();
		ClickAmendCloseButton();		
	}
	public void EditCopyvaluesPage() throws InterruptedException {
		LocalDateTime date = LocalDateTime.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddhhmmss");
    	String dateTime = date.format(formatter);
		selectAll(createBookingPageLocators.unitcopyIDInput);
		createBookingPageLocators.unitcopyIDInput.clear();
		 WebTestActions.writeText(dateTime, createBookingPageLocators.unitcopyIDInput);
		Thread.sleep(1000);
		selectAll(createBookingPageLocators.copyjobReferenceInput);
		createBookingPageLocators.copyjobReferenceInput.clear();
		WebTestActions.writeText("JR" +dateTime, createBookingPageLocators.copyjobReferenceInput);
		Thread.sleep(1000);
		selectAll(createBookingPageLocators.copyjobDescriptionInput);
		createBookingPageLocators.copyjobDescriptionInput.clear();	
		WebTestActions.writeText("JD" +dateTime, createBookingPageLocators.copyjobDescriptionInput);
		Thread.sleep(1000);
		selectAll(createBookingPageLocators.copyunitLengthInput);
		createBookingPageLocators.copyunitLengthInput.clear();
		WebTestActions.writeText("16.5", createBookingPageLocators.copyunitLengthInput);
		Thread.sleep(1000);
		selectcopyDate("");
		CopySelectTime("");
		WebTestActions.clickElement(createBookingPageLocators.SubmitBooking);
		 getWayBillNo();
	//	SubmitBooking.click();
		
	}
	public void selectAll(WebElement element) {
	    String selectAll = Keys.chord(Keys.CONTROL, "a");
	    element.sendKeys(selectAll);
	}
	
	public void SpecialCash_Create_Booking_Records() throws InterruptedException {
			
		//clickNewBooking();
		
		clickNewBooking();
		
		VarifyToolTips();
					
		SelectRoute_SpecialCashFlow("Dover to Calais");
		
		selectUnitTypeFromDropDown("Tractor+Trailer( TT )");
								
		enterUnitID_SpecialCashFlow();
				
		//enterJobReferenceFilterInput("");
		enterRandomJobReferenceInput();	
		
		enterRandomJobDescriptionInput();
			
		SelectNumberOfDriver("1.0");
				
		enterUnitLengthInput("16.5");
			
		//enterUnitWeight("");
			
		//enterUnitTemparature("");
				
		click_Submit_Booking_Button();
							
		//click_Billing_address_checkbox();
		WebTestActions.clickElementJS(createBookingPageLocators.BillingAddrCBCheckBox);
		
		WebTestActions.clickElementJS(createBookingPageLocators.paymentTermsCheckBox);
		
		click_Proceed_to_payment();
		
		enter_Card_Number();
		
		click_Expiry_Date_Month();
		
		select_Expiry_Date_Month();
		
		click_Date_Year();
		
		select_Date_Year();
		
		enter_CSC();
		
		click_Submit_button();
	}
}
;