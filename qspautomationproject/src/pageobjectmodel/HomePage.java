package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath="//a[text()='Logout']") private WebElement LogoutLink;
	@FindBy(xpath="//a[.='Crete new tasks']") private WebElement createNewTask;
	@FindBy(linkText ="Settings") private WebElement settings;
    @FindBy(id="SubmitTTButton") private WebElement saveLeveTimeBtn;
	
	
	
	

//initialization
	public HomePage(WebDriver driver) {
    	  PageFactory.initElements(driver,this);
	}
	
	
	

	
	//utilization
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSettings() {
		return settings;
	}


	
	

    
    //operational method
    
   
    }
    




	
	
	
	
	
	
	
}
