package pageObject;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static PageGeneratorManager getPageGenerator() {
		return new PageGeneratorManager();
	}
	
	//Dùng Static để gọi trực tiếp bằng Class.tên hàm
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static CommonPageObject getCommonPage(WebDriver driver) {
		return new CommonPageObject(driver);
	}
}
