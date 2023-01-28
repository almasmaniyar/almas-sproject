package pOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleRefrence {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-kdq8gi2c/login.do");

		WebElement usn = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));

		usn.sendKeys("admin");//the address of webelement getting change all the time
		System.out.println(usn);
		driver.navigate().refresh();
		usn.sendKeys("admin");
		System.out.println(usn);		

	}

}
