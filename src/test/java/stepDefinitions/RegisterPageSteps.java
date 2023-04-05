package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.PageGeneratorManager;
import pageObject.RegisterPageObject;

public class RegisterPageSteps {
	WebDriver driver;
	static String username, password;
	RegisterPageObject registerPage;
	DataHelper dataTest;
	
	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		dataTest = DataHelper.getData();
	}
	
	@And("^Skip Ads whether or not displays$")
    public void skipAdsWhetherDisplays() {
        registerPage.skipAdsIfPossible();
    }
	
	@When("^Input to Email textbox$")
	public void inputToEmailTextbox() {
		registerPage.inputToEmailTextboxToRegisterForm(dataTest.getEmail());
	}

	@When("^Back to Login page$")
	public void backToLoginPage() {
		registerPage.openLoginPage(LoginPageSteps.loginPageUrl);
	}

	@Then("^Get User and Password infor$")
	public void getUserAndPasswordInfor() {
		username = registerPage.getUserIDText();
		password = registerPage.getPasswordText();
	}

	@And("^Click to Submit button$")
	public void clickToSubmitButton() {
		registerPage.clickToSubmitButtonToRegisterForm();
	}


}
