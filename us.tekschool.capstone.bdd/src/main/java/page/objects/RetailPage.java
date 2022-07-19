package page.objects;

	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base{
	
	String paymentMethod = "";
	boolean affiliateAccountExists = false;

	
	public RetailPage() {
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
//	private WebElement retailWeb;
//	
//	@FindBy(xpath ="//a[@title='My Account']")
//	private WebElement myAccount;
//	
//	@FindBy(xpath ="//li/a[text()='Login']")
//	private WebElement login;
//	
//	@FindBy(xpath ="//*[@id=\"input-email\"]")
//	private WebElement username; 
//	
//	@FindBy(xpath ="//*[@id=\"input-password\"]")
//	private WebElement password; 
//	
//	@FindBy(xpath ="//*[@id=\"content\"]/div/div[2]/div/form/input")
//	private WebElement loginButton;
//	
//	@FindBy(xpath ="//a[text()='Account']")
//	private WebElement dashBoard;
	@FindBy(xpath = "//a[@title='My Account']")
	//span[normalize-space()='My Account']
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(id = "input-email")
	private WebElement email1;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	//========================================================================================================
	@FindBy(xpath ="//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement affiliateAccount;
	
	@FindBy(xpath ="//*[@id=\"input-company\"]")
	private WebElement companyName; 
	
	@FindBy(xpath ="//*[@id=\"input-website\"]")
	private WebElement websiteName; 
	
	@FindBy(xpath ="//*[@id=\"input-tax\"]")
	private WebElement taxName;
	
	@FindBy(xpath ="//input[@value='paypal']")  
	private WebElement paymentMethodPaypal; 
	
	@FindBy(xpath ="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]/label/input")
	private WebElement paymentMethodCheque;
	
	@FindBy(xpath ="//input[@value='bank']")//newly added ????????????
	private WebElement paymentMethodBankTransfer;
	
	@FindBy(xpath ="//*[@id=\"input-cheque\"]")
	private WebElement payeeNameCheque; 
	
	@FindBy(xpath = "//input[@placeholder='PayPal Email Account']")  
	private WebElement payeeNamePaypal; 
	
	@FindBy(xpath ="//*[@id=\"content\"]/form/div/div/input[1]")
	private WebElement checkBox;
	
	@FindBy(xpath ="//*[@id=\"content\"]/form/div/div/input[2]")
	private WebElement continueButtonZero;
	
	@FindBy(xpath ="//*[@id=\"account-account\"]/div[1]")
	private WebElement messageZero;
	
	@FindBy(xpath ="//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement editAffiliateLink;
	
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankTransferRadio; 
	
	@FindBy(xpath ="//input[@id='input-bank-name']")
	private WebElement bankName; 
	
	@FindBy(xpath ="//*[@id=\"input-bank-branch-number\"]")
	private WebElement abaNumber;  
	
	@FindBy(xpath ="//*[@id=\"input-bank-swift-code\"]")
	private WebElement swiftCode; 
	
	@FindBy(xpath ="//*[@id=\"input-bank-account-name\"]")
	private WebElement accountName;  
	
	@FindBy(xpath ="//*[@id=\"input-bank-account-number\"]")
	private WebElement accountNumber; 
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement bankContineButton;
	
	@FindBy(xpath ="//*[@id=\"account-account\"]/div[1]")
	private WebElement messageTwo;
	
	@FindBy(xpath ="//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement accountInfo;
	
	@FindBy(xpath ="//*[@id=\"input-firstname\"]")
	private WebElement firstName; 
	
	@FindBy(xpath ="//*[@id=\"input-lastname\"]")
	private WebElement lastName;
	
	@FindBy(xpath ="//*[@id=\"input-email\"]")
	private WebElement email;
	
	@FindBy(xpath ="//*[@id=\"input-telephone\"]")
	private WebElement telephone;
	
	@FindBy(xpath ="//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement continueButtonTwo;
	
	@FindBy(xpath ="//*[@id=\"account-account\"]/div[1]")
	private WebElement messageLast;
//	
//	public boolean RetailWebDisplayed() {
//		if(retailWeb.isDisplayed())
//			return true;
//		else
//			return false;
//	}
//	
//	public void clickMyAccount() {
//		myAccount.click();
//	}
//	public void clickLogin() {
//		login.click();
//	}
//	public void sendUsername(String username2) {
//		username.sendKeys(username2);
//		
//	}
//	public void sendPassword(String password2) {
//		password.sendKeys(password2);
//		
//	}
//	public void clickLoginButton() {
//		loginButton.click();
//	}
//	public boolean dashBoardDisplayed() {
//		if(dashBoard.isDisplayed())
//			return true;
//		else
//			return false;
//	}
	
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void sendUsername(String username2) {
	email1.sendKeys(username2);
	
}
	public void sendPassword(String password2) {
	password.sendKeys(password2);
	
}

	

	public void clickOnLoginButton() {
		loginButton.click();

	}

	public boolean myAccountTextIsPresent() {
		if (myAccountText.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	//=========================================

	//=======================================
	public void clickAffiliateAccount() {
		try {
			affiliateAccount.click();
			affiliateAccountExists = true;
		} catch (NoSuchElementException e) {
			logger.error("Registration link does not exist: Affliate account already exists.");
			affiliateAccountExists = false;
		}
		
	}
	public void sendCompanyName(String ComName) {
		if(affiliateAccountExists) {
			companyName.sendKeys(ComName);
		}else {
			logger.info("Company name skipped: affiliate account already exists");
		}
	}
	public void sendWebsiteName(String website) {
		if(affiliateAccountExists) {
			websiteName.sendKeys(website);
		}else {
			logger.info("Website skipped: affiliate account already exists");
		}
		
		
	}
	public void sendTaxName(String tax) {
		if(affiliateAccountExists) {
			taxName.sendKeys(tax);
		}else {
			logger.info("TaxID skipped: affiliate account already exists");
		}
		
		
	}
	
	public void clickPaymentMethod(String method) {//same stepDef
		if(affiliateAccountExists) {
			switch(method) {
			case "PayPal":
				paymentMethodPaypal.click();
				paymentMethod = "PayPal";
				break;
			case "Cheque":
				paymentMethodCheque.click();
				paymentMethod = "Cheque";
				break;
			case "Bank Transfer":
				paymentMethodBankTransfer.click();
				paymentMethod = "Bank Transfer";
				break;
			}
		}else {
			logger.info("Payment Method skipped: affiliate account already exists");
		}
		
	}
	
	public void sendPayeeName(String payee) {//same stepDef
		if(affiliateAccountExists) {
			if(paymentMethod.equals("Cheque")) {
				payeeNameCheque.sendKeys(payee);
			} else if(paymentMethod.equals("PayPal")) {
				payeeNamePaypal.sendKeys(payee);
			}
		}else {
			logger.info("Payee Name skipped: affiliate account already exists");
		}	
	}
	public void clickCheckBox() {
		if(affiliateAccountExists) {
			checkBox.click();
		}else {
			logger.info("About us checkbox skipped: affiliate account already exists");
		}	
		
	}
	public void clickContinueButtonZero() {
		if(affiliateAccountExists) {
			System.out.println("CONTINUE BUTTON ERROR ====>" + affiliateAccountExists);
			continueButtonZero.click();
		}else {
			logger.info("Continue button skipped: affiliate account already exists");
		}
		
	}
	public boolean messageZeroDisplayed() {
		if(affiliateAccountExists) {
			if(messageZero.isDisplayed())
				return true;
			else
				return false;
		}else {
			logger.info("Continue button skipped: affiliate account already exists");
			return false;
		}		
	}
	public void clickEditAffiliateLink() {
		editAffiliateLink.click();
	}
	public void clickBankTransferRadio() {
		bankTransferRadio.click();
	}
	public void sendBankName(String bankName1) {
		bankName.sendKeys(bankName1);
		
	}
	public void sendAbaNumber(String abaNumber1) {
		abaNumber.sendKeys(abaNumber1);
		
	}
	public void sendSwiftCode(String swift) {
		swiftCode.sendKeys(swift);
		
	}
	public void sendAccountName(String account) {
		accountName.sendKeys(account);
		
	}
	public void sendAccountNumber(String accNumber) {
		accountNumber.sendKeys(accNumber);
		
	}
	public void clickBankContineButton() {
		bankContineButton.click();
	}
	public boolean messageTwoDisplayed() {
		if(messageTwo.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickAccountInfo() {
		accountInfo.click();
	}
	public void sendFirstName(String fName) {
		firstName.sendKeys(fName);
		
	}
	public void sendLastName(String lName) {
		lastName.sendKeys(lName);
		
	}
	public void sendEmail(String email2) {
		email1.sendKeys(email2);
		
	}
	public void sendTelephone(String phone) {
		telephone.sendKeys(phone);
		
	}
	public void clickContinueButtonTwo() {
		continueButtonTwo.click();
	}
	public boolean messageLastDisplayed() {
		if(messageLast.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	
	
	

}