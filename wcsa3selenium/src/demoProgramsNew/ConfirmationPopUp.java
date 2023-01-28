package demoProgramsNew;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/almas/Desktop/html/confermation.html");
		driver.findElement(By.xpath("//button[.='Click Me! ']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//to accept the popups
		//al.accept();
		//al.dismiss();
		String s = al.getText();
		System.out.println(s);
		al.accept();
	}

}
