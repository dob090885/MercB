package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MBOnlineShopWorklow.MercedesBenz.Base;
import MBOnlineShopWorklow.MercedesBenz.Constant;

public class VerificationAndOrderPlacement {
	
	public WebDriver driver;

	public VerificationAndOrderPlacement(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verfiyDeliveryDetails() {
		
		String shippingType = driver.findElement(By.cssSelector(".dcp-co-order-data-delivery-modes__entry > span:nth-child(1)")).getText();
		String name= driver.findElement(By.cssSelector("div.dcp-co-order-data-panels__entry:nth-child(2) > div:nth-child(2) > div:nth-child(2)")).getText();
		String addr = driver.findElement(By.cssSelector("div.dcp-co-order-data-panels__entry:nth-child(2) > div:nth-child(2) > div:nth-child(3)")).getText();
		String city = driver.findElement(By.cssSelector("div.dcp-co-order-data-panels__entry:nth-child(2) > div:nth-child(2) > div:nth-child(4)")).getText();
		String pyt = driver.findElement(By.cssSelector("div.dcp-co-order-data-panels__entry:nth-child(4) > div:nth-child(2)")).getText();
		
		String pName = driver.findElement(By.cssSelector(".wb-e-link-5")).getText();
		String pNum = driver.findElement(By.cssSelector("p.hidden-xs")).getText();
		String pCol = driver.findElement(By.cssSelector(".dcp-orderline__variant")).getText();
		String pQty = driver.findElement(By.cssSelector("div.dcp-co-delivery-header-summary__entity:nth-child(4)")).getText();
		String pPrice = driver.findElement(By.cssSelector(".dcp-orderline__total-price > ng-include:nth-child(2) > div:nth-child(1) > span:nth-child(2)")).getText();
		
		Assert.assertEquals(name, Base.firstName + " "+ Base.lastName, "Name displayed incorrectly"); 
		Assert.assertEquals(addr, Base.addressLine2 + " "+ Base.addressLine1, "Address displayed incorrectly");
		Assert.assertEquals(city, Base.city + " "+ Base.postalCode, "city displayed incorrectly");
		Assert.assertEquals(shippingType, Constant.defaultShippingType, "shipping type displayed incorrectly");
		Assert.assertEquals(pyt, PaymentType.paymentType, "Payment type displayed displayed");
		
		Assert.assertEquals(pName, MBShopHomepage.prodName, "Product Name displayed incorrectly");
		Assert.assertEquals(pNum, "Item number: "+MBShopHomepage.prodItemNum, "Product number displayed incorrectly");
		Assert.assertEquals(pCol, "Colour: "+MBShopHomepage.prodColour, "Product colour displayed incorrectly");
		Assert.assertEquals(pQty, MBShopHomepage.prodqty+" Items", "Product quantity displayed incorrectly");
		Assert.assertEquals(pPrice, MBShopHomepage.prodPrice, "Product price displayed incorrectly");
		
	}

}
