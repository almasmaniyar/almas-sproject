package demoProgramsNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/almas/Desktop/html/singleselectdropdown.html");
		WebElement s = driver.findElement(By.name("menu"));
		Select sel=new Select(s);
		sel.selectByVisibleText("fish");
	}

}
