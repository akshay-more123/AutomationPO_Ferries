package com.poferries.tourist.web.actions;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.locators.ManageBookingsLocators;
import com.web.actions.Actions;
import com.web.actions.WebActions;

public class ManageBookingsPageActions {



	ManageBookingsLocators ManageBookingsLocators = null;
	Actions WebTestActions;

	// Constructor initializing the page factory elements
	public ManageBookingsPageActions(Actions webTestActions) {
		this.WebTestActions = webTestActions;
		this.ManageBookingsLocators = new ManageBookingsLocators();
		PageFactory.initElements(WebTestActions.driver, this.ManageBookingsLocators);
	}

	// the below method returns the BookNow page title
	public String ManageBookingsPagePageTitle() {
		return WebTestActions.PageTitle();
	}
	
	public void navigateToManageBookings() throws InterruptedException {
		WebTestActions.clickElement(ManageBookingsLocators.ManageBookings);
		Thread.sleep(1000);
	}

	
	public void select248500Account() throws InterruptedException {
		WebTestActions.clickElement(ManageBookingsLocators.selectAccount);
		Thread.sleep(3000);
		WebTestActions.clickElement(ManageBookingsLocators.select248500Account);
		Thread.sleep(3000);
		WebTestActions.clickElement(ManageBookingsLocators.selectAccount);
	}
	
	public void OpenFilter() {
		WebTestActions.clickElement(ManageBookingsLocators.filterBtn);
	}
	
	public void CloseFilter() {
		WebTestActions.clickElement(ManageBookingsLocators.closeFilter);
	}

	public void ClickApplyButton() throws InterruptedException {
		WebTestActions.MouseHoverAndClick(ManageBookingsLocators.ApplyBtn);
		Thread.sleep(5000);		
	}
	
	public void ClickClearButton() {
		WebTestActions.clickElement(ManageBookingsLocators.ClearBtn);
	}
	
	public void SelectAccount(String AccountName) throws InterruptedException{
		WebTestActions.SelectByVisibleText(AccountName, ManageBookingsLocators.FILTER_BOOKINGS_BY_ChooseAccount);
        Thread.sleep(2000);
    }
	
	public void SelectRoute(String AccountName) throws InterruptedException{
		WebTestActions.SelectByVisibleText(AccountName, ManageBookingsLocators.FILTER_BOOKINGS_BY_Route);
    }
	
	public void SelectUnitType(String AccountName) throws InterruptedException{
		WebTestActions.SelectByVisibleText(AccountName, ManageBookingsLocators.FILTER_BOOKINGS_BY_UnitType);
    }
	
	public void SelectsailingDate(long days) throws InterruptedException{
		
		if(WebTestActions.VerifyObjectIsDisplayed(ManageBookingsLocators.FILTER_BOOKINGS_sailingFilterCheckBox)) {
		
			if(WebTestActions.VerifyObjectIsDisplayed(ManageBookingsLocators.FILTER_BOOKINGS_selectTime)==false) {
				WebTestActions.clickElement(ManageBookingsLocators.FILTER_BOOKINGS_sailingFilterCheckBox);
			}
			WebTestActions.clickElement(ManageBookingsLocators.FILTER_BOOKINGS_scheduleFilterDatePicker);
			
			List<WebElement> elementList = ManageBookingsLocators.FILTER_BOOKINGS_datepicker.findElements(By.tagName("td"));
			elementList.stream()
	        .filter(element -> element.getText().contains(getDayOfDate(days)))
	        .findFirst()
	        .ifPresent(WebElement::click);
			
		}
    }
	
	private String getDate(long days){
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
		LocalDate date = LocalDate.parse(StrDate.toString(),f1);
		date = date.plusDays(days);
    	String StrYear = String.valueOf(date);
		return StrYear;

    }
	
	private String getDayOfDate(long days){
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String StrDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
		LocalDate date = LocalDate.parse(StrDate.toString(),f1);
		date = date.plusDays(days);
    	String StrYear = String.valueOf(date.getDayOfMonth());
		return StrYear;

    }
		
	public boolean verifyUnitType(String UnitTypeToSelect) {
		boolean match = false;
		List<WebElement> UnitTypeValues = WebTestActions.getDropdownOption(ManageBookingsLocators.FILTER_BOOKINGS_BY_UnitType);
		for(WebElement UnitType : UnitTypeValues) {
            if(UnitType.getText().equalsIgnoreCase(UnitTypeToSelect)) {
            	System.out.println("verify Unit Type: " + UnitTypeToSelect);
            	match =  true;
            }
		}
		return match;
	}
	
