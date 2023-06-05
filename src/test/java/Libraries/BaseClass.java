package Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import AllPaths.Paths;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements Paths{

	public static WebDriver driver;
	@BeforeTest
	
	public static void LaunchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
	}
	
	@AfterTest
	
	public static void close()
	{
//		driver.close();
	}
	
}
