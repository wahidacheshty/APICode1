package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base{
	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]")
	private WebElement clickOnCurrrency;
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement ChoseEuro;
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/span")
	private WebElement valuechangeEuro;
	
	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private WebElement ClickOnShopingCart;
	
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li/p")
	private WebElement messageDisplayed;
	
	public void clickOnCurrrency() {
		clickOnCurrrency.click();
		
	}
	public void choseEuro() {
		ChoseEuro.click();
	}
	public void valuechangeEuro() {
		valuechangeEuro.click();
	}
	public void ClickOnShopingCart() {
		ClickOnShopingCart.click();
		
	}
	public void messageDisplayed() {
		messageDisplayed.click();
		
		
		
		

	}
}