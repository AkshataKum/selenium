package handlingTheDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/adhikrao/Desktop/html/singalerowdropdown.html");
     
     Thread.sleep(2000);
      WebElement dropDownElement = driver.findElement(By.id("menu"));
       Select sel = new Select(dropDownElement);
       sel.selectByIndex(5);
       
                
     

	}

}
