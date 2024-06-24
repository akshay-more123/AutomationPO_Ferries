package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.poferries.tourist.web.utilities.ConfigReader;
import com.web.actions.Actions;

public class CreditCancelWaybillAction {
	
	
	 Actions WebTestActions;
		ConfigReader configReader = new ConfigReader();
	 
	 public CreditCancelWaybillAction(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		    PageFactory.initElements(WebTestActions.driver, this);
		}
	 @FindBy(how = How.XPATH, using = "//div[@id='tileArea']//div[@class='eachLine'][text()='Way Bill No: ']/span")
		public WebElement FirstWayBillNo;
		@FindBy(how = How.CLASS_NAME, using = "cancel")
		public WebElement FirstWayBillNumber;
		@FindBy(how = How.XPATH, using = "//div[@id='showTiles']/div[1]//a[@class='cancel'][text()='Cancel']")
		public WebElement FirstWayBillCancel;
		@FindBy(how = How.XPATH, using = "//div[@id='cancelPopUpBox']/div[1]//div[@class='btnColOne']//button[@class='btn-primary'][text()='Yes']")
		public WebElement WayBillCancelYesButton;
		//*[@id=""]/form/div[1]/div[1]/h2
		@FindBy(how = How.XPATH, using = "//div[@id='panelCancel']/form/div[1]//div[@class='txt']/h2")
		public WebElement WayBillpanelCancel;
		
		@FindBy(how = How.CLASS_NAME, using = "valData")
		public WebElement CancelStatus;
		
		@FindBy(how = How.ID, using = "QuickSearchInput")
		public WebElement QuickSearch;
		
		
		public void ClickCancelbutton() throws InterruptedException {
			//CancelgetWayBillNo();
			WebTestActions.waitForElementToBeVisibile(FirstWayBillNumber);
			WebTestActions.clickElement(FirstWayBillNumber); 
			Thread.sleep(1500);
			
		}
		
		public void ClickFirstWaybillNo() throws InterruptedException {
			//CancelgetWayBillNo();
			WebTestActions.waitForElementToBeVisibile(FirstWayBillNo);
			WebTestActions.clickElement(FirstWayBillNo); 
			Thread.sleep(1500);
			
		}

		public void QuickSearch(String searchText) {
			WebTestActions.writeText(searchText.trim(), QuickSearch);
			WebTestActions.Enter(QuickSearch);
		}
		
		
	public CreditCancelWaybillAction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
