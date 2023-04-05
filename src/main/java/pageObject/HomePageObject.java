package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage{
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		//pageGenerator = PageGeneratorManager.getPageGenerator();
	}

	public boolean isWelcomMessageDisplayed() {
		waitForElementVisible(driver, HomePageUI.WELCOME_MSG_TEXT);
		return isElementDisplayed(driver, HomePageUI.WELCOME_MSG_TEXT);
	}
	



}
