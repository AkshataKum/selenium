package handlingTheDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method01 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("file:///C:/Users/adhikrao/Desktop/html/multirowdropdown.html");
    
    	
    	WebElement dropDownElement = driver.findElement(By.id("menu"));
    Select sel = new Select(dropDownElement);
    sel.selectByVisibleText("Paratha");
    Thread.sleep(4000);
    sel.deselectByIndex(9);

	}

}
