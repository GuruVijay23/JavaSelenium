package stepdef;

import org.openqa.selenium.WebDriver;

import basepack.BaseClass;
import cucumber.api.java.en.*;

public class Steps extends BaseClass {
	WebDriver driver;
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		launchBrowser();
	    
	}

	@When("choose {string}")
	public void choose(String string) {
		selectCountry(string);
	}

	@Then("print")
	public void print() {
	}
	

}
