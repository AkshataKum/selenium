package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-tlbrdjc6/login.do");
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
}
}