package newAssignments;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Diamond'])[1]")).click();
		//driver.findElement(By.xpath("//span[.='Price']"));
		//WebElement s = driver.findElement(By.xpath("//i[@class='icon-ion-chevron-down']"));
		//Select sel=new Select(s);
		//sel.selectByVisibleText("Price Low to High ");
		
	}

}
