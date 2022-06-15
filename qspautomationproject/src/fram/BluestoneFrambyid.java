package fram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrambyid {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	driver.switchTo().frame("chat-widget");
	
	//WebElement chatWithOurExpert = driver.findElement(By.xpath(""));
	//chatWithOurExpert.click();
	
	
	}
}
