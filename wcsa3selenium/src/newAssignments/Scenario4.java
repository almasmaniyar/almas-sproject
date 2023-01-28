package newAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple Watches");
		//WebElement aw = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		//Select sel=new Select(aw);
		//sel.deselectByVisibleText("Watches");
		/*if(aw.getText().equals("Watches"))
	{
		aw.click();
	}*/
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		String result = driver.getCurrentUrl();
		System.out.println(result);
		WebElement s = driver.findElement(By.xpath(""));
		Select sel=new Select(s);
		sel.selectByIndex(0);
	}

}
