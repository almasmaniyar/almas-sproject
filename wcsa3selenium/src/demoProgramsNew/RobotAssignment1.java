package demoProgramsNew;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAssignment1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[.='Band']")).click();
		WebElement clickHold = driver.findElement(By.xpath("//div[@class='Filter by']"));
		for(int i=0; i<2 ;i++)
		{
			act.clickAndHold(clickHold);
		}
		act.doubleClick();
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		WebElement searchBox = driver.findElement(By.xpath("search_query_top_elastic_search"));
		searchBox.click();
		
		
		
	}

}
