package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeExmple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("http://laptop-kdq8gi2c/login.do");
		String actualLoginTitle = driver.getTitle();
		if(actualLoginTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login Page title matched! test case Pass!");
			
		}
		else
		{
			System.out.println("Login page title not matched ! test case fail");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home Page title matched! test case Pass!");
			
		}
		else
		{
			System.out.println("Home page title not matched ! test case fail");
		}
	}

}
