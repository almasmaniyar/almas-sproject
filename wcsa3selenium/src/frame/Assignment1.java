package frame;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("nothing phone");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("(//div[text()='Nothing Phone (1) (White, 256 GB)']) [1]")).click();
	Thread.sleep(2000);
	String parentHandle = driver.getWindowHandle();
	driver.findElement(By.xpath("(//div[text()='Nothing Phone (1) (White, 256 GB)'])[1]")).click();
	Set<String> bothHandles = driver.getWindowHandles();
    for(String handle:bothHandles)
    {
    	if(!parentHandle.equals(handle))
    	{
    driver.switchTo().window(handle);
    	}
    	/*else
    	{
    		
    }*/
    
    Thread.sleep(2000);
    driver.findElement(By.xpath(""));
    }
    
}
}

