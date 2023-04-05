package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Given("^Open Facebook application$")
	public void openFacebookApplication(){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Then("^Verify email textbox displayed$")
	public void verifyEmailTextboxDisplayed(){
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
	}

	@Then("^Verify password textbox displayed$")
	public void verifyPasswordTextboxDisplayed(){
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
	}
	
	@Then("^Close application$")
	public void closeApplication(){
		driver.quit();
	}
	
	@Then("^Input FB email textbox displayed$")
	public void inputEmailTextboxDisplayed(){
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
	}
	

	@Then("^Input FB password textbox displayed$")
	public void inputPasswordTextboxDisplayed(){
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
	}
	
	@Then("^Click to FB Submit button$")
	public void clickToSubmitButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Then("^Input FB email textbox with \"([^\"]*)\"$")
	// ([^\"]*)\"$") - Regex (Regular Expression) Biểu thức chính quy do cucumber định nghĩa
	public void inputEmailTextboxWith(String email) {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}

	@Then("^Input FB password textbox with \"([^\"]*)\"$")
	// ([^\"]*)\"$") - Regex (Regular Expression) Biểu thức chính quy do cucumber định nghĩa
	public void inputPasswordTextboxWith(String password) {
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
	
	@Then("^Input email textbox with \"([^\"]*)\" and Password textbox with \"([^\"]*)\"$")
	public void inputEmailTextboxWithAndPasswordTextboxWith(String email, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
	
	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable table) {
	    List<Map<String, String>> account = table.asMaps(String.class, String.class);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(account.get(0).get("Username"));		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(account.get(0).get("Password"));
		
	    driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(account.get(1).get("Username"));		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(account.get(1).get("Password"));
	    
//	    for (Map<String, String> acc : table.asMaps(String.class, String.class)) {
//		    driver.findElement(By.xpath("//input[@id='email']")).clear();
//			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(acc.get("Username"));		
//			driver.findElement(By.xpath("//input[@id='pass']")).clear();
//			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(acc.get("Password"));
//		}
	}
	
}
