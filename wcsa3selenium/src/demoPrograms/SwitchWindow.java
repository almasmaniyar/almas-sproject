package demoPrograms;
import java.time.Duration;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchWindow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.irctc.co.in/nget/train-searchhttps://www.irctc.co.in/nget/train-search");
	//driver.findElement(By.xpath(""));
	driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
	
	Set<String> handles = driver.getWindowHandles();
	 Iterator<String> it = handles.iterator();
	String parentid = (String) it.next();
	String childid=(String) it.next();
	driver.switchTo().window(childid);
	
	driver.findElement(By.xpath("//div[@class='Nav-icons BusTickets']")).click();
	
}
}
