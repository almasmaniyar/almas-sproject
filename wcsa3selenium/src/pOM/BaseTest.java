package pOM;

import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import pOM.Flib;

public class BaseTest implements IAutoConstant{
	static WebDriver driver;
	void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue=flib.readPropertyData(PROPERTY1_PATH,"keyValue");
		String url=flib.readPropertyData(PROPERTY1_PATH, "url");
		if(browserValue.equals("chrome"))
		{
			
		System.setProperty(CHROME1_KEY, CHROME1_VALUE);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty(GECKO1_KEY, GECKO1_VALUE);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		
		else {
			System.out.println("Enter a valid browser");
		}
		driver.quit();
	}

}
