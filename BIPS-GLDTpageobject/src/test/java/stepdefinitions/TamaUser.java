package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GLDTPage;
import pages.HomePage;
import pages.LoginPage;
import testCases.TamaTestcases;

public class TamaUser extends TamaTestcases {

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
	public void user_enters_reason_region_ropu_country(String reason, String region, String ropu, String country)
			throws Exception {
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

	@And("User clicks on Analysis and Insights tab")
	public void user_clicks_on_Analysis_and_Insights_tab() throws Exception {
		AnalysisandInsights_tab();

	}

	@And("clicks on GLDT-Global Launch Date Tracker")
	public void user_clicks_on_Global_Launch_Date_Tracker() throws Exception {
		Global_Launch_Date_Tracker();

	}

	@Then("User checks if Reset filters button is available or not")
	public void Reset_filters_button_Visibility() throws Exception {
		Resetfiltersbutton_Visibility();

	}

	@And("User opens the GLDT case from the workqueue")
	public void GLDTCase_Workqueue() throws Exception {
		openExistingGLDT_WithoutLogOff();

	}

	@And("validates the temporary product name in the Assignments section")
	public void ValidateTemporaryaproductName() throws Exception {
		tempProdCheck_AssignmentsSection();

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
