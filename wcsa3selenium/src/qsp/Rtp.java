package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    WebDriver driver;
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the name of the broswer");
			String browserValue=sc.nextLine();
			System.out.println(browserValue);
			
			if(browserValue.equalsIgnoreCase("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				Thread.sleep(4000);
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println("Chrome is launched");
			}
			else if(browserValue.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			    driver=new FirefoxDriver();
				Thread.sleep(4000);
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				System.out.println("Chrome is launched");
				
			}
			else
			{
				System.out.println("enter valid browser");
			}
	}
	

}
