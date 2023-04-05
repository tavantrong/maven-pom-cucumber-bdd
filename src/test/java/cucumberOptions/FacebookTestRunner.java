package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features  - Chạy file trong package features
		features = "src/test/java/features", 
		// glue - Tìm kiếm code mapping qua từ file bên features
		// glue - Ngang hàng nên ko cần truyền kiểu src/test/java/stepDefinitions
		glue = "stepDefinitions", 
		// strict = true, - Báo lỗi ngay cái step mà nó chưa được định nghĩa/ xác định (underfined)
		//dryRun = true, // Failed ngay lập tức nếu 1 step bất kì chưa được underfined - suggest code
		// monochrome - hiển thị output dễ đọc hơn
		monochrome = true, 
		// plugin - Show ra report và đường dẫn
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/Facebookcucumber.json" },
		// Show ra code dang camelCase hoặc under_word
		snippets = SnippetType.CAMELCASE, 
		// tags - Set chạy theo tags được set trong file feature
		tags = { "@parameter" })

public class FacebookTestRunner {

}
