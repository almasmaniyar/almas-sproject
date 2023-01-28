package demoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/almas/Desktop/html/singleselectdropdown.html");
	Thread.sleep(2000);
	WebElement sDropDown = driver.findElement(By.xpath("//select[@id='menu']"));
	Select sel=new Select(sDropDown);
	sel.selectByIndex(3);
	}

}
