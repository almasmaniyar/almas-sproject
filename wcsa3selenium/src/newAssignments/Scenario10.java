package newAssignments;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
	
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
	
		WebElement ch = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(ch);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
	
		driver.manage().window().maximize();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("Almas");
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("almas042001@gmail.com");

	driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9380179821");
	driver.findElement(By.xpath("//a[@class='fc-button']")).click();
	}
}
