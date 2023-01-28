package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");// avoid IllegalStateException
	 FirefoxDriver driver = new FirefoxDriver();//Launches Firefox broswer
	Thread.sleep(4000);// stop the o execution for 4 sec
	driver.close();//closes firefox browser
}

}











