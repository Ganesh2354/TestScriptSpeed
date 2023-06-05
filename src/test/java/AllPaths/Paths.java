package AllPaths;

public interface Paths {
	
	//AddToKart
	//1
	String srchTb="//input[@title='Search for products, brands and more']";
	//2
	String prdct="//form[@action='/search']//ul/descendant::a[1]";
	//3
	String serachedresult="(//a[contains(@href, 'macbook-air-m2')])[2]";
	//4
	String buyNowBtn="//button[text()='Buy Now']";
	
	
	
	
	
	//=======================Homeappliances===========================
	
	//1
	
	String tvnAppliances="(//a[contains(@href, 'tv-and-appliance')])[1]";
	String homeappliances="(//a[contains(@href, 'home-appliance')])[1]";
	
	
	//2
	String Cromptoniron="(//a[contains(text(), 'Crompton') and contains(text(), 'Iron')])[1]";
	
	
	
	
	
	//======Home Page ======
	
	String homepageLogo="//img[@title='Flipkart']";
	
	String discount="//div[contains(text(), 'Discount')]";
	
	String bestSeller="//div[text()='Bestseller']/parent::div/preceding-sibling::div/parent::a";
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
