package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MBShopHomepage {
	public WebDriver driver;
	
	By prod01 = By.xpath("//a[contains(@data-track-teaser-name, 'Flat brim cap')]");
	By add = By.xpath("//button[contains(@data-ng-click, 'addToCart')]");
	By goTo = By.xpath("//button[contains(@data-track-click-as, 'open cart')]");
	
	public MBShopHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProd01(){
		return driver.findElement(prod01);
	}
	
	public WebElement addToCart() {
		return driver.findElement(add);
	}
	
	public WebElement goToShoppingBasket() {
		return driver.findElement(goTo);
	}

}
