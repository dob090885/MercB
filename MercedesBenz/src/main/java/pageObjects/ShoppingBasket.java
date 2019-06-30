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
	
	public  void contToAddress() {
		WebElement c1 = driver.findElement(cont1);
		c1.click();
		
	}
	

	public void placeOrderAsGuestUser() {
		WebElement e = driver.findElement(email);
		e.sendKeys("blabla@gmail.com");
		
		
	}
	
	public void goToVerificationAndOrderPlcmt() {
		WebElement c2 = driver.findElement(cont2);
		c2.click();
	}

}
