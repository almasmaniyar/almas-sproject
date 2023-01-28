package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void remo1() {
	  Reporter.log("this is remo1 method", true);
  }
  @Test
  public void remo2() {
	  Reporter.log("this is remo2 method", true);
  }
  @Test
  public void remo3() {
	  Reporter.log("this is remo3 method", true);
  }
}
