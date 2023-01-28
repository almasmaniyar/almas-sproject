package popupsHandling;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	//popup is generated
	driver.findElement(By.xpath("//button[.='✕']")).click();;
	/*Thread.sleep(3000);
	//control is switch to alert popoup
	Alert al = driver.switchTo().alert();
	//we get the text of the alert popoup
	String textOfPopup = al.getText();
	//display the text
	System.out.println(textOfPopup);
	//hit the ok button
	al.dismiss();//al.accept();
	
	//genretes the NoAlertPresentException because the Alert is already handled.
	al.accept();*/
	
}
}
