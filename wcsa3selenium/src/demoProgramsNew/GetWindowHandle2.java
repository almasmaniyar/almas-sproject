package demoProgramsNew;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		// How to close child browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();

		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String wh:allHandles)
		{
			
				String currentUrl = driver.switchTo().window(wh).getTitle();
				System.out.println(currentUrl);
				if(!parentHandle.equals(currentUrl)) {
					driver.manage().window().maximize();
				
			}
			else
			{
				driver.quit();
			}

		}
	}

}
