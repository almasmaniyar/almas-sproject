package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTime {

	static WebDriver driver;
	@Test()
	public void actitime() {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-kdq8gi2c/login.do");
		Reporter.log("class3 method ",true);
	}
}
