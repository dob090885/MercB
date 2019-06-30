package MBOnlineShopWorklow.MercedesBenz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.AddressAndDelivery;
import pageObjects.MBShopHomepage;
import pageObjects.PaymentType;
import pageObjects.ShoppingBasket;

public class OLWorkflowTest extends base{
	
	@Test
	public void homePageNavigation() throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get("https://shop.mercedes-benz.com/en-gb/collection/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Close")).click();
		
		// Choose the product and add to cart
		MBShopHomepage hp = new MBShopHomepage(driver);
		hp.getProd01().click();
		hp.addToCart().click();
		hp.goToShoppingBasket().click();
		
		//Check description and continue to address and delivery page
		ShoppingBasket sb = new ShoppingBasket(driver);
		sb.contToAddress().click();
		sb.placeOrderAsGuest().sendKeys("blabla@gmail.com");
		sb.contVerifNOrderPlcmt().click();
		
		//Place order as guest and continue to verification & order placement page
		AddressAndDelivery ad = new AddressAndDelivery(driver);
		ad.salutation().click();
		ad.firstName().sendKeys("Ashish");
		ad.lastName().sendKeys("Deshmukh");
		ad.addressLine2().sendKeys("15");
		ad.addressLine1().sendKeys("John-F-Kennedy Str.");
		ad.town().sendKeys("Sydney");
		ad.postalCode().sendKeys("SP2 0FL");
		Thread.sleep(1000);
		ad.contToPayment().click();
		
		//Selecting payment method and continue to Verification and Order placement
		PaymentType pt = new PaymentType(driver);
		pt.creditCard().click();
		pt.visa().click();
		pt.contToVerification().click();
		
	}
}


