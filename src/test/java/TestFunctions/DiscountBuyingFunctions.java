package TestFunctions;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Libraries.BaseClass;
import Libraries.Library;

public class DiscountBuyingFunctions extends BaseClass{

	public static void DiscountandBuy()
	{
		System.out.println("finding element for discount...");		
		WebElement discnt=Library.waitTillClickable(discount);
		System.out.println("found element for discount...");
		Library.staticWaitTill();
		System.out.println("clicking...");
		discnt.click();
		System.out.println("clicked...");
		Library.staticWaitTill();		
	}
	
	public static void selectBestSeller()
	{
		boolean flag=true;
		while(flag)
		{
		try{System.out.println("finding element for bestseller...");
		WebElement bestselr=Library.waitTillClickable(bestSeller);
		System.out.println("found element for bestseller...");
		Library.staticWaitTill();
		System.out.println("clicking...");
		bestselr.click();
		flag=false;
		System.out.println("clicked...");
		Library.staticWaitTill();
		}catch(Exception e)
		{
			Library.ScrollBy();
		}
		}
		
	}
	
	
}
