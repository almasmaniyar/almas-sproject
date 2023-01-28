package demoProgramsNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNewFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		//WebElement s = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();

		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("almas");

	}

}
