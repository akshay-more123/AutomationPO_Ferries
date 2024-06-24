package com.poferries.tourist.web.actions;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.poferries.tourist.web.utilities.TestDataUtil;
import com.web.actions.Actions;

public class TrackBookingsPageActions {
	
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
	
	@FindBy(how = How.XPATH, using = "//select[@id='Status']/..//div[@name='multiselectFormText']")
	public WebElement StatusDropDown;
	
	@FindBy(how = How.XPATH, using = "//select[@id='Status']/..//label[text()='Cancelled']/../input[@type='checkbox']")
	public WebElement StatusCheckBox;

	@FindBy(how = How.ID, using = "apply")
	public WebElement ApplyBtn;

	@FindBy(how = How.ID, using = "pannelClear")
	public WebElement ClearBtn;
	
	@FindBy(how = How.ID, using = "UnitType")
	public WebElement UnitType;
	
	@FindBy(how = How.ID, using = "QuickSearchInput")
	public WebElement QuickSearchInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']//span[@class='openViewPanel']")
	public WebElement FirstWayBillNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']//div[@class='infoColTwo']//*[text()='Unit ID: ']/span")
	public WebElement FirstWayUnitID;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tileArea']/div[@data-element='0']//div[@class='infoColTwo']//*[text()='Job Reference: ']/span")
	public WebElement FirstJobRef;
	
	
	//****************************************************************

	ConfigReader configReader = new ConfigReader();
	TestDataUtil testdata = new TestDataUtil();
	String TestdataFile = System.getProperty("user.dir") + configReader.configWeb.getProperty("DriverPlugInTestData");
	Set<String> selectedRoute = new TreeSet<>();
	Set<String> uniqueUNITTYPEList = new TreeSet<>();
	boolean signleRouteError = false; 
	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initializing the page factory elements
	public TrackBookingsPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// the below method returns the BookNow page title
	public String TrackBookingsPagePageTitle() {
		//return Seleniumdriver.getDriver().getTitle();
		return WebTestActions.PageTitle();
	}
	
	public void NavigateToTrackBookingsPage() throws InterruptedException{
		 WebTestActions.clickElement(TrackBookinglink);
		 Thread.sleep(2000);
	}

	// the below method selects the UnitType from the route drop down
	public void selectUnitType(String UnitTypeToSelect) {
		/*UnitType.click();
		Select UnitTypeDropDown = new Select(UnitType);
		UnitTypeDropDown.selectByVisibleText(UnitTypeToSelect);*/
		WebTestActions.SelectByVisibleText(UnitTypeToSelect, UnitType);
	}

	public void ClickTrackLink() {
		WebTestActions.clickElement(TrackBookinglink); //TrackBookingLink.click();
	}
	
	public void ClickFilter() {
		WebTestActions.clickElement(closeFilter); //closeFilter.click();
	}
	
	public void ClickFilterMenu() {
		WebTestActions.clickElement(filterBtn); //filterBtn.click();
	}
	
	public void ClickRouteDropdown() {
		WebTestActions.clickElement(RouteDropDown); //RouteDropDown.click();
	}
	public void ClickStatusDropdown() {
		WebTestActions.clickElement(StatusDropDown); //StatusDropDown.click();
	}
	public void ClickStatusCheckbox() {
		WebTestActions.clickElement(StatusCheckBox); //StatusDropDown.click();
	}
	public void ClickUnitTypeDropdown() {
		WebTestActions.clickElement(UnitType); //UnitType.click();
	}
	
	public void ClickApplyButton() throws InterruptedException {
		WebTestActions.clickElement(ApplyBtn); //ApplyBtn.click();
		//Thread.sleep(50000);
	}
	
	public void ClickClearButton() {
		WebTestActions.clickElement(ClearBtn); //ClearBtn.click();
	}
	
	public void SelectRouteCheckbox(String RouteToSelect) throws InterruptedException {
		/*WebElement Element = Seleniumdriver.getDriver().findElement(By.xpath("//select[@id='Route']/..//label[text()='" + RouteToSelect + "']/../input[@type='checkbox']"));
		JavascriptExecutor js = (JavascriptExecutor) Seleniumdriver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		Element.click();
		Thread.sleep(2000);*/
		WebElement Element = WebTestActions.driver.findElement(By.xpath("//select[@id='Route']/..//label[text()='" + RouteToSelect + "']/../input[@type='checkbox']"));
		WebTestActions.clickElementJS(Element);
	}
	
	public void selectRouteCheckBox() throws InterruptedException {
		testdata.readTestData(TestdataFile, "TRACK");
		selectedRoute.clear();
		
		for(int r = 1; r < testdata.rowCount; r++){
			//System.out.println(r + " ,"  + testdata.getTestData(r,"ROUTE") + " = " + testdata.getTestData(r,"IS_SELECTED"));	
			if (testdata.getTestData(r,"IS_SELECTED").equalsIgnoreCase("YES")) {
				selectedRoute.add(testdata.getTestData(r,"ROUTE"));
				SelectRouteCheckbox(testdata.getTestData(r,"ROUTE"));
			}				
		}
		
		/*for (String route : selectedRoute) {
			if ((selectedRoute.size() > 2) && (route.equalsIgnoreCase("Dublin to Liverpool")) || (selectedRoute.size() > 1)) {
				
					SelectRouteCheckbox(route);
	
			} else {
				signleRouteError = true;
				System.out.println("Please select correct Route combination, 'Dublin to Liverpool' not selected with any other Route");
				break;
			}
		}*/
	}
	
	private List<WebElement> getUnitTypeValues() throws InterruptedException {
			
		/*WebTestActions.clickElement(UnitType); //UnitType.click();
		Thread.sleep(1000);
		
		Select UnitTyeList = new Select(UnitType);
		List<WebElement> Options = UnitTyeList.getOptions();*/
			
		return WebTestActions.getDropdownOption(UnitType);
	}
	