	public int verifyTimeList() {
		List<WebElement> TimeListValues = WebTestActions.getDropdownOption(ManageBookingsLocators.FILTER_BOOKINGS_selectTime);
		return TimeListValues.size();
	}
	
	public void QuickSearch(String searchText) {
		WebTestActions.writeText(searchText.trim(), ManageBookingsLocators.mngBooking_QuickSearch);
		WebTestActions.Enter(ManageBookingsLocators.mngBooking_QuickSearch);
		WebTestActions.waitForElementToBeClickable(ManageBookingsLocators.mngBooking_FirstWayBillNumber);		
	}
	
	public String getWayBillNo_QS() {
		WebTestActions.waitForElementToBeClickable(ManageBookingsLocators.mngBooking_FirstWayBillNumber);	
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_FirstWayBillNumber);
	}
	
	public String getUnitID_QS() {
		WebTestActions.waitForElementToBeClickable(ManageBookingsLocators.mngBooking_FirstWayUnitID);	
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_FirstWayUnitID);
	}
	
	public String getJobRef_QS() {
		WebTestActions.waitForElementToBeClickable(ManageBookingsLocators.mngBooking_FirstJobRef);	
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_FirstJobRef);
	}
	
	public void SearchAndValidateWayBillInQuickSeach() {
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
	
	public void Validate_toolTipOfHelpIcons() throws InterruptedException {
		
		String routeText = null;
		String helpText = null;
		
		for (int i=1; i<ManageBookingsLocators.mngBooking_helpIcons.size(); i++){
			
			WebTestActions.MoveToElementJS(ManageBookingsLocators.mngBooking_helpIcons.get(i));
			routeText = ManageBookingsLocators.mngBooking_helpIcons.get(i).findElement(By.xpath("../..//div[@class='divRoute']")).getText();
			
			System.out.println("routeText : " + routeText);
			
			WebTestActions.clickElementJS(ManageBookingsLocators.mngBooking_helpIcons.get(i));
			
			Thread.sleep(1000);
			
			for (int a=1; i<ManageBookingsLocators.mngBooking_helpParas.size(); a++){
								
				helpText = WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_helpParas.get(a));
				
				System.out.println("helpText : " + helpText);
				
				if(routeText.equalsIgnoreCase("Liverpool to Dublin")) {
					validateText("For speedy check-in please enter the PBN and GMR for this booking. If you need more information, please visit our ", helpText);
				} 
				
				if (routeText.equalsIgnoreCase("Dublin to Liverpool")) {
					validateText("For speedy check-in please enter the PBN and GMR for this booking. If you need more information, please visit our ", helpText);
				} 
				
				if (routeText.equalsIgnoreCase("Larne to Cairnryan")) {
					validateText("GMR for Larne to Cairnryan is required only in exceptional instances. To find out if this applies to your booking, please visit our ", helpText);
				} 
				
				if (routeText.equalsIgnoreCase("Cairnryan to Larne")) {
					validateText("For speedy check-in please enter the GMR for this booking. If you need more information, please visit our ", helpText);
				}
				
			}
			
			WebTestActions.clickElementJS(ManageBookingsLocators.mngBooking_helpIcon_Close);
		   }
	}
	
	/*public void enterWayBill(String waybill) throws InterruptedException{
		WebTestActions.writeText(waybill.trim(), ManageBookingsLocators.FILTER_BOOKINGS_BY_waybill);
		Thread.sleep(2000);
		//ClickApplyButton();
    }
		
	public boolean validateText(String ExpectedText, String ActualText) {
		boolean validation = false;
		if (ExpectedText.equalsIgnoreCase(ActualText) || ExpectedText.contains(ActualText)) {
			validation = true;
		}
		return validation;
	}
		
	public String getFromText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_From.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_From);
	}
	
	public String getRouteText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_Route.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_Route);
	}

	public String getToText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_To.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_To);
	}
	
	public String getTravelDateText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_TravelDate.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_TravelDate);
	}
	
	public String getUnitTypeText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_UnitType.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_UnitType);
	}
	
	public String getUnitIDText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_UnitID.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_UnitID);
	}
	
	public String getJobReferenceText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_JobReference.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_JobReference);
	}
	
	public String getAccountText_QS() {
		//return ManageBookingsLocators.mngBooking_VerifyText_Account.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.mngBooking_VerifyText_Account);
	}
	
	public void validateBookingRecordsDataInQuickSearch(TestDataUtil testdata,  int rowNuber) {
				
		int failcnt = 0;
		
		try {
			//String Route = getRouteText_QS(); //getFromText_QS() + " To " + getToText_QS();
			
			testdata.setCellData(rowNuber,0,getWayBillNo_QS());
			
			testdata.setCellData(rowNuber,1,getRouteText_QS());
			
			testdata.setCellData(rowNuber,2,getTravelDateText_QS());
			
			if(validateText(testdata.getTestData(rowNuber,"UNIT_TYPE"),getUnitTypeText_QS())!=true) {
				failcnt = failcnt + 1;
			}
			testdata.setCellData(rowNuber,3,getUnitTypeText_QS());
			
			if(validateText(testdata.getTestData(rowNuber,"UNIT_ID"),getUnitIDText_QS())!=true) {
				failcnt = failcnt + 1;
			}
			testdata.setCellData(rowNuber,4,getUnitIDText_QS());
			
			if(validateText(testdata.getTestData(rowNuber,"JOB_REFERENCE"),getJobReferenceText_QS())!=true) {
				failcnt = failcnt + 1;
			}
			testdata.setCellData(rowNuber,5,getJobReferenceText_QS());
			

			testdata.setCellData(rowNuber,6,getAccountText_QS());
			
			if(failcnt > 0) {
				testdata.setCellData(rowNuber,7,"Fail");
			} else {
				testdata.setCellData(rowNuber,7,"Pass");
			}
		
		}catch(Exception e) {
    		e.printStackTrace();
    	}
		
	}

	public String getAccountText_BD() {
		//return ManageBookingsLocators.VerifyText_Account_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_Account_BD);
	}
	
	public String getFromText_BD() {
		//return ManageBookingsLocators.VerifyText_From_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_From_BD);
	}
	
	public String getToText_BD() {
		//return ManageBookingsLocators.VerifyText_To_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_To_BD);
	}
	
	public String getWayBillNoText_BD() {
		//return ManageBookingsLocators.VerifyText_WayBillNo_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_WayBillNo_BD);
	}
	
	public String getBookingDateText_BD() {
		//return ManageBookingsLocators.VerifyText_BookingDate_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_BookingDate_BD);
	}
	
	public String getUnitTypeText_BD() {
		//return ManageBookingsLocators.VerifyText_UnitType_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_UnitType_BD);
	}
	
	public String getUnitIDText_BD() {
		//return ManageBookingsLocators.VerifyText_UnitID_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_UnitID_BD);
	}
	
	public String getUnitLengthText_BD() {
		//return ManageBookingsLocators.VerifyText_UnitLength_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_UnitLength_BD);
	}
	
	public String getPlugInText_BD() {
		//return ManageBookingsLocators.VerifyText_PlugIn_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_PlugIn_BD);
	}
	
	public String getDriversText_BD() {
		//return ManageBookingsLocators.VerifyText_Drivers_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_Drivers_BD);
	}
	
	public String getTempText_BD() {
		//return ManageBookingsLocators.VerifyText_Temp_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_Temp_BD);
	}
	
	public String getJobReferenceText_BD() {
		//return ManageBookingsLocators.VerifyText_JobReference_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_JobReference_BD);
	}
	
	public String getDescriptionText_BD() {
		//return ManageBookingsLocators.VerifyText_Description_BD.getText();
		return WebTestActions.getObjectText(ManageBookingsLocators.VerifyText_Description_BD);
	}
	
	public boolean validateBookingRecordsDataInBookingDetails(int rowNuber) {
		
		boolean Verify_Booking = false;
		
		try {
			
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getAccountText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getFromText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getToText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getWayBillNoText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getBookingDateText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getUnitTypeText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getUnitIDText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getUnitLengthText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getPlugInText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getDriversText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getTempText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getJobReferenceText_BD());
			validateText(testdata.getTestData(rowNuber,"ACCOUNT"),getDescriptionText_BD());
		
		}catch(Exception e) {
    		e.printStackTrace();
    	}
		
		return Verify_Booking;
	}*/
}
