package testCases;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.GLDTPage;
import pages.HomePage;
import pages.Jira_ticketPage;
import pages.LoginPage;
import pages.RALDPage;
import pages.ROLDPage;

public class RopuTestCases extends BaseClass {

	LoginPage loginpage;
	ROLDPage roldpage;
	HomePage homepage;
	static int first_Row;
	static int last_Row;
	Jira_ticketPage jira_ticket = new Jira_ticketPage();
	String testCaseName = "gldt_HP_03";

	public void setup1() throws Exception {
		initiate_Chromedriver_Open_URL();

	}

	// @Test(priority=1)
	public void Ropu_login(String username, String password) throws Exception {
		loginpage = new LoginPage();
		loginpage.bips_APP_Login(username, password);
		System.out.println("Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");

	}

	// @Test(priority=2)
	public void Opens_ExistingROLDCase() throws Exception {
		homepage = new HomePage();
		homepage.Open_Existing_ROLDCase();

	}

	public void captureROLD_id() throws Exception {
		roldpage = new ROLDPage();

		roldpage.capture_ROLDCase_id();
	}

	// @Test(priority = 3)
	public void SelectDates(String BestDate, String BaseDate, String AcheivedDate) throws Exception {
		roldpage = new ROLDPage();
		roldpage.bestDate_ePAF_Submission_Date(BestDate);
		Thread.sleep(5000);
		roldpage.baseDate_ePAF_Submission_Date(BaseDate);
		roldpage.AcheivedDate_ePAF_Submission_Date(AcheivedDate);

	}

	public void checkbox_ePAFSubmissionDate() throws Exception {

		roldpage = new ROLDPage();
		roldpage.checkbox_ePAFSubmissionDate();

	}

	public void clickOnEPAFSubmissionDate_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_ePAFSubmissionDate();

	}

	public void CutOffDateforIPRColumn_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_CutOffDateforIPR();

	}

	public void OfficialPricePublicationforUnreimbursedLaunch_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_OfficialPricePublicationforUnreimbursedLaunch();

	}

	public void OfficialPricePublicationforReimbursedLaunch_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_OfficialPricePublicationforReimbursedLaunch();

	}

	public void UnreimbursedLaunchDate_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_UnreimbursedLaunchDate();

	}

	public void ReimbursedLaunchDate_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_ReimbursedLaunchDate();

	}

	// @Test(priority=4)
	public void Checkbox_PR_Dossier_Submission_Date_Column() throws Exception {

		roldpage = new ROLDPage();
		roldpage.Checkbox_PR_Dossier_Submission_Date_Column();

	}

	public void PR_Dossier_Submission_Date_Checked_Checkbox() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CheckedCheckbox_PR_Dossier_Submission_Date_Column();

	}

	// @Test(priority=5)
	public void checkbox_Cut_Off_Date_for_IPR_Column() throws Exception {

		roldpage = new ROLDPage();
		roldpage.checkbox_Cut_Off_Date_for_IPR_Column();

	}

	// @Test(priority=6)
	public void checkbox_officialPriceUnreimbursed() throws Exception {

		roldpage = new ROLDPage();
		roldpage.checkbox_officialPriceUnreimbursed();

	}

	// @Test(priority=7)
	public void checkbox_officialPriceReimbursed() throws Exception {

		roldpage = new ROLDPage();
		roldpage.checkbox_officialPriceReimbursed();

	}

	// @Test(priority=8)
	public void checkbox_Unreimbursed() throws Exception {

		roldpage = new ROLDPage();
		roldpage.checkbox_Unreimbursed();

	}

	// @Test(priority=9)
	public void checkbox_Reimbursed() throws Exception {

		roldpage = new ROLDPage();
		roldpage.checkbox_Reimbursed();

	}

	public void SaveAndNotifyVisibility() throws Exception {

		roldpage = new ROLDPage();
		roldpage.SaveAndNotifyButton();

	}

	public void CompleteButtonVisibility() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CompleteButtonVisibility();

	}

	public void ApplyChangesPopup_Visibility() throws Exception {

		roldpage = new ROLDPage();
		roldpage.ApplyChangesPopupVisibility();

	}

	public void click_on_Cancel_on_ApplyChangesPopup() throws Exception {

		roldpage = new ROLDPage();
		roldpage.click_on_CancelButton_on_ApplyChangesPopup();

	}

	public void click_on_Continue_on_ApplyChangesPopup() throws Exception {

		roldpage = new ROLDPage();
		roldpage.click_on_Continue_on_ApplyChangesPopup();

	}

	public void ePAFSubmissionDateColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.ePAFSubmissionDateColumn_Disabled();

	}

	public void PandRDossierSubmissionDateColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.PandRDossierSubmissionDateColumn_Disabled();

	}

	public void CutOffDateforIPRColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CutOffDateforIPRColumn_Disabled();

	}

	public void OfficialPricePublicationforUnreimbursedLaunchColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.OfficialPricePublicationforUnreimbursedLaunchColumn_Disabled();

	}

	public void OfficialPricePublicationforReimbursedLaunchColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.OfficialPricePublicationforReimbursedLaunchColumn_Disabled();

	}

	public void UnreimbursedLaunchDateColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.UnreimbursedLaunchDateColumn_Disabled();

	}

	public void ReimbursedLaunchDateColumn_Disabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.ReimbursedLaunchDateColumn_Disabled();

	}

	public void ePAFSubmissionDateColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.ePAFSubmissionDateColumn_Enabled();

	}

	public void PandRSubmissionDateColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.PandRSubmissionDateColumn_Enabled();

	}

	public void CutOffDateforIPRColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CutOffDateforIPRColumn_Enabled();

	}

	public void OfficialPricePublicationforUnreimbursedLaunchColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.OfficialPricePublicationforUnreimbursedLaunchColumn_Enabled();

	}

	public void OfficialPricePublicationforReimbursedLaunchColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.OfficialPricePublicationforReimbursedLaunchColumn_Enabled();

	}

	public void UnreimbursedLaunchDateColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.UnreimbursedLaunchDateColumn_Enabled();

	}

	public void ReimbursedLaunchDateColumn_Enabled() throws Exception {

		roldpage = new ROLDPage();
		roldpage.ReimbursedLaunchDateColumn_Enabled();

	}

	public void click_on_Cut_Off_Date_for_IPR_CheckMark_Cancel() throws Exception {

		roldpage = new ROLDPage();
		roldpage.clickOnCutOffDateForIPRCheckMark_CancelButton();

	}

	public void click_on_Cut_Off_Date_for_IPR_CheckMark_Continue() throws Exception {

		roldpage = new ROLDPage();
		roldpage.clickOnCutOffDateForIPRCheckMark_ContinueButton();

	}

	// @Test(priority=10)
	public void CompleteButton() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CompleteButton();

	}

	// @Test(priority=11)
	public void CloseButton() throws Exception {

		roldpage = new ROLDPage();
		roldpage.CloseButton();

	}

	// @AfterTest
	public void logout() throws Exception {
		homepage = new HomePage();
		homepage.logout();
		Thread.sleep(2000);
		driver.quit();

	}

}
