package newAssignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("abcalmas123@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("almas123");
		driver.findElement(By.xpath("//button[.='Next']")).click();
		WebElement p=driver.findElement(By.id(":1v"));
		String s = p.getText();
		System.out.println(s);
		/*//for(WebElemnt e:p) {
		if(p.getText().equals("Primary"))
		{
			String s = p.getText();
			System.out.println(s);
		}
		else
		{
			p.click();
		}*/
		driver.close();
		
		
	
	}

}
