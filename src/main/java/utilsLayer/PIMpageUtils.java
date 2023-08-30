package utilsLayer;

import org.openqa.selenium.WebElement;

import baseLayer.Baseclass;

public class PIMpageUtils extends Baseclass{
	public static void enterEmpId(WebElement wb,String empId)
	{
		if((wb.isEnabled())&&(wb.isDisplayed()))
		{
			wb.sendKeys(empId);
		}
	}
	public static void clickElement(WebElement wb) {

		if ((wb.isEnabled()) && (wb.isDisplayed())) {
			wb.click();
			
		}
	}
	

}
