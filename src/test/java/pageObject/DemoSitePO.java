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
}