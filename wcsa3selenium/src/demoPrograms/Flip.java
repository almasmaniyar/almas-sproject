package demoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(12000);
		driver.findElement(By.name("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("hp laptop");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(5000);
	}

}
