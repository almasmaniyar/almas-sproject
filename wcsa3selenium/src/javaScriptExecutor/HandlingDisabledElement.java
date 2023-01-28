package javaScriptExecutor;

import java.time.Duration;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("file:///C:/Users/almas/Desktop/html/UsernameDisable.html");
	Thread.sleep(4000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('n2').value='admin'");
	
	
	
	
}
}
