package demoPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChromeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();//Browser specific 
		WebDriver driver=new ChromeDriver();
		driver.close();
	}

}
