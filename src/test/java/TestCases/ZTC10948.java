package TestCases;

import org.testng.annotations.Test;

import Libraries.Library;
import TestFunctions.AddToKart;

public class ZTC10948 extends AddToKart{

	@Test

	public void testFCFunctionality() {
		AddToKart.clickToProceed();
		AddToKart.SearchProduct();
		AddToKart.selectAProduct();
		AddToKart.searchedResultVerifyAndClick();
		Library.elementFinderOnDifferentTabs(buyNowBtn);
		AddToKart.searchedResultVerifyAndClick();
	}
}
