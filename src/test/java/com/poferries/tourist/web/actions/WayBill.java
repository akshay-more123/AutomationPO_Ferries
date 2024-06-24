package com.poferries.tourist.web.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class WayBill {
	
	private static final String UNUSED = "unused";
	Actions WebTestActions;
	ConfigReader configReader = new ConfigReader();
	private static final Logger logger = LogManager.getLogger(WayBill.class.getName());
	
	// Constructor initialising the page factory elements
	public WayBill(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}
	
	//************************************
	//WayBill
	//************************************
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Clear')]")
    public WebElement clearButtondata;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Journey Details')]")
	public WebElement CashFB;
	
	@FindBy(how = How.XPATH, using = "//div[@id='showTiles']/div[1]//div[@class='eachLine'][text()='WayBill No: ']")
	public WebElement FirstWayBillNo;

    @FindBy(how = How.XPATH, using = "//h2[text()='Booking Details']/../..//a[@class='close icon']")
    public WebElement BookingDetailsCloseIcon;
		
	@FindBy(how = How.XPATH, using = "//div[@id='showTiles']/div[1]//a[@class='edit'][text()='Edit']")
	public WebElement FirstWayBillEdit;
		
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Account: ']/../*[@class='data']")
	public WebElement AccountData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='From:']/../*[@class='data']")
	public WebElement FromData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='To:']/../*[@class='data']")
	public WebElement ToData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='WayBill No: ']/../*[@class='data']")
	public WebElement WayBillNoData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Booking Date:']/../*[@class='data']")
	public WebElement BookingDateData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Unit Type: ']/../*[@class='data']")
	public WebElement UnitTypeData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Unit ID: ']/../*[@class='data']")
	public WebElement UnitIDData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Unit Length (M):']/../*[@class='data']")
	public WebElement UnitLengthData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Plug-in:']/../*[@class='data']")
	public WebElement PlugData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Drivers:']/../*[@class='data']")
	public WebElement DriversData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Temp (°C):']/../*[@class='data']")
	public WebElement TempData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Job Reference:']/../*[@class='data']")
	public WebElement JobReferenceData;
	
	@FindBy(how = How.XPATH, using = "//*[@id='showDetails']//label[text()='Description:']/../*[@class='data']")
	public WebElement DescriptionData;
	
	  //*[@id=""]/
//	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsContainer']//section[@class='ccListGridTwo hideme']/h2")
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsContainer']/section/h2")								
	public WebElement FirstSB;
	//*[@id="successfulBookingsBlock"]/div[2]/div/div[1]/div[1]/div[2]/div[1]
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Way Bill No: '][@data-element='0']/span")
    public WebElement FirstWaybillGet;
	
	@FindBy(how = How.XPATH, using = "//div[@id='successfulBookingsBlock']//div[@class='eachLine'][text()='Way Bill No: '][@data-element='1']/span")
    public WebElement SecondWaybillGet;

	  
	
	//************************************
	
    @FindBy(how = How.ID, using = "UnitID_0")
    public WebElement unitIDInput;
    
    @FindBy(how = How.ID, using = "UnitID_1")
    public WebElement unitIDInputdata1;
    
    @FindBy(how = How.ID, using = "JobReference_0")
    public WebElement JobReferenceInput;
    
    @FindBy(how = How.ID, using = "JobDescription_0")
    public WebElement JobDescriptionInput;
    @FindBy(how = How.ID, using = "JobReference_1")
    public WebElement JobReferenceInputdata1;
    
    @FindBy(how = How.ID, using = "JobDescription_1")
    public WebElement JobDescriptionInputdata1;
    
    
    @FindBy(how = How.ID, using = "waybillNo_0")
    public WebElement waybillNoInput;
    
    @FindBy(how = How.ID, using = "UnitType_0")
    public WebElement UnitTypeSelect;
    
    @FindBy(how = How.ID, using = "UnitType_1")
    public WebElement UnitTypeSelectdata1;
    
    @FindBy(how = How.ID, using = "Account_0")
    public WebElement AccountSelect;
    
    @FindBy(how = How.ID, using = "Account_1")
    public WebElement AccountSelectdata1;
    
    @FindBy(how = How.ID, using = "drivers_0")
    public WebElement driversSelect;
    
    @FindBy(how = How.ID, using = "UnitLength_0")
    public WebElement UnitLengthInput;
    
    @FindBy(how = How.ID, using = "UnitWeight_0")
    public WebElement UnitWeightInput;
    
    @FindBy(how = How.ID, using = "UnitTemperature_0")
    public WebElement UnitTemperatureInput;
    
    @FindBy(how = How.ID, using = "Route_0")
    public WebElement RouteSelect;
    
    @FindBy(how = How.ID, using = "Route_1")
    public WebElement RouteSelect1;
    
    @FindBy(how = How.ID, using = "deleteButton_1")
    public WebElement Deletecopysection;
    
    @FindBy(how = How.CLASS_NAME, using = "error invalid-feedback")
    public WebElement ErrorMessage;
    
    @FindBy(how = How.ID, using = "SubmitBooking")
    public WebElement SubmitBooking;
      
    
	//************************************
		
	protected String Account;
	protected String Account1;
	protected String From;
	protected String To;
	protected String WayBillNo;
	protected String BookingDate;
	protected String UnitType;
	protected String UnitID;
	protected String UnitLength;
	protected String UnitType1;
	protected String UnitID1;
	protected String UnitLength1;
	protected String Plug;
	protected String Drivers;
	protected String Temp;
	protected String JobReference;
	protected String Description;
	protected String JobReference1;
	protected String Description1;
	protected String EMessage;
	
	public void WayBillValues() {

		WebTestActions.getObjectText(FirstWayBillNo);//FirstWayBillNo.getText();
			WebTestActions.clickElement(FirstWayBillNo); //FirstWayBillNo.click();
			WebTestActions.waitForElementToBeVisibile(AccountData);
			getWayBillValues();
	
	//	WebTestActions.clickElement(FirstWayBillNo); //FirstWayBillNo.click();
		//WebTestActions.waitForElementToBeVisibile(AccountData);
		
		/*Account = WebTestActions.getObjectText(AccountData); //AccountData.getText();
		From = WebTestActions.getObjectText(FromData); //FromData.getText();
		To = WebTestActions.getObjectText(ToData); //ToData.getText();
		WayBillNo = WebTestActions.getObjectText(WayBillNoData); //WayBillNoData.getText();
		BookingDate = WebTestActions.getObjectText(BookingDateData); //BookingDateData.getText();
		UnitType = WebTestActions.getObjectText(UnitTypeData); //UnitTypeData.getText();
		UnitID = WebTestActions.getObjectText(UnitIDData); //UnitIDData.getText();
		UnitLength = WebTestActions.getObjectText(UnitLengthData); //UnitLengthData.getText();
		Plug = WebTestActions.getObjectText(PlugData); //PlugData.getText();
		Drivers = WebTestActions.getObjectText(DriversData); //DriversData.getText();
		Temp = WebTestActions.getObjectText(TempData); //TempData.getText();
		JobReference = WebTestActions.getObjectText(JobReferenceData); //JobReferenceData.getText();
		Description = WebTestActions.getObjectText(DescriptionData); //DescriptionData.getText();
		
		WebTestActions.clickElement(BookingDetailsCloseIcon); //BookingDetailsCloseIcon.click();*/
