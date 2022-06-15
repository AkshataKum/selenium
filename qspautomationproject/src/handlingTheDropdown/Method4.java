
package handlingTheDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/adhikrao/Desktop/html/singalerowdropdown.html");
		Thread.sleep(2000);

		 WebElement dropDownElement = driver.findElement(By.id("menu"));
		 Select sel = new Select(dropDownElement);
		 for(int i=2;i<=8;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(1000);
		 }
		
	}

}
