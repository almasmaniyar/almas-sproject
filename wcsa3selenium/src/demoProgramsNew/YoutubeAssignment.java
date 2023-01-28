package demoProgramsNew;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/");
		//driver.switchTo().frame(title);
		//driver.findElement(By.xpath("")).click();
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[@id='video-title']"));
		
		
		for(WebElement suggest:suggestions)
		{
	      String option = suggest.getText();
	      Thread.sleep(2000);
	      System.out.println(option);
		}
		List<WebElement> views = driver.findElements(By.xpath("//div[@class='style-scope ytd-rich-shelf-renderer']/descendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		
		for(WebElement opt:views)
		{
			String opt1 = opt.getText();
			Thread.sleep(2000);
			System.out.println(opt1);
		}
	}

}
