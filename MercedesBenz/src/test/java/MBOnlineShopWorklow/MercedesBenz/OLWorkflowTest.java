package MBOnlineShopWorklow.MercedesBenz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OLWorkflowTest extends base{
	
	@Test
	public void homePageNavigation() throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get("https://shop.mercedes-benz.com/en-gb/collection/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@data-track-teaser-name, 'Flat brim cap')]")).click();
		Thread.sleep(100);
		driver.findElement(By.linkText("Close")).click();
		driver.findElement(By.xpath("//button[contains(@data-ng-click, 'addToCart')]")).click();
		driver.findElement(By.xpath("//button[contains(@data-track-click-as, 'open cart')]")).click();
		driver.findElement(By.xpath("//button[contains(@data-track-click-as, 'go to')]")).click();
		driver.findElement(By.id("dcp-login-guest-user-email")).sendKeys("bla.bla@gmail.com");
		driver.findElement(By.xpath("//button[contains(@data-ng-click, 'loginGuest(email)')]")).click();
		System.out.println("Reached");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-shipping/div/div/div/div/div[1]/co-payment-address/div/div[1]/utils-dynamic-form/div/form/div[1]/div[1]/label")).click();
		driver.findElement(By.name("co_payment_address-firstName")).sendKeys("Ashish");
		driver.findElement(By.name("co_payment_address-lastName")).sendKeys("Deshmukh");
		driver.findElement(By.name("co_payment_address-line2")).sendKeys("15");
		driver.findElement(By.name("co_payment_address-line1")).sendKeys("John-F-Kennedy Strasse");
		driver.findElement(By.name("co_payment_address-town")).sendKeys("Sydney");
		driver.findElement(By.name("co_payment_address-postalCode")).sendKeys("SP2 0FL");
		System.out.println("Reached");
		
		driver.findElement(By.cssSelector("#co-address-shipping-method-edit > co-delivery-modes > div > h3")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/div/co-func-header/div/div[2]/button")).click();
		System.out.println("Reached");
		
		
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-payment/div/div/div/div[1]/co-payment-modes/div/div/div[1]/div[1]/div[1]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[4]/co-grid-payment/div/div/div/div[1]/co-payment-modes/div/div/div[1]/div[2]/div/div[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.dcp-co-func-footer__cta-primary")).click();
	}
}


