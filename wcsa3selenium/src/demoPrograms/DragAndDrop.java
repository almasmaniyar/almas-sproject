package demoPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://jqueryui.com/droppable/");
	
	Actions act=new Actions(driver);
	WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	//driver.switchTo().frame(w);
	driver.switchTo().frame(w);
	//driver.switchTo().frame("iframeResult");
	act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='draggable']"))).build().perform();
}
}