package TestFunctions;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Libraries.BaseClass;
import Libraries.Library;

public class AddToKart extends BaseClass{
	//1
	public static void clickToProceed()
	{
		Library.actionClickAnywhere();
	}
	//2
	public static void SearchProduct()
	{
		if(Library.ElementDisplayed(srchTb))
		{
			try {
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.getMessage();
			}
			Library.findWebElement(srchTb).sendKeys("Macbook air m2");
			try {
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.getMessage();
			}
//			Library.findWebElement(srchTb).sendKeys(Keys.ENTER);
		}
	}
	
	public static void selectAProduct()
	{
		
		if(Library.ElementDisplayed(prdct))
		{
			System.out.println("The product option is displayed");
			System.out.println("clicking on element with tecxt : "+ Library.findWebElement(prdct).getText());
			try {
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.getMessage();
			}
			Library.click(prdct);
			try {
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.getMessage();
			}
		}else {
			Assert.assertFalse(true, "Element not displayed");
		}
	}
	
	public static void searchedResultVerifyAndClick()
	{
		Library.waitTillElementVisisble(serachedresult);
		if(Library.findWebElement(serachedresult).isDisplayed())
		{
			
		Library.click(serachedresult);
		try {
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.getMessage();
		}
		}
		else {
			Assert.assertFalse(true, "search result not found");
		}
	}
	
	public static void verify()
	{
		
	}
	
	
	
	

}
