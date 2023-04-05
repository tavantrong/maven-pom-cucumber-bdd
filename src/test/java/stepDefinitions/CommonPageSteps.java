package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.CommonPageObject;
import pageObject.PageGeneratorManager;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	DataHelper dataTest;
	String email;

	
	public CommonPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPage(driver);
		dataTest = DataHelper.getData();
		email = dataTest.getEmail();
	}
	
	@Given("^Click to \"([^\"]*)\" link$")
	public void clickToLink(String pageName) {
	    commonPage.clickToDynamicLink(driver, pageName);
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldName, String inputValue) {
		if (fieldName.equals("E-mail")) {
			inputValue = email;
		}
	    commonPage.inputToDynamicTextbox(driver, fieldName, inputValue);
	}

	@When("^Click to \"([^\"]*)\" radio button$")
	public void clickToRadioButton(String radioButtonValue) {
	    commonPage.clickToDynamicRadioButton(driver, radioButtonValue);
	}

	@When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
	public void inputToTextareaWithValue(String fieldName, String inputValue) {
	    commonPage.inputToDynamicTextArea(driver, fieldName, inputValue);
	}


	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonValue) {
	    commonPage.clickToDynamicButton(driver, buttonValue);
	}

	@Then("^Heading text displayed with \"([^\"]*)\"$")
	public void headingTextDisplayedWith(String expectedMessage) {
	    Assert.assertTrue(commonPage.isDynamicMessageDisplayed(driver, expectedMessage));
	}

	@Then("^The value \"([^\"]*)\" displayed at row name \"([^\"]*)\"$")
	public void theValueDisplayedAtRowName(String expectedValue, String rowName) {
		if (rowName.equals("Email")) {
			expectedValue = email;
		}
	    Assert.assertEquals(commonPage.getDynamicValueByRowName(driver, rowName), expectedValue);
	}

}
