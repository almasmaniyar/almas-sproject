package demoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/almas/Desktop/html/singleselectdropdown.html");
		
		WebElement sDropDown = driver.findElement(By.xpath("//select[.='login']"));
		Select sel=new Select(sDropDown);
		sel.selectByValue("v4");
		
				}

}
