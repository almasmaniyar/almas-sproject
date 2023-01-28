package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void sumo1() {
	  Reporter.log("this is sumo2 method", true);
  }
  @Test
  public void sumo2() {
	  Reporter.log("this is sumo2 method", true);
  }
  @Test
  public void sumo3() {
	  Reporter.log("this is sumo3 method", true);
  }
}
