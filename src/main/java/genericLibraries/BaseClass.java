package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.AddAddress;
import pomPages.AddCart;
import pomPages.HeadphonePage;
import pomPages.HomePage;
import pomPages.MyAddressPage1;
import pomPages.MyProfile;
import pomPages.ShoppersStackLogin;
import pomPages.SignupPage;
import pomPages.WelcomePage;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDrivverUtility webutil;
	
   public static WebDriver sdriver;
   public static WebDriver driver;

	protected WelcomePage welcome;
	protected ShoppersStackLogin login;
	protected HomePage home;
	protected SignupPage signUp;
	protected MyProfile myProfile;
	protected MyAddressPage1 myAddress;
	protected HeadphonePage headphone;
	protected AddCart cart;
	protected AddAddress address;

	//@BeforeSuite
	//@BeforeTest

	@BeforeClass
	public void classConfiguration() {
		property = new PropertiesUtility();
		excel =new ExcelUtility();
		jutil = new JavaUtility();
		webutil = new WebDrivverUtility();
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.exceInit(IConstantPath.EXCEL_PATH);
	}


	@BeforeMethod

	public void menthodConfiguration() {

		driver=webutil.navigateToApp(property.getData("browser"),property.getData("url"),Long.parseLong(property.getData("time")));
		sdriver=driver;
		welcome = new WelcomePage(driver);
		login = new ShoppersStackLogin(driver);
		home = new HomePage(driver);
		signUp = new SignupPage(driver);
		myProfile = new MyProfile(driver);
		myAddress =new MyAddressPage1 (driver);
		headphone =new HeadphonePage(driver);
		cart =new AddCart(driver);
		address = new AddAddress(driver);
	}
	@AfterMethod

	public void methodTeardown() {

		home.clickProfileButton();
		home.clickLogout();
		webutil.closeAllBrowsers();
	}
	@AfterClass

	public void classTeardown() {

		excel.closeExcel();

	}

	//@AfterTest

	//@AfterSuite

}


