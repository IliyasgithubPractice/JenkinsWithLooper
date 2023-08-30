package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.Baseclass;
import utilsLayer.LoginPageUtils;

public class LoginPageClass extends Baseclass {
	@FindBy(name="username")
	private WebElement uname;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	public LoginPageClass()
	{
		PageFactory.initElements(driver, this);
	}
	public void enterLoginDetails(String username,String password)
	{
		LoginPageUtils.enterCredentials(uname, username);
		LoginPageUtils.enterCredentials(pass, password);
	}
	public void clickOnloginButton()
	{
		LoginPageUtils.clickElement(submitButton);
	}
	public void captureTilte()
	{
		System.out.println(LoginPageUtils.captureTitle());
	}
	

}
