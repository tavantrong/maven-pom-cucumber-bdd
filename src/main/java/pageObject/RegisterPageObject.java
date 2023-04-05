package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends BasePage{
	WebDriver driver;
	
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
}
	
	public void skipAdsIfPossible() {
		WebElement frame1 = driver
				.findElement(By.xpath("//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']"));
		if (driver
				.findElements(By.xpath("//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")).size() >=1) {
			driver.switchTo().frame(frame1);
			clickToElement(driver,RegisterPageUI.ADS_CLOSE_BUTTON);
			driver.switchTo().defaultContent();
		}

	}
	
	public void inputToEmailTextboxToRegisterForm(String emailAddress) {
		waitForElementVisible(driver, RegisterPageUI.EMAILID_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAILID_TEXTBOX, emailAddress);
	}
	
	public void clickToSubmitButtonToRegisterForm() {
		waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}
	
	public String getUserIDText() {
		waitForElementVisible(driver, RegisterPageUI.USER_ID_TEXT);
		return getTextElement(driver, RegisterPageUI.USER_ID_TEXT);
	}
	
	public String getPasswordText() {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
		return getTextElement(driver, RegisterPageUI.PASSWORD_TEXT);
	}
	
	public LoginPageObject ClickBackToLoginLink() {
		waitForElementClickable(driver, RegisterPageUI.HOME_LINK);
		clickToElement(driver, RegisterPageUI.HOME_LINK);
		return PageGeneratorManager.getLoginPage(driver);
	}

	public void openLoginPage(String pageName) {
		driver.get(pageName);
		
	}




}