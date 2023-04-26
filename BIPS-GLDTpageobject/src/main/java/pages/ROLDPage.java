package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import actiondriver.Action;
import baseclass.BaseClass;

public class ROLDPage extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	WebElement frame1;

	@FindBy(xpath = "//iframe[@id='PegaGadget2Ifr']")
	WebElement frame2;

	@FindBy(xpath = "//span[@class='workarea_header_id']")
	WebElement headerid;

	@FindBy(xpath = "//span[contains(text(),'(ROLD-')]")
	WebElement expectedROLD_Case_Id;

	@FindBy(xpath = "//input[@id='d21e5ede']")
	WebElement ePAFSubmissionDate_Best;

	@FindBy(xpath = "//input[@id='ae7f7b05']")
	WebElement ePAFSubmissionDate_Base;

	@FindBy(xpath = "//input[@id='33709a73']")
	WebElement ePAFSubmissionDate_Acheived;

	@FindBy(xpath = "//input[@id='515edcb6']")
	WebElement PandRDossierSubmissionDate_Best;

	@FindBy(xpath = "//input[@id='e10075d3']")
	WebElement CutOffDateForIPR_Best;

	@FindBy(xpath = "//input[@id='fcc564b7']")
	WebElement OfficialPricePublicationForUnreimbursedLaunch_Best;

	@FindBy(xpath = "//input[@id='e6ffe753']")
	WebElement OfficialPricePublicationForReimbursedLaunch_Best;

	@FindBy(xpath = "//input[@id='59a1b039']")
	WebElement UnreimbursedLaunchDate_Best;

	@FindBy(xpath = "//input[@id='ec1c27c4']")
	WebElement ReimbursedLaunchDate_Best;

	@FindBy(xpath = "//input[@id='e7ac2b61']")
	WebElement CheckboxPR;

	@FindBy(xpath = "//input[@id='b52b7737']")
	WebElement Checkboxcutoff;

	@FindBy(xpath = "//input[@id='17c420e1']")
	WebElement officialPriceUnreimbursed;

	@FindBy(xpath = "//input[@id='3cdc2b72']")
	WebElement officialPriceReimbursed;

	@FindBy(xpath = "//input[@id='14bd8026']")
	WebElement unReimbursedLaunchDate;

	@FindBy(xpath = "//input[@id='c4823044']")
	WebElement reimbursedLauchDate;

	@FindBy(xpath = "//button[contains(text(),'Complete')]")
	WebElement CompleteButton;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement CloseButton;

	@FindBy(xpath = "//input[@id='515edcb6']")
	WebElement PR_Dossier_column;

	@FindBy(xpath = "//input[@id='e10075d3']")
	WebElement cutOffDateforIPRcolumn;

	@FindBy(xpath = "//button[@name='SetROPULaunchDates_pyWorkPage_94']")
	WebElement saveButton;

	@FindBy(xpath = "//input[@id='74b7d1ed']")
	WebElement Check_Mark1;

	@FindBy(xpath = "(//input[@id='74b7d1ed'])[2]")
	WebElement Check_Mark11_Checked;

	@FindBy(xpath = "//input[@id='e7ac2b61']")
	WebElement Check_Mark2;

	@FindBy(xpath = "(//input[@id='e7ac2b61'])[2]")
	WebElement Check_Mark21_Checked;

	@FindBy(xpath = "//input[@id='b52b7737']")
	WebElement Check_Mark3;

	@FindBy(xpath = "(//input[@id='b52b7737'])[2]")
	WebElement Check_Mark31_Checked;

	@FindBy(xpath = "//input[@id='17c420e1']")
	WebElement Check_Mark4;

	@FindBy(xpath = "(//input[@id='17c420e1'])[2]")
	WebElement Check_Mark41_Checked;

	@FindBy(xpath = "//input[@id='3cdc2b72']")
	WebElement Check_Mark5;

	@FindBy(xpath = "(//input[@id='3cdc2b72'])[2]")
	WebElement Check_Mark51_Checked;

	@FindBy(xpath = "//input[@id='14bd8026']")
	WebElement Check_Mark6;

	@FindBy(xpath = "(//input[@id='14bd8026'])[2]")
	WebElement Check_Mark61_Checked;

	@FindBy(xpath = "//input[@id='c4823044']")
	WebElement Check_Mark7;

	@FindBy(xpath = "(//input[@id='c4823044'])[2]")
	WebElement Check_Mark71_Checked;

	@FindBy(xpath = "//span[contains(text(),'Apply Changes')]")
	WebElement ApplyChangesPopup;

	@FindBy(xpath = "//button[@title='Continue']")
	WebElement ContinueButton;

	@FindBy(xpath = "//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']")
	WebElement CancelButton;

	@FindBy(linkText = "Today")
	WebElement TodayDate;

	public ROLDPage() {
		PageFactory.initElements(driver, this);
	}

	static SoftAssert softAssert = new SoftAssert();
	public static String ROLD_Case_Id;

	public void capture_ROLDCase_id() throws Exception {
		try {
			action.switchToDefaultFrame(driver);
			action.switchToFrame(driver, frame1);
			ROLD_Case_Id = headerid.getText();
			System.out.println("ActualROLDId:" + ROLD_Case_Id);
			String expectedROLDID = expectedROLD_Case_Id.getText();
			System.out.println("Expected RALD ID:" + expectedROLDID);
			Assert.assertEquals(ROLD_Case_Id, expectedROLDID);
			ROLD_Case_Id = ROLD_Case_Id.substring(ROLD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(ROLD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			ROLD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_ROLDCase_id is" + ROLD_Case_Id);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void bestDate_ePAF_Submission_Date(String BestDate) throws Exception {
		try {
			// driver.switchTo().defaultContent();
			// action.switchToFrame(driver, frame1);
			Thread.sleep(6000);
			action.type(ePAFSubmissionDate_Best, BestDate);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void baseDate_ePAF_Submission_Date(String BaseDate) throws Exception {
		try {
			Thread.sleep(3000);
			action.type(ePAFSubmissionDate_Base, BaseDate);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}
	}

	public void AcheivedDate_ePAF_Submission_Date(String AcheivedDate) throws Exception {
		try {
			Thread.sleep(7000);
			action.type(ePAFSubmissionDate_Acheived, AcheivedDate);
			Thread.sleep(3000);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}
	}

	public void Checkbox_PR_Dossier_Submission_Date_Column() throws Exception {
		try {
			Thread.sleep(3000);
			action.click(driver, CheckboxPR);
			Thread.sleep(5000);
			boolean Check_Mark1aPopUp = ContinueButton.isDisplayed();
			Assert.assertTrue(Check_Mark1aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark1aPopUp);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
		}

	}

	public void checkbox_Cut_Off_Date_for_IPR_Column() throws Exception {
		try {
			Thread.sleep(3000);
			action.click(driver, Checkboxcutoff);
			Thread.sleep(5000);

			boolean Check_Mark2aPopUp = ContinueButton.isDisplayed();
			Assert.assertTrue(Check_Mark2aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark2aPopUp);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void checkbox_officialPriceUnreimbursed() throws Exception {

		try {
			Thread.sleep(3000);
			action.click(driver, officialPriceUnreimbursed);
			Thread.sleep(3000);
			action.explicitWait1(driver, ContinueButton);
			boolean Check_Mark3aPopUp = ContinueButton.isDisplayed();
			Assert.assertTrue(Check_Mark3aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark3aPopUp);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void checkbox_officialPriceReimbursed() throws Exception {
		try {
			Thread.sleep(3000);

			action.click(driver, officialPriceReimbursed);
			Thread.sleep(3000);

			boolean Check_Mark4aPopUp = ContinueButton.isDisplayed();
			Assert.assertTrue(Check_Mark4aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark4aPopUp);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void checkbox_Unreimbursed() throws Exception {
		try {
			// action.explicitWait1(driver, unReimbursedLaunchDate);
			Thread.sleep(3000);
			action.click(driver, unReimbursedLaunchDate);
			Thread.sleep(3000);
			// action.explicitWait1(driver, popupPR);
			boolean Check_Mark5aPopUp = ContinueButton.isDisplayed();
			Assert.assertTrue(Check_Mark5aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark5aPopUp);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void checkbox_Reimbursed() throws Exception {

		try {
			Thread.sleep(3000);
			action.click(driver, reimbursedLauchDate);
			Thread.sleep(3000);

			boolean Check_Mark5aPopUp = ContinueButton.isDisplayed();
			Assert.assertTrue(Check_Mark5aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark5aPopUp);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void SaveAndNotifyButton() throws Exception {

		try {

			softAssert.assertTrue(saveButton.isDisplayed());
			softAssert.assertAll();
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CompleteButtonVisibility() throws Exception {

		try {

			softAssert.assertTrue(CompleteButton.isDisplayed());
			softAssert.assertAll();
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void ApplyChangesPopupVisibility() throws Exception {

		try {

			Thread.sleep(5000);
			Check_Mark1.click();
			Assert.assertTrue(ApplyChangesPopup.isDisplayed());
			Assert.assertTrue(ContinueButton.isDisplayed());
			Assert.assertTrue(CancelButton.isDisplayed());
			CancelButton.click();
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void checkbox_ePAFSubmissionDate() throws Exception {
		try {
			Thread.sleep(3000);
			action.explicitWait(driver, Check_Mark1);
			Check_Mark1.click();
			softAssert.assertTrue(ApplyChangesPopup.isDisplayed());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void click_on_CancelButton_on_ApplyChangesPopup() throws Exception {

		try {
			CancelButton.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void click_on_Continue_on_ApplyChangesPopup() throws Exception {

		try {

			ContinueButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void ePAFSubmissionDateColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(ePAFSubmissionDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void PandRDossierSubmissionDateColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(PandRDossierSubmissionDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CutOffDateforIPRColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(CutOffDateForIPR_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void OfficialPricePublicationforUnreimbursedLaunchColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(OfficialPricePublicationForUnreimbursedLaunch_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void OfficialPricePublicationforReimbursedLaunchColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(OfficialPricePublicationForReimbursedLaunch_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void UnreimbursedLaunchDateColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(UnreimbursedLaunchDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void ReimbursedLaunchDateColumn_Disabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertFalse(ReimbursedLaunchDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CheckedCheckbox_ePAFSubmissionDate() throws Exception {
		try {
			Thread.sleep(2000);
			Check_Mark11_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CheckedCheckbox_PR_Dossier_Submission_Date_Column() throws Exception {
		try {

			Thread.sleep(2000);
			Check_Mark21_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
		}

	}

	public void CheckedCheckbox_CutOffDateforIPR() throws Exception {
		try {
			Thread.sleep(2000);
			Check_Mark31_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CheckedCheckbox_OfficialPricePublicationforUnreimbursedLaunch() throws Exception {
		try {
			Thread.sleep(2000);
			Check_Mark41_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CheckedCheckbox_OfficialPricePublicationforReimbursedLaunch() throws Exception {
		try {
			Thread.sleep(2000);
			Check_Mark51_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CheckedCheckbox_UnreimbursedLaunchDate() throws Exception {
		try {
			Thread.sleep(2000);
			Check_Mark61_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CheckedCheckbox_ReimbursedLaunchDate() throws Exception {
		try {
			Thread.sleep(2000);
			Check_Mark71_Checked.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
		}

	}

	public void ePAFSubmissionDateColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(ePAFSubmissionDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void PandRSubmissionDateColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(PandRDossierSubmissionDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CutOffDateforIPRColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(CutOffDateForIPR_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void OfficialPricePublicationforUnreimbursedLaunchColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(OfficialPricePublicationForUnreimbursedLaunch_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void OfficialPricePublicationforReimbursedLaunchColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(OfficialPricePublicationForReimbursedLaunch_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void UnreimbursedLaunchDateColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(UnreimbursedLaunchDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void ReimbursedLaunchDateColumn_Enabled() throws Exception {

		try {
			Thread.sleep(2000);
			Assert.assertTrue(ReimbursedLaunchDate_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void clickOnCutOffDateForIPRCheckMark_CancelButton() throws Exception {

		try {
			action.explicitWait(driver, Check_Mark3);
			Check_Mark3.click();
			softAssert.assertTrue(ApplyChangesPopup.isDisplayed());
			CancelButton.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void clickOnCutOffDateForIPRCheckMark_ContinueButton() throws Exception {

		try {
			Thread.sleep(2000);
			action.explicitWait(driver, Check_Mark2);
			Check_Mark3.click();
			ContinueButton.click();
			Thread.sleep(2000);
			Assert.assertFalse(CutOffDateForIPR_Best.isEnabled());

			Thread.sleep(2000);
			Check_Mark31_Checked.click();
			Thread.sleep(2000);
			Assert.assertTrue(CutOffDateForIPR_Best.isEnabled());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CompleteButton() throws Exception {
		try {
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			action.switchToFrame(driver, frame1);
			Thread.sleep(3000);
			action.click(driver, CompleteButton);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void CloseButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		action.switchToFrame(driver, frame1);
		Thread.sleep(3000);
		action.click(driver, CloseButton);

	}

}
