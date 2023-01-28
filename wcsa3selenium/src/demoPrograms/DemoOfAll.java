package demoPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.name("emailOrPhone")).sendKeys("9895969359");
		//driver.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("bcd");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kjhkjsds");
		driver.findElement(By.xpath("//label[@class='lblkeepme']")).click();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	
		String dv = driver.findElement(By.xpath("//b[normalize-space()='Temporary Issue. Please try again later. [#5002]']")).getText();
		System.out.println(dv);
		driver.findElement(By.xpath("//u[normalize-space()='Forgot Password?']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
