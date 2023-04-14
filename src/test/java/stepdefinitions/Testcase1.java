package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GLDTPage;
import pages.HomePage;
import pages.LoginPage;
import testCases.GLDTTestcae1;

public class Testcase1 extends GLDTTestcae1 {

	LoginPage loginpage;
	HomePage homepage;
	GLDTPage gldtpage;

	@Given("User is in login page")
	public void user_is_in_login_page() throws Exception {
		setup1();
	}

	@And("User Gives valid (.*) and (.*)$")
	public void user_gives_valid_username_and_password(String username, String password) throws Exception {
		TAMAManager_login(username, password);
		

	}

	@And("User click on Initiate Tab")
	public void user_click_on_initiate_tab() throws Exception {
		click_on_InitiateProcess_TAB();
	}

	@And("User clicks on GLDT_Module")
	public void user_clicks_on_gldt_module() throws Exception {
		click_on_GLDT_Module();
		captureGLDT_id();

	}
	
	@When("User Enters (.*)$")
	public void user_enters_product(String product) throws Exception {
		EnterProduct(product);

	}

	
	@Then("User clicks on product is undefined checkbox and Enters (.*) in Temporary Product Name$")
	public void user_enters_temp_proj_in_temporary_product_name(String tempproduct) throws Exception {
	    EnterTempProduct(tempproduct);

	}


	@And("^(.*),(.*),(.*),(.*)$")
	public void user_enters_reason_region_ropu_country(String reason, String region,String ropu, String country) throws Exception {
		givedetails(reason, region, ropu, country);

	}

	@And("User Clicks on Initiate RA Process")
	public void user_clicks_on_initiate_ra_process() throws Exception {
		InitiateRAProcessbutton();
	}

	@And("User Clicks on Continue")
	public void user_clicks_on_continue() throws Exception {
		Continuebutton();

	}

	@And("Initialisation need to be completed and logout")
	public void initialisation_need_to_be_completed_and_logout() throws Exception {
		logout();
    }

	@And("User clicks on Close and logout")
	public void user_clicks_on_close_and_logout() throws Exception {
		Click_on_close();
		logout();
	}

}
