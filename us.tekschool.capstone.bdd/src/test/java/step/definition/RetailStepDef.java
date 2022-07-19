package step.definition;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;

public class RetailStepDef extends Base{

	RetailPage retail = new RetailPage();
	
	@Given("User is on Retail website three")
	public void user_is_on_retail_website_three() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";

		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Acutal Title is matching with expected title");
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() throws TimeoutException, InterruptedException {
		Thread.sleep(5000);
	    retail.clickOnMyAccount();
	    logger.info("user click on my account");
	}

	@When("User click on Login")
	public void user_click_on_login() {
	    retail.clickOnLogin();
	    logger.info("user click on login");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
	    retail.sendUsername(email);
	    logger.info("user enter username" + email);
	    retail.sendPassword(password);
	    logger.info("user enter password" + password);
	    
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    retail.clickOnLoginButton();
	    logger.info("user click on login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	    Assert.assertTrue(retail.myAccountTextIsPresent());
	    logger.info("user should be logged in to myaccount dashboard");
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_link() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    retail.clickAffiliateAccount();
	    logger.info("user click on affiliate link");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String, String>> affiliate = dataTable.asMaps(String.class, String.class);
	    retail.sendCompanyName(affiliate.get(0).get("company"));
	    retail.sendWebsiteName(affiliate.get(0).get("website"));
	    retail.sendTaxName(affiliate.get(0).get("taxID"));
	    retail.clickPaymentMethod(affiliate.get(0).get("paymentMethod"));
	    retail.sendPayeeName(affiliate.get(0).get("cheque payee name"));
	    logger.info("user fill affiliate form with below information");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    retail.clickCheckBox();
	    logger.info("user check on about us check box");
	}
	@When("User click on Continue button zero")
		public void user_click_on_continue_button_zero() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		retail.clickContinueButtonZero();
		logger.info("user click on continue button zero");
	}

	@Then("User should see a success message zero")
	public void user_should_see_a_success_message_zero() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Assert.assertTrue(retail.messageZeroDisplayed());
	    logger.info("user should see a success message zero");
	}

	@When("User click on Edit your affiliate information link one")
	public void user_click_on_link_one() {
	    retail.clickEditAffiliateLink();
	    logger.info("User click on Edit your affiliate information link one");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    retail.clickBankTransferRadio();
	    logger.info("user click on bank transfer radio button");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> bankInfo = dataTable.asMaps(String.class, String.class);
		retail.sendBankName(bankInfo.get(0).get("bankName"));
		retail.sendAbaNumber(bankInfo.get(0).get("abaNumber"));
		retail.sendSwiftCode(bankInfo.get(0).get("swiftCode"));
		retail.sendAccountName(bankInfo.get(0).get("accountName"));
		retail.sendAccountNumber(bankInfo.get(0).get("accountNumber"));
		logger.info("user fill bank information with below information");
	}
	@When("User click on Continue button one")
	public void user_click_on_contine_button_one(){
		retail.clickBankContineButton();
		logger.info("user click on Continue button one");
	}
	
	@Then("User should see a success message two")
	public void user_should_see_a_success_message_two() {
		Assert.assertTrue(retail.messageTwoDisplayed());
		logger.info("user should see a success message two");
	}

	@When("User click on {string} link two")
	public void user_click_on_link_two(String string) {
	    retail.clickAccountInfo();
	    logger.info("user click on account link two");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> accountInfo = dataTable.asMaps(String.class, String.class);
		retail.sendFirstName(accountInfo.get(0).get("firstname"));
		retail.sendLastName(accountInfo.get(0).get("lastName"));
		retail.sendEmail(accountInfo.get(0).get("email"));
		retail.sendTelephone(accountInfo.get(0).get("telephone"));
		logger.info("user modify below inforamtion");
	}

	@When("User click on continue button two")
	public void user_click_on_continue_button_two() {
	    retail.clickContinueButtonTwo();
	    logger.info("user click on continue button two");
	}
	@Then("User should see a message last {string}")
	public void user_should_see_a_message_last(String lastMessage) {
		Assert.assertTrue(retail.messageLastDisplayed());
		logger.info("user should see a message last");
	}
}