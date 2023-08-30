package stepDefination;

import baseLayer.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPageClass;

public class LoginPageTest extends Baseclass {
	private LoginPageClass login;
	@Given("user should enter valid credentials")
	public void user_should_enter_valid_credentials() {
		Baseclass.initilization();

	}

	@When("user enter valid usernmae And password")
	public void user_enter_valid_usernmae_and_password() {
	      login=new LoginPageClass();
	      login.enterLoginDetails("Admin", "admin123");

	}

	@When("user click on loginbutton")
	public void user_click_on_loginbutton() {
		login.clickOnloginButton();

	}
	@Then("user is on homepage  #verification")
	public void user_is_on_homepage_verification() {
		login.captureTilte();

	}



}
