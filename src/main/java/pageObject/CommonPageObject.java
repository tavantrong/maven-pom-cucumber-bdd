package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.CommonPageUI;

public class CommonPageObject extends BasePage{
	WebDriver driver;

	public CommonPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}
	
	public void inputToDynamicTextbox(WebDriver driver, String fieldName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, fieldName);
		if (fieldName.equals("Date of Birth")) {
			removeAttributeInDOM(driver, CommonPageUI.DYNAMIC_TEXTBOX, "type", fieldName);
			sleepInsecond(1);
		}
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, inputValue, fieldName);
	}
	
	public void inputToDynamicTextArea(WebDriver driver, String fieldName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA, fieldName);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA, inputValue, fieldName);
	}
	
	public void clickToDynamicRadioButton(WebDriver driver, String radioButtonValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
	}
	
	public void clickToDynamicButton(WebDriver driver, String buttonValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON, buttonValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON, buttonValue);
	}
	
	public void clickToDynamicLink(WebDriver driver, String linkPageName) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_LINK, linkPageName);
		clickToElement(driver, CommonPageUI.DYNAMIC_LINK, linkPageName);
	}
	
	public boolean isDynamicMessageDisplayed(WebDriver driver, String messageText) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, messageText);
		return isElementDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE, messageText);
	}
	
	public String getDynamicValueByRowName(WebDriver driver, String rowName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_VALUE_BY_COLUMN_NAME, rowName);
		return getTextElement(driver, CommonPageUI.DYNAMIC_VALUE_BY_COLUMN_NAME, rowName);
	}
	
}
