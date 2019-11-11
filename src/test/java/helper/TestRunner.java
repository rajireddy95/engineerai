package helper;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
				 plugin = { "pretty","html:target/cucumber-html-report", "json:cucumber.json" }, 
				 tags = {"@demo"}, 
				 monochrome=true, 
				 glue = {"helper","stepdefs"}
)

public class TestRunner {
}

	