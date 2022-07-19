package step.definition;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;

public class HomePageStepDef extends Base{
	
	HomePage homePage = new HomePage();
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		
	}
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrrency();
		logger.info("User clicked on Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.choseEuro();
		logger.info("User Chose Euro from dropdown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.valuechangeEuro();
		logger.info("currency value changed to Euro");
	    
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.ClickOnShopingCart();
		logger.info("User clicked on shopping cart");
	   
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homePage.messageDisplayed();
		logger.info("Your shopping cart was empty!” message displayed");
	   
	}

}
