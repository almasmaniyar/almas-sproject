package demoProgramsNew;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
	    driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		System.out.println("=========================================");
		Set<String> parentHandles = driver.getWindowHandles();
		System.out.println(parentHandles);
		
	}

}
