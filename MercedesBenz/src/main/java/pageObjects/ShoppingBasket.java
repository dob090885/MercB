package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingBasket {
	
	public WebDriver driver;
	
	By cont1 = By.xpath("//button[contains(@data-track-click-as, 'go to')]");
	By email = By.id("dcp-login-guest-user-email");
	By cont2 = By.xpath("//button[contains(@data-ng-click, 'loginGuest(email)')]");
	
	public ShoppingBasket(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement contToAddress() {
		return driver.findElement(cont1);
	}
	
	public WebElement placeOrderAsGuest() {
		return driver.findElement(email);
		
	}
	
	public WebElement contVerifNOrderPlcmt() {
		return driver.findElement(cont2);
	}

}
