package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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
