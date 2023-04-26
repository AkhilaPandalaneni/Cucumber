package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testCases.RopuTestCases;

public class RopuUser extends RopuTestCases {

	@Given("Ropu User is in login page")
	public void user_is_in_login_page() throws Exception {
		setup1();
	}

	@And("Ropu User Gives valid (.*) and (.*)$")
	public void user_gives_valid_username_and_password(String username, String password) throws Exception {
		Ropu_login(username, password);

	}

	@And("Ropu User Opens Existing ROLD Case")
	public void user_opens_existing_rold_case() throws Exception {
		Opens_ExistingROLDCase();
		captureROLD_id();

	}

	@And("Ropu User Enters {},{},{} in ePAF Submission Date Column.")
	public void selects_Dates_in_submission_date_column(String BestDate, String BaseDate, String AcheivedDate)
			throws Exception {
		SelectDates(BestDate, BaseDate, AcheivedDate);

	}

	@And("clicks on Not Applicable checkbox of P&R Dossier Submission Date Column.")
	public void clicks_on_not_applicable_checkbox_of_p_r_dossier_submission_date_column() throws Exception {
		Checkbox_PR_Dossier_Submission_Date_Column();
	}

	@And("clicks on Not Applicable checkbox of Cut Off Date for IPR Column.")
	public void clicks_on_not_applicable_checkbox_of_cut_off_date_for_ipr_column() throws Exception {
		checkbox_Cut_Off_Date_for_IPR_Column();
	}

	@And("clicks on Not Applicable checkbox of Official Price Publication for unreimbursed launch Column.")
	public void clicks_on_not_applicable_checkbox_of_official_price_publication_for_unreimbursed_launch_date_column()
			throws Exception {
		checkbox_officialPriceUnreimbursed();
	}

	@And("clicks on Not Applicable checkbox of Official Price Publication for reimbursed launch Column.")
	public void clicks_on_not_applicable_checkbox_of_official_price_publication_for_reimbursed_launch_column()
			throws Exception {
		checkbox_officialPriceReimbursed();

	}

	@And("clicks on Not Applicable checkbox of Unreimbursed Launch Date Column.")
	public void clicks_on_not_applicable_checkbox_of_unreimbursed_launch_date_column() throws Exception {
		checkbox_Unreimbursed();
	}

	@And("clicks on Not Applicable checkbox of Reimbursed Launch Date Column.")
	public void clicks_on_not_applicable_checkbox_of_reimbursed_launch_date_column() throws Exception {
		checkbox_Reimbursed();
	}

	@And("checks if Save & Notify button is available in the ROLD case")
	public void Save_And_Notify_Button_Visibility() throws Exception {
		SaveAndNotifyVisibility();
	}

	@And("checks if Complete button is available in the ROLD case")
	public void Complete_Button_Visibility() throws Exception {
		CompleteButtonVisibility();
	}

	@Then("User checks if Apply changes pop is displayed when clicked on the not applicable checkmark in the ROLD case")
	public void Apply_Changes_Popup_Visibility() throws Exception {
		ApplyChangesPopup_Visibility();
	}

	@And("User clicks on Not Applicable checkbox of ePAF Submission Date Column in the ROLD case")
	public void click_on_ePAFSubmissionDate_CheckMark() throws Exception {
		checkbox_ePAFSubmissionDate();
	}

	@And("User clicks on Not Applicable checked checkbox of ePAF Submission Date Column in the ROLD case")
	public void click_on_ePAFSubmissionDate_Checked_Checkbox() throws Exception {
		clickOnEPAFSubmissionDate_Checked_Checkbox();
	}

	@And("User clicks on Not Applicable checked checkbox of P&R Dossier Submission Date Column in the ROLD case")
	public void clicks_on_not_applicable_checked_checkbox_of_p_r_dossier_submission_date_column() throws Exception {
		PR_Dossier_Submission_Date_Checked_Checkbox();
	}

	@And("User clicks on Not Applicable checked checkbox of Cut Off Date for IPR Column in the ROLD case")
	public void click_on_Cut_Off_Date_for_IPR_Column_Checked_Checkbox() throws Exception {
		CutOffDateforIPRColumn_Checked_Checkbox();
	}

	@And("User clicks on Not Applicable checked checkbox of Official Price Publication for unreimbursed launch Column in the ROLD case")
	public void click_on_Official_Price_Publication_for_unreimbursed_launch_Column_Checked_Checkbox() throws Exception {
		OfficialPricePublicationforUnreimbursedLaunch_Checked_Checkbox();
	}

