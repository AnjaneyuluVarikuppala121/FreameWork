package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadphonePage {
	
	//Declaration 
		@FindBy(xpath = "//span[text()='boat rockerz 450']/ancestor::div[@class='featuredProducts_cardFooter__qL8vT']/descendant::button")
		private WebElement addToCartbutton;
		
		@FindBy(xpath = "//span[text()='boat rockerz 450']")
		private WebElement itemName;
		
		@FindBy(xpath = "//*[name()='svg'][@id='cartIcon']")
		private WebElement cartIcan;
		
		//Initialization
		public HeadphonePage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		
		public void clickAddToCart() {
			addToCartbutton.click();
		}
		
		public String getAddToCartText() {
			return addToCartbutton.getText();
		}
		
		public void clickCartIcon() {
			
			cartIcan.click();
		}
		public String getCartIcon() {
			return cartIcan.getText();
		
	}

}
