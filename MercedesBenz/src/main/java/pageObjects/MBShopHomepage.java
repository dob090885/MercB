package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MBShopHomepage {
	public WebDriver driver;
	public static String prodName;
	public static String prodItemNum;
	public static String prodColour;
	public static String prodqty;
	public static String prodPrice;
	
	By prod01 = By.xpath("//a[contains(@data-track-teaser-name, 'Flat brim cap')]/img");
	By add = By.xpath("//button[contains(@data-ng-click, 'addToCart')]");
	By goTo = By.xpath("//button[contains(@data-track-click-as, 'open cart')]");
	
	By pName = By.cssSelector(".dcp-ar2");
	By itemnum = By.cssSelector("p.ng-binding:nth-child(4) > span:nth-child(1)");
	By colour = By.cssSelector(".pdp-buy-box-colors > p:nth-child(1) > span:nth-child(1)");
	By qty = By.xpath("//input[@type='number']");
	By price = By.xpath("//span[@data-testid='pdp-buy-box-add-to-basket-price']");
	
	public MBShopHomepage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void selectProduct() throws InterruptedException{
		waitForElement(prod01);
		WebElement p1 = driver.findElement(prod01);
		p1.click();
	}
	
	public void addToCart() {
		waitForElement(add);
		WebElement ad = driver.findElement(add);
		getProductDetails();
		ad.click();
	}
	
	public void goToShoppingBasket() throws InterruptedException {
		Thread.sleep(2000);
		waitForElement(goTo);
		WebElement s = driver.findElement(goTo);
		s.click();
	}
	
	public void waitForElement(By ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	public void getProductDetails() {
		WebElement d1 = driver.findElement(pName);
		prodName = d1.getText();
		
		WebElement d2 = driver.findElement(itemnum);
		prodItemNum = d2.getText();
		
		WebElement d3 = driver.findElement(colour);
		prodColour = d3.getText();
		
		WebElement d4 = driver.findElement(qty);
		prodqty = d4.getAttribute("value");
		
		WebElement d5 = driver.findElement(price);
		prodPrice = d5.getText();
	}

}
