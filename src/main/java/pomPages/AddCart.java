package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	
	//Declaration
	
	@FindBy(xpath = "//div[@class='cart_productDetails__pKWBd']/h3")
	private WebElement cartIteam;
	
	//Initialization 
	
	public AddCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public String getCartItem() {
		return cartIteam.getText();
	}

}
