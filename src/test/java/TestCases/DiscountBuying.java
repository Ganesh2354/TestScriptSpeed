package TestCases;

import org.testng.annotations.Test;

import Libraries.BaseClass;
import Libraries.Library;
import TestFunctions.DiscountBuyingFunctions;

public class DiscountBuying extends BaseClass{

	
@Test
	
	public static void TestDiscountedBuying()
	{
		Library.actionClickAnywhere();
	    Library.homePageVerifier();
	    
		DiscountBuyingFunctions.DiscountandBuy();
		DiscountBuyingFunctions.selectBestSeller();
		
		
	}
}