	private void getUnitTypeTestData() throws InterruptedException {
		
		testdata.readTestData(TestdataFile, "Testdata");
		uniqueUNITTYPEList.clear();
		
		for (String route : selectedRoute) {
			for(int r = 1; r < testdata.rowCount; r++){
				if ((testdata.getTestData(r,"ROUTE").equalsIgnoreCase(route)) && (!uniqueUNITTYPEList.contains(testdata.getTestData(r,"UNITTYPE")))) {
					uniqueUNITTYPEList.add(testdata.getTestData(r,"UNITTYPE").toUpperCase());
				}
			}
		}
		
		//return uniqueUNITTYPEList;
	}
	
	public void verifyUnitTypeValues() throws InterruptedException {
					
			getUnitTypeTestData();
			System.out.println("selectedRoute: = " + selectedRoute);
			System.out.println("********************************");
			
			List<WebElement> Options = getUnitTypeValues();
			
			Collection<String> unitTypes = new HashSet<String>();
			
			for(WebElement option: Options) {
				unitTypes.add(WebTestActions.getObjectText(option));
			}
		
			Collection<String> similar = new HashSet<String>(uniqueUNITTYPEList);
			
			Collection<String> different = new HashSet<String>();
			different.addAll(uniqueUNITTYPEList);
			different.addAll(unitTypes);			
			
			similar.retainAll( unitTypes );
			different.removeAll( similar );
			
			System.out.printf("UNITTYPE Test Data:%s%nUNITTYPE System:%s%nMatched Values:%s%nDifferent Values:%s%n", uniqueUNITTYPEList, unitTypes, similar, different);
			
			testdata.setWorkbook();
			testdata.setCellData(0,0,"ROUTE");
			testdata.setCellData(0,1,"UNITTYPE");
			testdata.setCellData(0,2,"TEST_RESULT");
			testdata.setCellData(0,3,"UNITTYPE_OPTION");
			
			int r = 0;
			for (String route : selectedRoute) {
				r = r+1;
				testdata.setCellData(r,0,route);
			}
			
			int rr = 0;
			for(String value : different) {
				rr = rr+1;
				testdata.setCellData(rr,1,value);
				testdata.setCellData(rr,2,"Fail");
				//System.out.println(value + " = Fail");
			}
			
			for(String value : similar) {
				rr = rr+1;
				testdata.setCellData(rr,1,value);
				testdata.setCellData(rr,2,"Pass");
				//System.out.println(value + " = Pass");
			}
					
		testdata.saveWorkbook();
	}
	
	@SuppressWarnings("unused")
	private void selectRouteCheckBox1() throws InterruptedException {
		testdata.readTestData(TestdataFile, "TRACK");
		Set<String> selectedRoute = new TreeSet<>();
		
		for(int r = 1; r < testdata.rowCount; r++){
			System.out.println(testdata.getTestData(r,"ROUTE") + " = " + testdata.getTestData(r,"IS_SELECTED?"));
			if (testdata.getTestData(r,"IS_SELECTED?").equalsIgnoreCase("YES")) {
				selectedRoute.add(testdata.getTestData(r,"ROUTE"));
			}
		}
		
		System.out.println(selectedRoute);
		
		testdata.readTestData(TestdataFile, "Testdata");
		Set<String> uniqueUNITTYPEList = new TreeSet<>();
		
		for (String route : selectedRoute) {
			for(int r = 1; r < testdata.rowCount; r++){
				if (testdata.getTestData(r,"ROUTE").equalsIgnoreCase(route)) {
					uniqueUNITTYPEList.add(testdata.getTestData(r,"UNITTYPE"));
				}
			}
		}
		 
		System.out.println(uniqueUNITTYPEList.size());
	}

	public void QuickSearch(String searchText) {
		WebTestActions.writeText(searchText.trim(), QuickSearchInput);
		WebTestActions.Enter(QuickSearchInput);
		WebTestActions.waitForElementToBeClickable(FirstWayBillNumber);
	}
	
	public String getWayBillNo_QS() {
		WebTestActions.waitForElementToBeClickable(FirstWayBillNumber);	
		return WebTestActions.getObjectText(FirstWayBillNumber);
	}
	
	public String getUnitID_QS() {
		WebTestActions.waitForElementToBeClickable(FirstWayUnitID);	
		return WebTestActions.getObjectText(FirstWayUnitID);
	}
	
	public String getJobRef_QS() {
		WebTestActions.waitForElementToBeClickable(FirstJobRef);	
		return WebTestActions.getObjectText(FirstJobRef);
	}
	
	public void SearchAndValidateQuickSeach() {
		String FirstWayBillNum = getWayBillNo_QS();
		QuickSearch(FirstWayBillNum);
		validateText(FirstWayBillNum, getWayBillNo_QS());
		
		String FirstUnitId = getUnitID_QS();
		QuickSearch(FirstUnitId);
		validateText(FirstUnitId, getUnitID_QS());
		
		String FirstJobRef = getJobRef_QS();
		QuickSearch(FirstJobRef);
		validateText(FirstJobRef, getJobRef_QS());
		
	}
	
	public boolean validateText(String ExpectedText, String ActualText) {
		boolean validation = false;
		if (ExpectedText.equalsIgnoreCase(ActualText) || ExpectedText.contains(ActualText)) {
			validation = true;
			System.out.println(ExpectedText + " text is mached with " + ExpectedText);
		} else {
			System.out.println(ExpectedText + " text is not mached with " + ExpectedText);
			validation = false;
		}
		return validation;
	}
}
