package demoProgramsNew;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/almas/Desktop/html/Alert.html");
		driver.findElement(By.xpath("//button[.='Click Me! ']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//to accept the popups
		al.accept();
		//to dismiss the popoups 
		//al.dismiss();
		//to get the text of popups
		/*String st = al.getText();
	    System.out.println(st);
	    al.accept();*/
	
	}

}
