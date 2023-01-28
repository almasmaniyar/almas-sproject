package testNGParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void openBrowser(String browser ,String Url) {
		if(browser.equals("chrome"))
		{
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.switchTo().activeElement().sendKeys("very good");
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("driver.gecko.driver", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		

	}
}
