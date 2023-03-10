package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C.html");
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block executed");
			
		}
		else 
		{
			jse.executeScript("");
			System.out.println("else block executed");
		}
		if(password.isEnabled())
		{
			password.sendKeys("manager");
			System.out.println("if block executed");
			
		}
		else 
		{
			jse.executeScript("document.getElementById('i2').value='manager'");
			System.out.println("else block executed");
		}
	}

}
