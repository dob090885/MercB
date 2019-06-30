package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MBOnlineShopWorklow.MercedesBenz.Base;

public class AddressAndDelivery {
	
	public WebDriver driver;
	
	//By sal = By.cssSelector("div.wb-e-radio-3__wrapper:nth-child(2) > label:nth-child(2)");
	By sal = By.xpath("//label[text()='Mr']");
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
		return driver.findElement(sal);
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
	
	public PaymentType contToPaymentPage() {
		WebElement c = driver.findElement(contToPayment);
		c.click();
		return new PaymentType(driver);
	} 
	
	public void enterAddressAndDeliveryDetails() throws InterruptedException {
		salutation().click();
		firstName().sendKeys(Base.firstName);
		lastName().sendKeys(Base.lastName);
		addressLine2().sendKeys(Base.addressLine2);
		addressLine1().sendKeys(Base.addressLine1);
		town().sendKeys(Base.city);
		postalCode().sendKeys(Base.postalCode);
		Thread.sleep(1000);
	}
}
