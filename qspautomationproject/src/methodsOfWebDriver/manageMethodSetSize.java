package methodsOfWebDriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethodSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");
   WebDriver driver	= new ChromeDriver();
           Dimension targetSize = new Dimension(450,250);
			driver.manage().window().setSize(450,200);
			
	}

}
