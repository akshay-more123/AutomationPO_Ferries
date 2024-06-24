package com.poferries.tourist.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.web.actions.Actions;

public class VehicleDetailsPageActions {
	
	@FindBy(how = How.ID, using = "vehicleNumber")
	public WebElement vehicleRegEdit;

	@FindBy(how = How.ID, using = "vehicleNumber-error")
	public WebElement vehicleRegError;

	@FindBy(how = How.ID, using = "vehicleLength")
	public WebElement vehicleLengthEdit;

	@FindBy(how = How.ID, using = "vehicleWidth")
	public WebElement vehicleWidthChk;

	@FindBy(how = How.ID, using = "vehicleOverWeight")
	public WebElement vehicleWeightChk;

	@FindBy(how = How.ID, using = "StepTwoContinue")
	public WebElement vehicleRegContinue;

	@FindBy(how = How.ID, using = "vehicleHeight")
	public WebElement vehicleHeight;

	@FindBy(how = How.XPATH, using = "//*[@id=\"vehicleWidthCheckBoxTxt\"]")
	public WebElement vehicleWidthTxt;

	@FindBy(how = How.ID, using = "vehicleOverWeightCheckBoxTxt")
	public WebElement vehicleWeightTxt;

	@FindBy(how = How.ID, using = "StepTwoBack")
	public WebElement vehicleRegBack;

	@FindBy(how = How.LINK_TEXT, using = "Back")
	public WebElement abnormalWidthWeightBack;

	@FindBy(how = How.ID, using = "BookNowFormTwo")
	public WebElement vehicleDetailsForm;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/span")
	public WebElement vehicleWidthMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/span")
	public WebElement vehicleWeightMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[1]/span")
	public WebElement vehicleWidthPort;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[1]/span")
	public WebElement vehicleWeightPort;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[2]/span")
	public WebElement vehicleWidthTiming;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[2]/span")
	public WebElement vehicleWeightTiming;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[1]/a")
	public WebElement vehicleWidthTelephoneNo;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[1]/a")
	public WebElement vehicleWeightTelephoneNo;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[2]/a")
	public WebElement vehicleWidthEmail;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[2]/a")
	public WebElement vehicleWeightEmail;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/span")
	public WebElement vehicleLengthMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[1]/span")
	public WebElement vehicleLengthPort;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[2]/span")
	public WebElement vehicleLengthTiming;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[1]/a")
	public WebElement vehicleLengthTelephoneNo;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div/div[3]/p[2]/a")
	public WebElement vehicleLengthEmail;

	@FindBy(how = How.ID, using = "vehicleLengthBackBtn")
	public WebElement vehicleLengthBack;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[2]/span")
	public WebElement retVehicleLengthMessage;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[1]/div[1]/span")
	public WebElement retVehicleLengthPort1;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[2]/div[1]/span")
	public WebElement retVehicleLengthPort2;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[1]/div[2]/span")
	public WebElement retVehicleLengthTiming1;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[2]/div[2]/span")
	public WebElement retVehicleLengthTiming2;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[1]/p[1]/a")
	public WebElement retVehicleLengthTelephoneNo1;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[2]/p[1]/a")
	public WebElement retVehicleLengthTelephoneNo2;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[1]/p[2]/a")
	public WebElement retVehicleLengthEmail1;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div/div/div/div/div[3]/div[2]/p[2]/a")
	public WebElement retVehicleLengthEmail2;
	
	//***********************************************************

	Actions WebTestActions;
	//private static final Logger logger = LogManager.getLogger(SignUpPageActions.class.getName());

	// Constructor initialising the page factory elements
	public VehicleDetailsPageActions(Actions WebTestActions) {
		this.WebTestActions = WebTestActions;
		PageFactory.initElements(WebTestActions.driver, this);
	}

	// The below method enters the vehicle Reg in the vehicle Reg edit
	public void enterVehicleReg(String vehicleReg) throws InterruptedException {
		/*vehicleRegEdit.sendKeys(vehicleReg);
		Thread.sleep(1000);*/
		WebTestActions.writeText(vehicleReg, vehicleRegEdit);
	}

