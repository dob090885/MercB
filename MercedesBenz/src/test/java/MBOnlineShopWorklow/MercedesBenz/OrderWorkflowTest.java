package MBOnlineShopWorklow.MercedesBenz;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AddressAndDelivery;
import pageObjects.MBShopHomepage;
import pageObjects.PaymentType;
import pageObjects.ShoppingBasket;
import pageObjects.VerificationAndOrderPlacement;

public class OrderWorkflowTest extends Base{
	
	
	
	@BeforeClass
	public void init() throws IOException, InterruptedException {
		driver=initializeDriver();
		getAppURL();
	}
	
	
	@Test
	public void orderWorkflowTest() throws IOException, InterruptedException {
		
		// Choose the product and add to cart
		MBShopHomepage hp = new MBShopHomepage(driver);
		hp.selectProduct();
		hp.addToCart();
		hp.goToShoppingBasket();
		
		//Check description and continue to address and delivery page
		ShoppingBasket sb = new ShoppingBasket(driver);
		sb.contToAddress();
		sb.placeOrderAsGuestUser();
		sb.goToVerificationAndOrderPlcmt();
		
		//Place order as guest and continue to verification & order placement page
		AddressAndDelivery ad = new AddressAndDelivery(driver);
		ad.enterAddressAndDeliveryDetails();
		PaymentType pt = ad.contToPaymentPage();
		
		//Selecting payment method and continue to Verification and Order placement
		pt.enterPaymentDetails();
		VerificationAndOrderPlacement verification = pt.goToVerificationAndOrderPlacement();
		verification.verfiyDeliveryDetails();
			
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}


