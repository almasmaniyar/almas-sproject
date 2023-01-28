package demoPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlinggetOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("file:///C:/Users/almas/Desktop/html/singleselectdropdown.html");
        WebElement dd = driver.findElement(By.id("menu"));

		Select se=new Select(dd);
	List<WebElement> allops = se.getOptions();
		for(WebElement element:allops)
		{
			String dp = element.getText();
		System.out.println(dp);
		}
		
		
		
		
	
	}

}
