package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("");
	String titleOfLoginPage = driver.getTitle();
	System.out.println(titleOfLoginPage);
	}

}
