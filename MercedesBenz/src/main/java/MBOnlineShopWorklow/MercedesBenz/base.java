package MBOnlineShopWorklow.MercedesBenz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver; // creating at global level as not to initialize locally multiple times
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\MBOnlineShopWorklow\\MercedesBenz\\config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String path = prop.getProperty("path");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", path+"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // defining implicitly at global level
		return driver;
	}

}
