package Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZLIb extends ZBase{
	
	public static WebElement waitTillElementPresent(String path)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
	}
	
	
	public static WebElement waitTillElementToClickable(String path)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
	}
	
	public static WebElement waitTillElementToVisible(String path)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	}

}
