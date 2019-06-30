package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentType {
	
	public WebDriver driver;
	public static String paymentType;
	
	By creditCard = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-payment/div/div/div/div[1]/co-payment-modes/div/div/div[1]/div[1]/div[1]/div/label");
	By visa = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-payment/div/div/div/div[1]/co-payment-modes/div/div/div[1]/div[2]/div/div[1]/label");
	By contToVerification = By.cssSelector("button.dcp-co-func-footer__cta-primary");
	
	
	
	public PaymentType(WebDriver driver) {
		this.driver = driver;
	}
	
	public  void selectCreditCardOption() {
		WebElement cc = driver.findElement(creditCard);
		cc.click();
	}
	
	public void selectCreditCardType() {
		WebElement v = driver.findElement(visa);
		v.click();
	}
	
	public VerificationAndOrderPlacement goToVerificationAndOrderPlacement() {
		WebElement x =driver.findElement(contToVerification);
		x.click();
		return new VerificationAndOrderPlacement(driver);
	}
	
	public void enterPaymentDetails() {
		selectCreditCardOption();
		selectCreditCardType();
		getPaymentType();
	}
	
	public void getPaymentType() {
		WebElement vis = driver.findElement(visa);
		paymentType = vis.getText();
	}

}
