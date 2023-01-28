package demoPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/almas/Desktop/html/singleselectdropdown.html");
        WebElement dd = driver.findElement(By.id("menu"));

		Select se=new Select(dd);
		se.selectByIndex(3);
		se.deselectByValue("i4");
		/*Thread.sleep(2000);
		se.deselectByIndex(4);
		Thread.sleep(2000);
		se.deselectByVisibleText("kanda bhaji");*/
		
		
	
	}

}
