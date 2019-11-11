package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Hooks;
import pageObject.DemoSitePO;

public class DemoSiteStepDefs {
	public WebDriver driver;

	public DemoSiteStepDefs() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, DemoSitePO.class);
	}

	@Given("^the user lands on engineer ai staging page$")
	public void the_user_lands_on_engineer_ai_staging_page() throws Throwable {
		driver.navigate().to("https://staging.engineer.ai/");
		Thread.sleep(4000);
	}

	@Given("^clicks on the skip tour button$")
	public void clicks_on_the_skip_tour_button() throws Throwable {
		DemoSitePO.takeTour.click();
		Thread.sleep(2000);
		DemoSitePO.skipTour.click();
	}

	@Given("^selects the currency as USD$")
	public void selects_the_currency_as_USD() throws Throwable {

	}

	@When("^the user clicks on sign in and register$")
	public void the_user_clicks_on_sign_in_and_register() throws Throwable {

	}

	@When("^fills in the user details$")
	public void fills_in_the_user_details() throws Throwable {

	}

	@Then("^the user is successfully registered with the website$")
	public void the_user_is_successfully_registered_with_the_website() throws Throwable {
		;
	}

}