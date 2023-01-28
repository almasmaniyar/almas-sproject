package testNGParallelExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
	static WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-kdq8gi2c/login.do");
		}
	
		/*else {
			Reporter.log("Enter the valid browser Value", true);
		}*/
}
	
	/*@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/