//		getWayBillValues();
		WebTestActions.waitForElementToBeVisibile(FirstWayBillNo);
	}

	
	public void WayBillValues(WebElement WayBillNoElement) {

		WebTestActions.clickElement(WayBillNoElement); //FirstWayBillNo.click();
		WebTestActions.waitForElementToBeVisibile(AccountData);
		
		getWayBillValues();
	}
	
	private void getWayBillValues() {
		
		Account = WebTestActions.getObjectText(AccountData); //AccountData.getText();
		From = WebTestActions.getObjectText(FromData); //FromData.getText();
		To = WebTestActions.getObjectText(ToData); //ToData.getText();
		WayBillNo = WebTestActions.getObjectText(WayBillNoData); //WayBillNoData.getText();
		BookingDate = WebTestActions.getObjectText(BookingDateData); //BookingDateData.getText();
		UnitType = WebTestActions.getObjectText(UnitTypeData); //UnitTypeData.getText();
		UnitID = WebTestActions.getObjectText(UnitIDData); //UnitIDData.getText();
		UnitLength = WebTestActions.getObjectText(UnitLengthData); //UnitLengthData.getText();
		Plug = WebTestActions.getObjectText(PlugData); //PlugData.getText();
		Drivers = WebTestActions.getObjectText(DriversData); //DriversData.getText();
		Temp = WebTestActions.getObjectText(TempData); //TempData.getText();
		JobReference = WebTestActions.getObjectText(JobReferenceData); //JobReferenceData.getText();
		Description = WebTestActions.getObjectText(DescriptionData); //DescriptionData.getText();
		
		WebTestActions.clickElement(BookingDetailsCloseIcon); //BookingDetailsCloseIcon.click();
	}
