package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage1 {

	//Declaration
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	@FindBy(xpath = "//div[text()='successfully added']")
	private WebElement successMessage;
	
	//Initialization
	
	public MyAddressPage1(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	}

	public void clickAddAddress() {
		addAddressButton.click();
	}
	
	public String getSuccessMessage() {
		return successMessage.getText();
	}
	

}
