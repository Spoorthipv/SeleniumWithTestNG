package SeleniumTestNGFirstExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgTest {
	
	String driverPath ="C:\\\\Users\\\\52368940\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe";
	WebDriver driver=new ChromeDriver();
	
	@Test
	void Navigate() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}

}
