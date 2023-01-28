package demoProgramsNew;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/almas/Desktop/html/multiselectdropdown.html");
		WebElement s = driver.findElement(By.name("menu"));
		Select sel=new Select(s);
		
		for(int i=2; i<6; i++) {
			sel.selectByIndex(i);
		}
		WebElement opt = sel.getFirstSelectedOption();
		String value = opt.getText();
		System.out.println(value);
		
		/*String opt=sel.getFirstSelectedOption().getTagName();
		System.out.println(opt);*/


	}

}
