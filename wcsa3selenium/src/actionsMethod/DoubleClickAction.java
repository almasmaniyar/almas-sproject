package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//to access the methods of action class we have to create a object of action class
     Actions act=new Actions(driver);
    // WebElement ct = driver.findElement(By.partialLinkText("Gmail"));
    // act.contextClick(ct).perform();
     WebElement ct1 = driver.findElement(By.name("btnK"));
     act.doubleClick(ct1).perform();
 
}
}
