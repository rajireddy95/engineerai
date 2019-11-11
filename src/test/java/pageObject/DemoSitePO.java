package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoSitePO{
	public DemoSitePO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "div.showmebutton")
	public static WebElement takeTour;
	
	@FindBy(how = How.CSS, using = "div.letsskip")
	public static WebElement skipTour;
	
	@FindBy(how = How.CSS, using = "div.currencySelBox")
	public static WebElement currencyBox;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'US Dollars')]")
	public static WebElement selectUSD;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign In')]")
	public static WebElement signIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div[5]/ul/li/button/div/ol/li[2]/div[2]/strong")
	public static WebElement register;
	
	@FindBy(how = How.CSS, using = "input[name='signup_email']")
	public static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next ')]")
	public static WebElement next;
	
	@FindBy(how = How.CSS, using = "input[name='firstlastname']")
	public static WebElement name;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Mobile Number']")
	public static WebElement mobile;
	
	@FindBy(how = How.CSS, using = "input[name='signup_password']")
	public static WebElement passWd;
}