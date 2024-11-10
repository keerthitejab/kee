package StepDefinitions;

import org.junit.Assert;

import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    
	private LoginPage login;
	private ProductPage product;
	
	public LoginStep() {
		
		login=new LoginPage(Hooks.getDriver());
		product = new ProductPage(Hooks.getDriver());
	}
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    
		Assert.assertEquals("Swag Labs", Hooks.getDriver().getTitle());
	}

	@When("User enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		login.enterUser(username);
		login.enterPass(password);
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		login.click();
	}

	@Then("User should redirected to the product page")
	public void user_should_redirected_to_the_product_page() {
		
		System.out.println("user is on the product page");
	}

	@When("User clicks on the product in the product page")
	public void user_clicks_on_the_product_in_the_product_page() {
		
		product.proClick();
	}

	@And("User clicks on the Add to cart")
	public void user_clicks_on_the_add_to_cart() {
		product.proCartClick();
		product.cartBClick();
	}

	@Then("User clicks on the cart button logo")
	public void user_clicks_on_the_cart_button_logo() {
		
		product.cartBClick();
	}

	@And("User should get the product name")
	public void user_should_get_the_product_name() {
		
		product.proTitle();
	}

}
