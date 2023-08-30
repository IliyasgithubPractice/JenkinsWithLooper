package utilsLayer;

import org.openqa.selenium.WebElement;

import baseLayer.Baseclass;

public class HomePageUtils extends Baseclass {
	public static void clickElement(WebElement wb) {

		if ((wb.isEnabled()) && (wb.isDisplayed())) {
			wb.click();
			
		}
	}

	public static void enterCredentials(WebElement wb, String credentials) {
		if ((wb.isEnabled()) && (wb.isDisplayed())) {
			wb.sendKeys(credentials);
		}
	}

	public static String captureUrl() {
		return driver.getCurrentUrl();
	}

}
