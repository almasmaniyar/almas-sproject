package keyWordDrivenFramework;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements AutoItConstant{

		static WebDriver driver;
		public void openBrowser() throws IOException
		
		{
			Flib flib = new Flib();
		String browserValue=flib.readPropertyData(PROPERTY_PATH, "browser");
		String url=flib.readPropertyData(PROPERTY_PATH, "url");
		
		if(browserValue.equals("firefox"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else
	        if(browserValue.equals("chrome"))
			{
				System.setProperty(GECKO_KEY, GECKO_VALUE);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
		}
	        else {
	        	System.out.println("enter the valid broswer value!!!");
	        }
		}
		public void closeBrowser()
		{
			driver.quit();
		}
	}


