package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCases.GLDTTestcase2;

public class Testcase2 extends GLDTTestcase2{
	
	@Given("User is in login page as RA user")
	public void user_is_in_login_page_as_ra_user() throws Exception {
	    setup1();
	   
	}

	@And("User gives (.*) and (.*)$")
	public void user_gives_username_and_password(String username, String password) throws Exception {
		RegulatoryAffairs_Login(username,password);
		
	    
	   
	}
	
	@And("User clicks on GLDT parentcase id")
	public void user_clicks_on_gldt_parentcase_id() throws Exception {
		openRALDcase();
		captureRALD_id();
	    
	}

	@And("User selects  {} and {},Achieved Submission date")
	public void user_selects_and_achieved_submission_date(String BestDate, String Basedate)throws Exception {
		Clickdetails(BestDate,Basedate);
	    
	}

	@And("User clicks on Not Applicable check box in Approval Date column.")
	public void user_clicks_on_not_applicable_check_box_in_approval_date_column() throws Exception {
		checkApprovalDate();
	}

	@When("User clicks on Initiate ROPU Process button.")
	public void user_clicks_on_initiate_ropu_process_button() throws Exception {
		initiateropuprocess();
	}

	@And("User clicks on Ok in the pop up dialog.")
	public void user_clicks_on_ok_in_the_pop_up_dialog() throws Exception {
		Click_on_ok();
	    
	}

	@And("User clicks on complete button")
	public void user_clicks_on_complete_button() throws Exception {
		Click_on_complete();	    
	}

	@And("User clicks on close button")
	public void user_clicks_on_close_button() throws Exception {
		Click_on_close();
		
	}
	
	@And("User clicks on close button and then logout")
	public void user_clicks_on_close_button_and_logout() throws Exception {
		Click_on_close();
		logout();
	   
	}

	@Then("ROPU process intiated and loggedout")
	public void ropu_process_intiated_and_loggedout() throws Exception {
		logout();
	   
	}
	
	@Then("User Check if Initiate ROPU Process button is displayed in the disabled form")
	public void user_check_if_initiate_ropu_process_button_is_displayed_in_the_disabled_form() throws Exception {
		InitiateRopuProcessButtonVisibility_Disabled();
	}
	
	@Then("User Check if Save & Notify button is displayed in the disabled form")
	public void SaveAndNotifyVisibility() throws Exception {
		SaveAndNotifyVisibility_Disabled();
	}
	
	@Then("User Check if Complete button is displayed in the disabled form")
	public void CompleteButtonVisibility() throws Exception {
		CompleteButtonVisibility_Disabled();
	}
	
	
	
	
	}


