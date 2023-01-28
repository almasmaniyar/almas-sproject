package popupsHandling;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopupHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");

	//maximize the browser without calling the manage method
	co.addArguments("-start-maximized");

			WebDriver driver = new ChromeDriver(co);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://stackoverflow.com/questions/38684175/how-to-click-allow-on-show-notifications-popup-using-selenium-webdriver");
        
	
}
}
