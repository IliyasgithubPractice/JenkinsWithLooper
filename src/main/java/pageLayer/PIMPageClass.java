package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.Baseclass;
import utilsLayer.DetailsPageUtils;
import utilsLayer.HomePageUtils;
import utilsLayer.PIMpageUtils;

public class PIMPageClass extends Baseclass {
	
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[2]")
	private WebElement pimLink;
	@FindBy(xpath="(//li[@class='oxd-topbar-body-nav-tab'])[1]")
	private WebElement addEmp;
	@FindBy(name="firstName")
	private WebElement fname;
	@FindBy(name="lastName")
	private WebElement lname;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickOnSave;
	@FindBy(xpath="(//input[contains(@class,'oxd-input oxd-')])[6]")
	private WebElement empId;
	@FindBy(xpath="(//a[@class='oxd-main-menu-item active'])")
	private WebElement pimLink1;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement enterId;
	@FindBy(xpath="//div//button[text()=' Search ']")
	private WebElement searchEmp;
	@FindBy(xpath="(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[2]")
	private WebElement clickOncheckBox;
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement clickDelBox;
	@FindBy(xpath="//div//button[text()=' Yes, Delete ']")
	private WebElement conformDel;
	public PIMPageClass()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnPimLink()
	{
		HomePageUtils.clickElement(pimLink);
	}
	public void clickOnAddEmp()
	{
		HomePageUtils.clickElement(addEmp);
	}
	public void enterFnameAndLname(String firstname,String lastname)
	{
		HomePageUtils.enterCredentials(fname, firstname);
		HomePageUtils.enterCredentials(lname, lastname);
	}
	public void clickOnSave()
	{
		HomePageUtils.clickElement(clickOnSave);
	}
	public void captureUrl()
	{
		System.out.println(HomePageUtils.captureUrl());
	}
	public String captureEmpid()
	{
		 return empId.getAttribute("value");
	}
	public void clickOnPimLink1()
	{
		DetailsPageUtils.clickElement(pimLink1);
	}
	public void enterEmpId(String id)
	{
		PIMpageUtils.enterEmpId(enterId, id);
	}
	public void clickOnsearchButton()
	{
		PIMpageUtils.clickElement(searchEmp);
	}
	public void clickOnCheckBox()
	{
		PIMpageUtils.clickElement(clickOncheckBox);
	}
	public void clickOnDelete()
	{
		PIMpageUtils.clickElement(clickDelBox);
	}
	public void clickOnConfirmDelete()
	{
		PIMpageUtils.clickElement(conformDel);
	}


}