	@And("User clicks on Not Applicable checked checkbox of Official Price Publication for reimbursed launch Column in the ROLD case")
	public void click_on_Official_Price_Publication_for_reimbursed_launch_Column_Checked_Checkbox() throws Exception {
		OfficialPricePublicationforReimbursedLaunch_Checked_Checkbox();
	}

	@And("User clicks on Not Applicable checked checkbox of Unreimbursed Launch Date Column in the ROLD case")
	public void click_on_Unreimbursed_launch_Date_Column_Checked_Checkbox() throws Exception {
		UnreimbursedLaunchDate_Checked_Checkbox();
	}

	@And("User clicks on Not Applicable checked checkbox of Reimbursed Launch Date Column in the ROLD case")
	public void click_on_Reimbursed_launch_Date_Column_Checked_Checkbox() throws Exception {
		ReimbursedLaunchDate_Checked_Checkbox();
	}

	@And("User clicks on cancel button on Apply changes pop")
	public void click_on_Cancel_ApplyChangesPopup() throws Exception {
		click_on_Cancel_on_ApplyChangesPopup();

	}

	@And("User clicks on Continue button on Apply changes pop up")
	public void click_on_Continue_ApplyChangesPopup() throws Exception {
		click_on_Continue_on_ApplyChangesPopup();
	}

	@Then("checks if ePAF Submission Date Column is Disabled.")
	public void ePAF_Submission_Date_Column_Disabled() throws Exception {
		ePAFSubmissionDateColumn_Disabled();
	}

	@Then("checks if P&R Dossier Submission Date Column is Disabled.")
	public void PandR_Dossier_Submission_Date_Column_Disabled() throws Exception {
		PandRDossierSubmissionDateColumn_Disabled();
	}

	@Then("checks if Cut Off Date for IPR Column is Disabled.")
	public void Cut_Off_Date_for_IPR_Column_Disabled() throws Exception {
		CutOffDateforIPRColumn_Disabled();
	}

	@Then("checks if Official Price Publication for unreimbursed launch Column is Disabled.")
	public void Official_Price_Publication_for_unreimbursed_launch_Column_Disabled() throws Exception {
		OfficialPricePublicationforUnreimbursedLaunchColumn_Disabled();
	}

	@Then("checks if Official Price Publication for reimbursed launch is Disabled.")
	public void Official_Price_Publication_for_reimbursed_launch_Column_Disabled() throws Exception {
		OfficialPricePublicationforReimbursedLaunchColumn_Disabled();
	}

	@Then("checks if Unreimbursed Launch Date Column is Disabled.")
	public void Unreimbursed_Launch_Date_Column_Disabled() throws Exception {
		UnreimbursedLaunchDateColumn_Disabled();
	}

	@Then("checks if Reimbursed Launch Date Column is Disabled.")
	public void Reimbursed_Launch_Date_Column_Disabled() throws Exception {
		ReimbursedLaunchDateColumn_Disabled();
	}

	@Then("checks if ePAF Submission Date Column is Enabled")
	public void ePAF_Submission_Date_Column_Enabled() throws Exception {
		ePAFSubmissionDateColumn_Enabled();
	}

	@Then("checks if P&R Dossier Submission Date Column is Enabled")
	public void PandR_Dossier_Submission_Date_Column_Enabled() throws Exception {
		PandRSubmissionDateColumn_Enabled();
	}

	@Then("checks if Cut Off Date for IPR Column is Enabled")
	public void Cut_Off_Date_for_IPR_Column_Enabled() throws Exception {
		CutOffDateforIPRColumn_Enabled();
	}

	@Then("checks if Official Price Publication for unreimbursed launch Column is Enabled.")
	public void Official_Price_Publication_for_unreimbursed_launch_Column_Enabled() throws Exception {
		OfficialPricePublicationforUnreimbursedLaunchColumn_Enabled();
	}

	@Then("checks if Official Price Publication for reimbursed launch Column is Enabled.")
	public void Official_Price_Publication_for_reimbursed_launch_Column_Enabled() throws Exception {
		OfficialPricePublicationforReimbursedLaunchColumn_Enabled();
	}

	@Then("checks if Unreimbursed Launch Date Column is Enabled.")
	public void Unreimbursed_Launch_Date_Column_Enabled() throws Exception {
		UnreimbursedLaunchDateColumn_Enabled();
	}

	@Then("checks if Reimbursed Launch Date Column is Enabled.")
	public void Reimbursed_Launch_Date_Column_Enabled() throws Exception {
		ReimbursedLaunchDateColumn_Enabled();
	}

	@And("Ropu User clicks on Complete button.")
	public void ropu_user_clicks_on_complete_button() throws Exception {
		CompleteButton();
		CloseButton();
		logout();
	}

}
