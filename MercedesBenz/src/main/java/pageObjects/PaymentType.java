package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentType {
	
	public WebDriver driver;
	
	By creditCard = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-payment/div/div/div/div[1]/co-payment-modes/div/div/div[1]/div[1]/div[1]/div/label");
	By visa = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-payment/div/div/div/div[1]/co-payment-modes/div/div/div[1]/div[2]/div/div[1]/label");
	By contToVerification = By.cssSelector("button.dcp-co-func-footer__cta-primary");
	
	public PaymentType(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement creditCard() {
		return driver.findElement(creditCard);
	}
	
	public WebElement visa() {
		return driver.findElement(visa);
	}
	
	public WebElement contToVerification() {
		return driver.findElement(contToVerification);
	}

}
