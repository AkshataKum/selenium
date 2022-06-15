package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/adhikrao/Desktop/html/loginpage.html");
       Thread.sleep(2000);
       driver.findElement(By.id("i1")).sendKeys("admin");
       driver.findElement(By.id("i2")).sendKeys("manager");

	}

}
