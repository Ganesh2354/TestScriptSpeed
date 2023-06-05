package Libraries;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library extends BaseClass{
	
	
	
	public static void clickTabFunction(int cn) throws Exception
	{
		Robot rb=new Robot();
		for(int i=0;i<cn;i++)
		{
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
		}
		
		
	}
	
	public static void homePageVerifier()
	{
		System.out.println("checking logo...");
		WebElement logoimg=waitTillElementVisisble(homepageLogo);
		if(logoimg.isDisplayed())
		{
			System.out.println("Landed on home page");
		}else {
			System.out.println("Not Landed on home page");
		}
	}
	
	

	public static void click(String path)
	{
		WebElement elem=Library.waitTillClickable(path);
		elem.click();

	}
	
	public static WebElement waitTillClickable(String path)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement trgt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
		return trgt;
	}
	
	public static WebElement waitTillElementVisisble(String path)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement trgt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		return trgt;
	}
	
	public static boolean ElementDisplayed(String path)
	{
		WebElement trgt;
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		trgt=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
		if(trgt.isDisplayed())
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void actionClickAnywhere()
	{
		Actions act=new Actions(driver);
		act.click().build().perform();
	}
	
	public static WebElement findWebElement(String path)
	{
		return waitTillElementVisisble(path);
	}
	
	public static void actionDoubleClick(String path)
	{
		Actions act=new Actions(driver);
		act.doubleClick().build().perform();
	}
	
	public static String parenttab;
	public static WebElement elementFinderOnDifferentTabs(String path)
	{
	 parenttab=driver.getWindowHandle();
		
		Set<String> alltabs=driver.getWindowHandles();
		System.out.println("No. of tabs opened "+alltabs.size()+" and addresses :"+alltabs);
		WebElement ele=null;
		if(alltabs.size()>=1)
		{
			String addverify="";
				Iterator<String> it= alltabs.iterator();
				while(it.hasNext())
				{
					
					String tempaddress=it.next();
					driver.switchTo().window(tempaddress);
					try {
						addverify=tempaddress;
					return Library.waitTillElementVisisble(path);
					
					}catch(Exception w)
					{
						w.getMessage();
					}

				}
				if(addverify!="" && parenttab==addverify)
				{
					System.out.println("element found on parent tab");
				}else {
					System.out.println("element found on child tab");
				}
			
		}
		
		return ele;
		
		
	}
	
	public static void staticWaitTill()
	{
		try {
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	public static void scrollIntoView(String path)
	{
		System.out.println("finding element to present to scroll...");
		WebElement elementToScroll=Library.waitTillElementVisisble(path);
		System.out.println("element is present to scroll...");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", elementToScroll);
	}
	
	public static void ScrollBy()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 1000)");
	}
	
}
