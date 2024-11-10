package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
   
WebDriver driver;
	
	@FindBy(xpath="//a[@id='item_4_title_link']/child::div")
	WebElement productClick;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement productCartClick;
	
	@FindBy(xpath="//div[@id='shopping_cart_container']/a")
	WebElement CartButtonClick;
	
	@FindBy(xpath="//div[contains(text(),'Sauce Labs ')]")
	WebElement productTitle;
	
	public ProductPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void proClick() {
		
		productClick.click();
	}
    
   public void proCartClick() {
		
	   productCartClick.click();
	}
  
   public void cartBClick() {
	
	   CartButtonClick.click();
   } 
   
   public void proTitle() {
	   
	   System.out.println("the name of the product is:"+productTitle.getText());
   }
}
