package testNGPack2;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	static WebDriver driver;
  @Test
  public void logInMethod() {
	  Reporter.log("login is done!!", true);
  }
  @Test(dependsOnMethods = "logInMethod")
  public void createUser()
  {
	  Reporter.log("User is created!!",true);
  }
  @Test(dependsOnMethods = "createUser")
  public void logOutMethod()
  {
	  Reporter.log("logout done!!", true);
  }
}
