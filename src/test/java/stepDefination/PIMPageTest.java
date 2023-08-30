package stepDefination;

import org.openqa.selenium.Alert;

import baseLayer.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.PIMPageClass;

public class PIMPageTest extends Baseclass {
	private PIMPageClass pim=new PIMPageClass();
	private static String empid;

	@When("user should click on PIM page button")
	public void user_should_click_on_pim_page_button() {
		pim.clickOnPimLink();

	}

	@When("user should click on add employee")
	public void user_should_click_on_add_employee() {
		pim.clickOnAddEmp();

	}

	@When("user should enter firstname And lastname")
	public void user_should_enter_firstname_and_lastname() {
		pim.enterFnameAndLname("ittesamm", "sam");

	}

	@When("user should click on savebutton")
	public void user_should_click_on_savebutton() {
		pim.clickOnSave();

	}

	@Then("user is on personal details page #verification")
	public void user_is_on_personal_details_page_verification() throws InterruptedException {
		pim.captureUrl();
		Thread.sleep(5000);

	}

	@When("user should capture empId")
	public void user_should_capture_emp_id() throws InterruptedException {
		Thread.sleep(5000);
		 empid=pim.captureEmpid();
		 System.out.println(empid);

	}

	@Then("user should click PIM page button")
	public void user_should_click_pim_page_button() throws InterruptedException {
		Thread.sleep(5000);
		pim.clickOnPimLink1();

	}

	@When("user enter the empId")
	public void user_enter_the_emp_id() {
		pim.enterEmpId(empid);

	}

	@When("user should click on search button")
	public void user_should_click_on_search_button() {
		pim.clickOnsearchButton();

	}

	@When("user should click on checkbox")
	public void user_should_click_on_checkbox() {
		pim.clickOnCheckBox();

	}

	@Then("user should click on delete button")
	public void user_should_click_on_delete_button()  {
		pim.clickOnDelete();
	

	}
	@Then("user should click confirm delete")
	public void user_should_click_confirm_delete() throws InterruptedException {
		pim.clickOnConfirmDelete();
		Thread.sleep(5000);
		driver.close();
		

	}


}
