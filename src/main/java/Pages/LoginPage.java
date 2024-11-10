package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUser(String user) {
		
		userName.sendKeys(user);
	}
	
   public void enterPass(String pass) {
		
		passWord.sendKeys(pass);
	}
   
   public void click() {
		
		loginButton.click();
	}
}
