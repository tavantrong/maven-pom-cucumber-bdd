package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.LoginPageObject;
import pageObject.PageGeneratorManager;
import pageObject.RegisterPageObject;

public class LoginPageSteps {
	WebDriver driver;
	static String loginPageUrl;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	
	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		loginPage = PageGeneratorManager.getLoginPage(driver);
	}
	
	@Given("^Get Login page Url$")
    public void getLoginPageUrl() {
		loginPageUrl = loginPage.getLoginPageUrl();
    }

    @When("^Open Register page by click here linktext$")
    public void openRegisterPageByClickHereLinktext() {
    	registerPage = loginPage.ClickToHereLink();
    }
    
    @And("^Submit valid infor UserID and Pass to Login form$")
    public void submitValidInforUserIDAndPassToLoginForm() {
    	loginPage.inputTextToUserIDTextboxAtLoginForm(RegisterPageSteps.username);
        loginPage.inputTextToPasswordTextboxAtLoginForm(RegisterPageSteps.password);
        loginPage.clickToLoginButtonAtLoginForm();
    }
	
}
