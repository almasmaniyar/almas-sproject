package demoProgramsNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/almas/Desktop/html/multiselectdropdown.html");
		WebElement s = driver.findElement(By.name("menu"));
		Select sel=new Select(s);
		sel.selectByValue("i4");
		Thread.sleep(2000);
		sel.deselectByValue("i4");
	}
}
