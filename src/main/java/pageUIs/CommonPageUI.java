package pageUIs;

public class CommonPageUI {
	
	public static final String DYNAMIC_TEXTBOX = "//td[text()='%s']/following-sibling::td/input";
	public static final String DYNAMIC_TEXTAREA = "//td[text()='%s']/following-sibling::td/textarea";
	public static final String DYNAMIC_RADIO_BUTTON = "//input[@type='radio' and @value='%s']";
	public static final String DYNAMIC_LINK = "//a[text()='%s']";
	public static final String DYNAMIC_BUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_MESSAGE = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_VALUE_BY_COLUMN_NAME = "//td[contains(text(),'%s')]/following-sibling::td";
}
