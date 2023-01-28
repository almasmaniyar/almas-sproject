package newAssignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario2{
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
		//driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("almas123");
		driver.findElement(By.xpath("//button[.='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("almas042001@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Test Mail");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("My new Assignment is ready. ");
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	}

}
