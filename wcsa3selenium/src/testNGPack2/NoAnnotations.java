package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NoAnnotations {
	@BeforeSuite
  @Test
  public void beforeSuite() {
  
	Reporter.log("this is method of test1",true);
	}

 @AfterSuite
 public void afterSuite()
 {
	 
 }
}

