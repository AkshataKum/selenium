package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name="uername") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath="") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	

	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getUsn() {
		return usn;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getLicenseLink() {
		return licenseLink;
	}


	public WebElement getPass() {
		return pass;
	}
	
		//generic reusable method
	
	
	
	
}
