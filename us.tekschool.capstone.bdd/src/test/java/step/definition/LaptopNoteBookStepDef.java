package step.definition;

import org.openqa.selenium.WebDriver;

	
	import java.util.concurrent.TimeoutException;

	import org.junit.Assert;

	import core.Base;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import page.objects.LaptopAndNoteBookPage;

	public class LaptopNoteBookStepDef extends Base{

		LaptopAndNoteBookPage laptopAndNotebook = new LaptopAndNoteBookPage();
		
		@Given("User is on Retail website one")
		public void user_is_on_retail_website () {
		    Assert.assertTrue(laptopAndNotebook.isLogoDisplayed());
		    logger.info("user is on retail website");
		}
		@When("User click on Laptop &NoteBook tab")
		public void user_click_on_laptop_note_book_tab() {
		    //click
			laptopAndNotebook.clickLaptopsNotebooks();
			logger.info("user click on laptop &NoteBook tab");
		}
		@When("User click on Show all Laptop & NoteBook option")
		public void user_click_on_show_all_laptop_note_book_option() {
		    //click
			laptopAndNotebook.clickShowAllLaptops();
			logger.info("user click on show all laptop &notebook option");
		}
		@Given("User click on MacBook item")
		public void user_click_on_mac_book_item() throws TimeoutException, InterruptedException {
		    //click
			Thread.sleep(5000);
			laptopAndNotebook.clickMacBookItem();
			logger.info("user click on MackBook item");
		}
		@Given("User click add to Cart button")
		public void user_click_add_to_cart_button() throws TimeoutException, InterruptedException {
		    //click
			Thread.sleep(5000);
			laptopAndNotebook.clickAddtoCartButton();
			logger.info("user click add to cart button");
		}
		@Then("User should see a message one {string}")
		public void user_should_see_a_message_one(String string) {
		    //Displayed
			Assert.assertTrue(laptopAndNotebook.successMessageIsDisplayed());
			logger.info("user should see a success message");
		}
		@Then("User should see {string} showed to the cart")
		public void user_should_see_showed_to_the_cart(String string) throws TimeoutException, InterruptedException {
		    //Displayed
			Thread.sleep(5000);
			Assert.assertTrue(laptopAndNotebook.itemDisplayedonCart());
			logger.info("user should see 1 item showed to the cart");
			
		}
		@Then("User click on cart option")
		public void user_click_on_cart_option() {
		    //click
			laptopAndNotebook.clickOnCart();
			logger.info("user click on cart option");
		}
		@Then("user click on red X button to remove the item from car")
		public void user_click_on_red_x_button_to_remove_the_item_from_car() {
		    //click
			laptopAndNotebook.clickOnXButton();
			logger.info("user click on red X button to remove the item from car");
		}
		@Then("item should be removed and cart should show {string}")
		public void item_should_be_removed_and_cart_should_show(String string) {
		    //displayed
			Assert.assertTrue(laptopAndNotebook.itemRemovedDisplayed());
			logger.info("item should be removed and cart should show zero item");
		}
		@Given("User click on product comparison icon on {string}")
		public void user_click_on_product_comparison_icon_on(String string) {
		    //click
			laptopAndNotebook.clickMacBookComparisonButton();
			logger.info("user click on product comparison icon on MacBook");
		}
		@Given("User click on product comparison icon onn {string}")
		public void user_click_on_product_comparison_icon_onn(String string) {
		    //click
			laptopAndNotebook.MacBookAirComparisonButton();
			logger.info("user click on product comparison icon onn Macbook air");
		}
		@Then("User should see a message {string}")
		public void user_should_see_a_message(String string) {
			
		}
		
		@Then("User click on Product comparison link")
		public void user_click_on_product_comparison_link() throws TimeoutException, InterruptedException {
		    //click
			Thread.sleep(5000);
			laptopAndNotebook.clickProductComparison();
			logger.info("user click on product comparison link on");
		}
		@Then("User should see Product Comparison Chart")
		public void user_should_see_product_comparison_chart() {
		    //displayed
			Assert.assertTrue(laptopAndNotebook.comparisonChartDisplayed());
			logger.info("user should see product comparison chart");
		}

		@When("User click on heart icon to add {string} laptop to wish list")
		public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		    //click
			laptopAndNotebook.clickSonyVAIOHeart();
			logger.info("user click on heart icon to add VAIO Heart laptop to wish list");
		}
		@Then("User should get a message {string}")
		public void user_should_get_a_message(String string) {
		    //displayed
			Assert.assertTrue(laptopAndNotebook.createAccountMessageDisplayed());
			logger.info("user should get a message you must login");
		}
		@When("User click on {string} item")
		public void user_click_on_item(String string) throws TimeoutException, InterruptedException {
		    //click
			Thread.sleep(5000);
			laptopAndNotebook.clickMacBookPro();
			logger.info("user click on MacBook Pro item");
		}
		@Then("User should see {string} price tag is present on UI.")
		public void user_should_see_price_tag_is_present_on_ui(String string) throws TimeoutException, InterruptedException {
		    Thread.sleep(5000);
			Assert.assertTrue(laptopAndNotebook.priceTagDisplayed());
		    logger.info("user should see price tag");
		}
	}