package Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZBase {
	public static WebDriver driver;
	@BeforeClass
	
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zonesglobalfotest.sandbox.dynamics.com/");
			
	}
	
	@AfterClass
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}