@SuppressWarnings(UNUSED)
private void getcopydata() throws InterruptedException {
		
		Account1 = WebTestActions.getObjectText(AccountSelect); //AccountData.getText();
		UnitType1 = WebTestActions.getObjectText(UnitTypeSelect); //UnitTypeData.getText();
		UnitID1 = WebTestActions.getObjectText(unitIDInput); //UnitIDData.getText();
		UnitLength1 = WebTestActions.getObjectText(UnitLengthInput); //UnitLengthData.getText();
		JobReference1 = WebTestActions.getObjectText(JobReferenceInput); //JobReferenceData.getText();
		Thread.sleep(3000);
		Description1 = WebTestActions.getObjectText(JobDescriptionInput); //DescriptionData.getText();
		}

	public void CompareWayBillValuesToEditPage() {

		WebTestActions.clickElement(FirstWayBillEdit); //FirstWayBillEdit.click();
		WebTestActions.waitForElementToBeVisibile(AccountSelect); //Seleniumdriver.getWaitDriver().until(ExpectedConditions.visibilityOf(AccountSelect));
		
		validateText("Account",Account, getFirstSelectedOption(AccountSelect));
		validateText("Route", From + " to " + To, getFirstSelectedOption(RouteSelect));
		validateText("WayBillNo", WayBillNo, getProperty("value", waybillNoInput));
		//validateText(BookingDate, getFirstSelectedOption(AccountSelect));
		validateText("UnitType", UnitType, getFirstSelectedOption(UnitTypeSelect));
		validateText("UnitID", UnitID, getProperty("value", unitIDInput));
		//validateText("UnitID", UnitID, getProperty("123", unitIDInput));
		validateText("UnitLength", UnitLength, getProperty("value", UnitLengthInput));
		//validateText(Plug, getFirstSelectedOption(AccountSelect));
		validateText("Drivers",Drivers, getFirstSelectedOption(driversSelect));
		validateText("Temperature", Temp, getProperty("value", UnitTemperatureInput));
		validateText("JobReference", JobReference, getProperty("value", JobReferenceInput));
		validateText("JobDescription", Description, getProperty("value", JobDescriptionInput));
	
	}
	public void submitdata()
	{
		WebTestActions.clickElement(SubmitBooking);
	}
	public void CompareCopyData() throws InterruptedException {
		
		WebTestActions.waitForElementToBeVisibile(AccountSelectdata1);
		validateText("Account",Account1, getFirstSelectedOption(AccountSelectdata1));
		//validateText("Route", From + " to " + To, getFirstSelectedOption(RouteSelect1));
		validateText("UnitType", UnitType1, getFirstSelectedOption(UnitTypeSelectdata1));
		validateText("UnitID", UnitID1, getProperty("value", unitIDInputdata1));
		validateText("JobReference", JobReference1, getProperty("value", JobReferenceInputdata1));
		Thread.sleep(3000);
		validateText("JobDescription", Description1, getProperty("value", JobDescriptionInputdata1));
		
	}
	public void getcopydatafromcopy() throws InterruptedException
	{
		getcopydata();
	Thread.sleep(2000);
		
	}
	
	public void click_Clear() throws InterruptedException{
		
		//WebTestActions.waitForElementToBeVisibile(clearButtondata);
		WebTestActions.clickElement(clearButtondata);
		
	//	WebTestActions.clickElement(createBookingPageLocators.clearButton);
		Thread.sleep(2000);
		//clearButtondata.click();
	}
	
	public void EditWayBillValuesToEditPage() throws InterruptedException {
		
		String UnitID = getProperty("value", unitIDInput);
		String UnitLength = getProperty("value", UnitLengthInput);
		String JobReference = getProperty("value", JobReferenceInput);
		String JobDescription = getProperty("value", JobDescriptionInput);
		unitIDInput.clear();
		unitIDInput.sendKeys(UnitID + "T");
		Thread.sleep(2000);
		UnitLengthInput.clear();
		UnitLengthInput.sendKeys(UnitLength);
		Thread.sleep(2000);
		JobReferenceInput.clear();
		JobReferenceInput.sendKeys(JobReference + "T1");
		Thread.sleep(2000);
		JobDescriptionInput.clear();
		JobDescriptionInput.sendKeys(JobDescription + "T1");
		Thread.sleep(2000);

		validateText("UnitID", UnitID + "T1", getProperty("value", unitIDInput));
		validateText("UnitLength", UnitLength, getProperty("value", UnitLengthInput));
		validateText("JobReference", JobReference + "T1", getProperty("value", JobReferenceInput));
		validateText("JobDescription", JobDescription + "T1", getProperty("value", JobDescriptionInput));
		
	
		
	}

	private boolean validateText(String Filed, String ExpectedText, String ActualText) {
		boolean validation = false;
		if (ExpectedText.equalsIgnoreCase(ActualText)) {
			validation = true;
		}
		logger.info("Compares Text of '"+ Filed + " ===> "+ ExpectedText + " --> " + ActualText + " = " + validation);
		return validation;
	}
	public void ErrorMessage() {
		
		validateText("Error Message", EMessage, getProperty("value", ErrorMessage));
	}
	
	 public void clickdeleteicon(){
	        WebTestActions.clickElement(Deletecopysection);
	    }
	
	private String getFirstSelectedOption(WebElement wSelect) {
		/*Select select = new Select(wSelect);
		WebElement option = select.getFirstSelectedOption();
		return option.getText();*/
		return WebTestActions.getFirstSelectedOption(wSelect);
	}
	public String getFirstSelectedOptionfilp(WebElement wSelect) {
		/*Select select = new Select(wSelect);
		WebElement option = select.getFirstSelectedOption();
		return option.getText();*/
		return WebTestActions.getFirstSelectedOption(wSelect);
	}
	public String getProperty(final String name, WebElement wSelect) {
		/*JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
	    return js.executeScript("return arguments[0]." + name + ";", wSelect).toString();*/
		return WebTestActions.getWebElementProperty(name, wSelect);
	}

}
