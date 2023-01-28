package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// avoid IllegalStateException
	ChromeDriver driver = new ChromeDriver();//Launches chrome broswer
	Thread.sleep(4000);
	driver.close();//closes chrome browser
}

}
