package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObject.HomePageObject;
import pageObject.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;
	
	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
    @Then("^Home page displayed$")
    public void homePageDisplayed() {
       Assert.assertTrue(homePage.isWelcomMessageDisplayed());
    }

}
