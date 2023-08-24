package pomPages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.JavaUtility;
import genericLibraries.WebDrivverUtility;

public class AddAddress 
{
	
	//Declaration

	@FindBy (id="Name")
	private WebElement nameTF; 
	
	@FindBy (id="House/Office Info")
	private WebElement houseInfoTE;

	@FindBy (id="Street Info") 
	private WebElement streetInfoTF;

	@FindBy (id="Landmark") 
	private WebElement landmarkTF;

	@FindBy (id="Country") 
	private WebElement countryDropdown;

	@FindBy (id="state")
	private WebElement stateDropdown; 
	
	@FindBy (id="city")
	private WebElement cityDropdown; 
	
	@FindBy (id="Pincode")
	private WebElement pincodeTF;

	@FindBy (id="Phone Number")
    private WebElement phoneNumberTF; 
	
	@FindBy (xpath = "//button [text()='Add Address']")
    private WebElement addAddressButton;

	//Initialization

	public AddAddress(WebDriver driver) 
	{
	    PageFactory.initElements(driver, this);
	}

	//Utilization

	public AddAddress(WebDrivverUtility web, Map<String,String> details)
	{
	nameTF.sendKeys (details.get("Name"));
	houseInfoTE.sendKeys (details.get("House/office Info")); 
	streetInfoTF.sendKeys (details.get("street Info"));
	landmarkTF.sendKeys (details.get("LandMark"));

	web.selectFromDropdown(details.get("Country"),countryDropdown);
	web.selectFromDropdown(details.get("State"), stateDropdown); 
	web.selectFromDropdown(details.get("City"), cityDropdown);
	
	pincodeTF.sendKeys(details.get("Pincode"));
	phoneNumberTF.sendKeys(details.get("Phone Number"));
	addAddressButton.click();
	}

	public void addAddressDetails(WebDrivverUtility webutil, Map<String, String> map, JavaUtility jutil) {
		addAddressButton.click();
		
	}

}

