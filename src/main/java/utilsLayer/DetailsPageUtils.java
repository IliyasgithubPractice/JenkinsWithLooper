package utilsLayer;

import org.openqa.selenium.WebElement;

import baseLayer.Baseclass;

public class DetailsPageUtils extends Baseclass {
	public static void clickElement(WebElement wb) {

		if ((wb.isEnabled()) && (wb.isDisplayed())) {
			wb.click();

		}
	}

}
