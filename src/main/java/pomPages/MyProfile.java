package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {
	
	//Declaration

	@FindBy(xpath =  "//div[text()='My Addresses']")  
	private WebElement myAddressesLink;

	//Initialization

	public MyProfile (WebDriver driver)
	{
		PageFactory.initElements ( driver, this);
	}

	 //Utilization

	public void ClickMyAddress() {
		myAddressesLink.click();
	}
}
