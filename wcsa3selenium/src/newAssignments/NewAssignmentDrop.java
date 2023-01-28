package newAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewAssignmentDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/draggable/");
		//driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.xpath("//a[.='Demos']")).click();
		//driver.findElement(By.xpath("(//a[.='Draggable'])[1]")).click();
		Actions act=new Actions(driver);
		WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(w);
		WebElement target= driver.findElement(By.xpath("//html"));
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);

	}
}
