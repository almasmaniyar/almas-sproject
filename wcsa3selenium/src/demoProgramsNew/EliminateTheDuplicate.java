package demoProgramsNew;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateTheDuplicate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/almas/Desktop/html/multiselectdropdown.html");
		WebElement s = driver.findElement(By.id("menu"));
		Select sel = new Select(s);
		//to get the options of dropdown
		List<WebElement> allOptions = sel.getOptions();
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<allOptions.size(); i++) {
			WebElement opt = allOptions.get(i);
			String values = opt.getText();
			//to add the text of webelement by removing duplicates and insertion order won't be maintained  
			hs.add(values);
		}
		for(String options:hs)
		{
			System.out.println(options);
		}
	}


}
