package MBOnlineShopWorklow.MercedesBenz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Base {
	
	public Properties prop;
	public String url;
	public WebDriver driver; // creating at global level as not to initialize locally multiple times
	public static String firstName;
	public static String lastName;
	public static String addressLine1;
	public static String addressLine2;
	public static String city;
	public static String postalCode;
	
	
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\MBOnlineShopWorklow\\MercedesBenz\\config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String path = prop.getProperty("path");
		loadData(prop);
	
		
		url = prop.getProperty("url");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // defining implicitly at global level
		return driver;
	}
	
	public void getAppURL() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		handleCookie();
	}
	
	public void handleCookie() throws InterruptedException{
        List<WebElement> cookie = driver.findElements(By.linkText("Close"));
		
		if (cookie.size() > 0) {
			Thread.sleep(2000);
			cookie.get(0).click();
			
		}
	}
	
	public void loadData(Properties prop2) {
		firstName = prop2.getProperty("firstName").toString();
		lastName = prop2.getProperty("lastName").toString();
		addressLine1 = prop2.getProperty("addressLine1");
		addressLine2 = prop2.getProperty("addressLine2");
		city = prop2.getProperty("city");
		postalCode = prop2.getProperty("postalCode");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
	}
	
	
	

}
