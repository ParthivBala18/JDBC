package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchFeatureStepDefinition {
	WebDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}
	@Given("user should be on google page")
	public void user_should_be_on_google_page() {
		driver.get("https://www.google.com");
	}
	@When("user entered {string} in search box")
	public void user_entered_in_search_box(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("hello");
	}
	@When("click on submit button")
	public void click_on_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		//   throw new io.cucumber.java.PendingException();
		System.out.println("heello");
	}
	@Then("Multiple link should be displayed on {string}")
	public void multiple_link_should_be_displayed_on(String string) {
		// Write code here that turns the phrase above into concrete actions
		//   throw new io.cucumber.java.PendingException();
		System.out.println("hello");
	}


}
