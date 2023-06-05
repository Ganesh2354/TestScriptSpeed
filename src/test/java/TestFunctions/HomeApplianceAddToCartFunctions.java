package TestFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Libraries.BaseClass;
import Libraries.Library;

public class HomeApplianceAddToCartFunctions extends BaseClass{
	
	//1
	
	public static void clickOnTvnAppliance()
	{
		System.out.println("finding Tv And Appliances...");
		WebElement tvNAppliance=Library.waitTillClickable(tvnAppliances);
		System.out.println("found Tv And Appliances element...");
		System.out.println("clicking on TvnAppliance");
		Library.staticWaitTill();
		tvNAppliance.click();
		Library.staticWaitTill();
		System.out.println("clicked on TvnAppliance");
		
	}
	
	
	//2
	
	public static void clickOnHomeAppliance()
	{
		System.out.println("finding element to be clickable");
		WebElement elem=Library.waitTillClickable(homeappliances);
		System.out.println("found element to be clickable");
		System.out.println("clicking on element");
		Library.staticWaitTill();
		elem.click();
		Library.staticWaitTill();
		System.out.println("clicked on element");
	}
	
	public static void clickOnCromptonIron()
	{
		System.out.println("finding element to be clickable");
		WebElement elem=Library.waitTillClickable(Cromptoniron);
		System.out.println("found element to be clickable");
		System.out.println("clicking on element");
		Library.staticWaitTill();
		elem.click();
		Library.staticWaitTill();
		System.out.println("clicked on element");
	}
	
	
	
	
	
	
	
	
	

}
