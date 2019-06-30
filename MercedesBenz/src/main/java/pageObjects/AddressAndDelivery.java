package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressAndDelivery {
	
	public WebDriver driver;
	
	By mr = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-shipping/div/div/div/div/div[1]/co-payment-address/div/div[1]/utils-dynamic-form/div/form/div[1]/div[1]/label");
	By firstName = By.name("co_payment_address-firstName");
	By lastName = By.name("co_payment_address-lastName");
	By line2 = By.name("co_payment_address-line2");
	By line1 = By.name("co_payment_address-line1");
	By town = By.name("co_payment_address-town");
	By postalCode = By.name("co_payment_address-postalCode");
	By contToPayment = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/div/co-func-header/div/div[2]/button");
			
	public AddressAndDelivery(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement salutation() {
		return driver.findElement(mr);
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement addressLine2() {
		return driver.findElement(line2);
	}
	
	public WebElement addressLine1() {
		return driver.findElement(line1);
	}
	
	public WebElement town() {
		return driver.findElement(town);
	}
	
	public WebElement postalCode() {
		return driver.findElement(postalCode);
	}
	
	public WebElement contToPayment() {
		return driver.findElement(contToPayment);
	} 
}
