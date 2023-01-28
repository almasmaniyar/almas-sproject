package demoPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchFirefoxDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();//Browser specific 
		WebDriver driver=new FirefoxDriver();
		driver.close();
	}

}