	// The below method returns the vehicle Reg error message
	public String getVehicleRegErrorMessage() {
		//return vehicleRegError.getText();
		return WebTestActions.getObjectText(vehicleRegError);
	}

	// the below method enters the vehicle length in the vehicle length edit
	public void enterVehicleLength(String vehicleLength) {
		//vehicleLengthEdit.sendKeys(vehicleLength);
		WebTestActions.writeText(vehicleLength, vehicleLengthEdit);

	}

	// the below method is used to select the vehicle height
	public void selectVehicleHeight(String vehicleHeighttxt) {
		/*Select heightSelect = new Select(vehicleHeight);
		heightSelect.selectByVisibleText(vehicleHeight);*/
		WebTestActions.SelectByVisibleText(vehicleHeighttxt, vehicleHeight);

	}

	// the below method clicks the vehicle width check box based on what input
	// has been provided
	public void makeVehicleWidthSelection(String yesNo) {

		String currentSelection = WebTestActions.getObjectText(vehicleWidthTxt); //vehicleWidthTxt.getText();
		if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("YES")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("NO")) {
			WebTestActions.clickElement(vehicleWidthTxt); //vehicleWidthTxt.click();
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("NO")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("YES")) {
			WebTestActions.clickElement(vehicleWidthTxt); //vehicleWidthTxt.click();

		}

	}

	// the below method clicks the vehicle width check box based on what input
	// has been provided
	public void makeVehicleWeightSelection(String yesNo) {

		String currentSelection =  WebTestActions.getObjectText(vehicleWeightTxt); //vehicleWeightTxt.getText();
		if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("YES")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("YES") && currentSelection.toUpperCase().equals("NO")) {
			WebTestActions.clickElement(vehicleWeightTxt); //vehicleWeightTxt.click();
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("NO")) {
			// then do nothing
		} else if (yesNo.toUpperCase().equals("NO") && currentSelection.toUpperCase().equals("YES")) {
			WebTestActions.clickElement(vehicleWeightTxt); //vehicleWeightTxt.click();
		}

	}

	// The below method clicks the continue button on form2
	public void clickContinueVehicleReg() {
		//vehicleRegContinue.click();
		WebTestActions.clickElement(vehicleRegContinue);
	}

	// the below method checks if vehicle Reg field is displayed
	public boolean isVehicleRegDisplayed() {
		//return vehicleRegEdit.isDisplayed();
		return WebTestActions.VerifyObjectIsDisplayed(vehicleRegEdit);
	}

	// the below method returns the error message displayed below the vehicle Reg
	// field
	public String getVehicleRegError() {
		//return vehicleRegError.getText();
		return WebTestActions.getObjectText(vehicleRegError);
	}

	// The below method returns the width, weight error message
	public String getAbnormalWidthMessage() {
		//return vehicleWidthMessage.getText();
		return WebTestActions.getObjectText(vehicleWidthMessage);
	}

	// The below method returns the width, weight error message
	public String getAbnormalWeightMessage() {
		//return vehicleWeightMessage.getText();
		return WebTestActions.getObjectText(vehicleWeightMessage);
	}

	// The below method returns the width,weight port
	public String getAbnormalWidthtPort() {
		//return vehicleWidthPort.getText();
		return WebTestActions.getObjectText(vehicleWidthPort);
	}

	// The below method returns the width,weight port
	public String getAbnormalWeightPort() {
		//return vehicleWeightPort.getText();
		return WebTestActions.getObjectText(vehicleWeightPort);
	}

	// The below method returns the width,weight timing
	public String getAbnormalWidthTiming() {
		//return vehicleWidthTiming.getText();
		return WebTestActions.getObjectText(vehicleWidthTiming);
	}

	// The below method returns the width,weight timing
	public String getAbnormalWeightTiming() {
		//return vehicleWeightTiming.getText();
		return WebTestActions.getObjectText(vehicleWeightTiming);
	}

	// The below method returns the width,weight telephone No
	public String getAbnormalWidthTelephoneNo() {
		//return vehicleWidthTelephoneNo.getText();
		return WebTestActions.getObjectText(vehicleWidthTelephoneNo);
	}

	// The below method returns the width,weight telephone No
	public String getAbnormalWeightTelephoneNo() {
		//return vehicleWeightTelephoneNo.getText();
		return WebTestActions.getObjectText(vehicleWeightTelephoneNo);
	}

	// The below method returns the dangerous goods & pets timing
	public String getAbnormalWidthtEmail() {
		//return vehicleWidthEmail.getText();
		return WebTestActions.getObjectText(vehicleWidthEmail);
	}

	// The below method returns the dangerous goods & pets timing
	public String getAbnormalWeightEmail() {
		//return vehicleWeightEmail.getText();
		return WebTestActions.getObjectText(vehicleWeightEmail);
	}

	// The below method clicks back on the dangerous goods, pets error message page
	public void clickBackAbnormalWidthWeight() {
		//abnormalWidthWeightBack.click();
		WebTestActions.clickElement(abnormalWidthWeightBack);
	}

	// The below method returns the length error message
	public String getVehicleLengthErrorMessage() {
		//return vehicleLengthMessage.getText();
		return WebTestActions.getObjectText(vehicleLengthMessage);
	}

	// The below method returns the return length error message
	public String getReturnVehicleLengthErrorMessage() {
		//return retVehicleLengthMessage.getText();
		return WebTestActions.getObjectText(retVehicleLengthMessage);
	}

	// The below method returns the vehicle length port
	public String getVehicleLengthPort() {
		//return vehicleLengthPort.getText();
		return WebTestActions.getObjectText(vehicleLengthPort);
	}

	// The below method returns the vehicle length return depart port
	public String getVehicleLengthDepartPort() {
		//return retVehicleLengthPort1.getText();
		return WebTestActions.getObjectText(retVehicleLengthPort1);
	}

	// The below method returns the vehicle length return depart port
	public String getVehicleLengthReturnPort() {
		//return retVehicleLengthPort2.getText();
		return WebTestActions.getObjectText(retVehicleLengthPort2);
	}

	// The below method returns the vehicle length timing
	public String getVehicleLengthTiming() {
		//return vehicleLengthTiming.getText();
		return WebTestActions.getObjectText(vehicleLengthTiming);
	}

	// The below method returns the vehicle length return depart timing
	public String getVehicleLengthDepartTiming() {
		//return retVehicleLengthTiming1.getText();
		return WebTestActions.getObjectText(retVehicleLengthTiming1);
	}

	// The below method returns the vehicle length timing
	public String getVehicleLengthReturnTiming() {
		//return retVehicleLengthTiming2.getText();
		return WebTestActions.getObjectText(retVehicleLengthTiming2);
	}

	// The below method returns the width,weight telephone No
	public String getVehicleLengthTelephoneNo() {
		//return vehicleLengthTelephoneNo.getText();
		return WebTestActions.getObjectText(vehicleLengthTelephoneNo);
	}

	// The below method returns the telephone No
	public String getVehicleLengthDepartTelephoneNo() {
		//return retVehicleLengthTelephoneNo1.getText();
		return WebTestActions.getObjectText(retVehicleLengthTelephoneNo1);
	}

	// The below method returns the telephone No
	public String getVehicleLengthReturnTelephoneNo() {
		//return retVehicleLengthTelephoneNo2.getText();
		return WebTestActions.getObjectText(retVehicleLengthTelephoneNo2);
	}

	// The below method returns the width,weight telephone No
	public String getVehicleLengthEmail() {
		//return vehicleLengthEmail.getText();
		return WebTestActions.getObjectText(vehicleLengthEmail);
	}

	// The below method returns the width,weight telephone No
	public String getVehicleLengthDepartEmail() {
		//return retVehicleLengthEmail1.getText();
		return WebTestActions.getObjectText(retVehicleLengthEmail1);
	}

	// The below method returns the width,weight telephone No
	public String getVehicleLengthReturnEmail() {
		//return retVehicleLengthEmail2.getText();
		return WebTestActions.getObjectText(retVehicleLengthEmail2);
	}

	// The below method clicks back on the dangerous goods, pets error message page
	public void clickVehicleLengthBack() {
		//vehicleLengthBack.click();
		WebTestActions.clickElement(vehicleLengthBack);
	}

}
