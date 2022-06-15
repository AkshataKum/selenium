package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestngclass {
  @Test
  public void method1() {
	  Reporter.log("mrthod1 executed",true);
  }
}
