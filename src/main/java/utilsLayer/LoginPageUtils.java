package utilsLayer;

import org.openqa.selenium.WebElement;

import baseLayer.Baseclass;

public class LoginPageUtils extends Baseclass {
	public static void enterCredentials(WebElement wb,String credentials)
	{
		if((wb.isEnabled())&&(wb.isDisplayed()))
		{
			wb.sendKeys(credentials);
		}
	}
	public static void clickElement(WebElement wb) {

		if ((wb.isEnabled()) && (wb.isDisplayed())) {
			wb.click();
			
		}
	}
	public static String captureTitle()
	{
		return driver.getTitle();
	}
	

}
