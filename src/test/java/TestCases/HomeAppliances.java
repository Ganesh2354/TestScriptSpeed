package TestCases;

import org.testng.annotations.Test;

import Libraries.BaseClass;
import Libraries.Library;
import TestFunctions.HomeApplianceAddToCartFunctions;

public class HomeAppliances extends BaseClass{
	
	
	
	@Test
	
	public static void HomeAppliancesAddingToCart()
	{
		Library.actionClickAnywhere();
		HomeApplianceAddToCartFunctions.clickOnTvnAppliance();
		Library.scrollIntoView(homeappliances);
		HomeApplianceAddToCartFunctions.clickOnHomeAppliance();
//		Library.scrollIntoView(Cromptoniron);
		HomeApplianceAddToCartFunctions.clickOnCromptonIron();
		
		
		
		
	}

}
