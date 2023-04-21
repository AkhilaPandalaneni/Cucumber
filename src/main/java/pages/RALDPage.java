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


public class RALDPage extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	WebElement Frame1;

	@FindBy(xpath = "//span[@class='workarea_header_id']")
	WebElement headerid;

	@FindBy(xpath = "//span[contains(text(),'(RALD-')]")
	WebElement expectedRALD_Case_Id;

	@FindBy(xpath = "//input[@id='79a8ae4c']")
	WebElement SubmissionDate_Best;

	@FindBy(xpath = "//input[@id='2a32f5c8']")
	WebElement base;

	@FindBy(xpath = "(//img[@class='inactvIcon'])[5]")
	WebElement Acheived;

	@FindBy(linkText = "Today")
	WebElement TodayDate2;

	@FindBy(xpath = "//button[@title='Continue']")
	WebElement Check_Mark2a;

	@FindBy(xpath = "//input[@id='b56200e4']")
	WebElement approvalcolumn;

	@FindBy(xpath = "//button[contains(text(),'Initiate ROPU Process')]")
	WebElement InitiateRopuProcessButton1;

	@FindBy(xpath = "//div[@id='modaldialog_hd']")
	WebElement statusPopUp;

	@FindBy(xpath = "//span[contains(text(),'ROPU Process initiated successfully')]")
	WebElement RopuMessage;

	@FindBy(xpath = "//button[@name='OKModalTemplate_pyWorkPage_12']")
	WebElement ok;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement close;

	@FindBy(xpath = "//iframe[@id='PegaGadget2Ifr']")
	WebElement frame2;

	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
	WebElement actualdashBoard;

	@FindBy(xpath = "//button[contains(text(),'Complete')]")
	WebElement complete;

	@FindBy(xpath = "(//span[contains(text(),'Pending-SubCaseProcessing')])[3]")	
	WebElement status;
	
	@FindBy(xpath = "//span[contains(text(),'Welcome')]")	
	WebElement welcome;
	
	@FindBy(xpath ="//button[@name='SetProductLaunchDates_pyWorkPage_94']")
	WebElement InitiateRopuProcessButton;
	
	@FindBy(xpath ="//button[@name='SetProductLaunchDates_pyWorkPage_95']")
	WebElement saveButton;
	
	@FindBy(xpath ="//button[@name='SetProductLaunchDates_pyWorkPage_96']")
	WebElement CompleteButton;
	
	@FindBy(xpath ="//span[contains(text(),'Apply Changes')]")
	WebElement ApplyChangesPopup;
	
	@FindBy(xpath ="//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']")
	WebElement CancelButton;
	
	@FindBy(xpath ="//button[@title='Continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath ="//input[@id='7dd07b86']")
	WebElement Check_Mark1;
	
	@FindBy(xpath ="(//input[@id='7dd07b86'])[2]")
	WebElement Check_Mark11;
	
	@FindBy(xpath = "//*[@id='e0446e74']")
	WebElement Check_Mark2;
	
	@FindBy(xpath ="(//input[@id='e0446e74'])[2]")
	WebElement Check_Mark21;
	

	@FindBy(xpath ="//input[@id='b56200e4']")
	WebElement ApprovalDate_Best;
	
	
	
	

	

	
	
	
	
	
	
	

	public RALDPage() {
		PageFactory.initElements(driver, this);
	}
	
	static SoftAssert softAssert = new SoftAssert();
	public static String RALD_Case_Id;

	public  void capture_RALDCase_id() throws Exception {
		try {
			action.switchToDefaultFrame(driver);
			action.switchToFrame(driver, Frame1);
			RALD_Case_Id = headerid.getText();
			System.out.println("ActualRALDId:" + RALD_Case_Id);
			String expectedRALDID = expectedRALD_Case_Id.getText();
			System.out.println("Expected RALD ID:" + expectedRALDID);
			Assert.assertEquals(RALD_Case_Id, expectedRALDID);
			RALD_Case_Id = RALD_Case_Id.substring(RALD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(RALD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			RALD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id is" + RALD_Case_Id);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			
		}
	}


	

	public void clickOnBestDate(String BestDate) throws Exception {
		try {
			Thread.sleep(3000);
			action.type(SubmissionDate_Best, BestDate);
		//	best.sendKeys(BestDate);
			Thread.sleep(3000);
					

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}
	}

	public void clickOnBaseDate(String basedate) throws Exception {
		try {

			Thread.sleep(3000);
			action.type(base, basedate);
			Thread.sleep(3000);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}

	}

	public void clickOnAcheivedDate() throws Exception {
		try {

			Thread.sleep(5000);
			action.click(driver, Acheived);
			Thread.sleep(3000);
			String selectDate = TodayDate2.getText();
			System.out.println(TodayDate2);
			String expectedDate = "Today";
			Assert.assertEquals(selectDate, expectedDate);
			System.out.println("Entered AcheivedDate is verified:" + selectDate);
			action.click(driver, TodayDate2);
			Thread.sleep(3000);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}
	}

	public void approvalDate() throws Exception {

		try {
			action.explicitWait1(driver, Check_Mark2);
			action.click(driver, Check_Mark2);
			// popupScreeen//
			action.explicitWait1(driver, Check_Mark2a);
			boolean Check_Mark2aPopUp = Check_Mark2a.isDisplayed();
			Assert.assertTrue(Check_Mark2aPopUp);
			System.out.println("ApplyChanges PopUp is opened:" + Check_Mark2aPopUp);
			action.click(driver, Check_Mark2a);
			Thread.sleep(3000);
			boolean approvalcolumnDisabled = approvalcolumn.isEnabled();
			Assert.assertTrue(!approvalcolumnDisabled);
			System.out.println("ApprovalDate column is enabled:" + approvalcolumnDisabled);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}
	}

	public void ROPUProcess() throws Exception {
		try {
			action.switchToDefaultFrame(driver);
			action.switchToFrame(driver, Frame1);
			Thread.sleep(7000);
			action.click(driver, InitiateRopuProcessButton);
			boolean PopuP = statusPopUp.isDisplayed();
			Assert.assertTrue(PopuP);
			System.out.println("Status PopUp is opened:" + PopuP);
			String actualRopuMessage = RopuMessage.getText();
			String expectedRopuMessage = "ROPU Process initiated successfully";
			Assert.assertEquals(actualRopuMessage, expectedRopuMessage);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}

	}

	public void clickOnOk() throws Exception {
		try {
			Thread.sleep(3000);
			action.click(driver, ok);

			Thread.sleep(1000);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}
	}

	public void clickOnCompleteasRA() throws Exception {
		try {
		Thread.sleep(3000);
		action.switchToDefaultFrame(driver);
		action.switchToFrame(driver, Frame1);
		Thread.sleep(3000);
		action.click(driver, complete);
		String actualstatus = status.getText();
		String expectedstatus = "PENDING-SUBCASEPROCESSING";
		Assert.assertEquals(expectedstatus, actualstatus);
		System.out.println("Status Verified:" + actualstatus);
		

		} catch (Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
		jira_ticketPage.Create_JiraTicket(currentMethod);
		

		}
	}

	public void clickOnCloseAsRA() throws Exception {
		try {
		Thread.sleep(5000);
		action.switchToDefaultFrame(driver);
		action.switchToFrame(driver, Frame1);
		Thread.sleep(3000);
		action.click(driver, close);
		action.switchToDefaultFrame(driver);
		action.switchToFrame(driver, frame2);
		String actualdashBoard=welcome.getText();
		String expectedDashBoard = "Welcome";
		Assert.assertEquals(actualdashBoard, expectedDashBoard);
		System.out.println("Returned to Dashboard has been verified:" + expectedDashBoard);
		

		} catch (Exception e) {
		 String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		 Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
		jira_ticketPage.Create_JiraTicket(currentMethod);
		

		 }

	}

	public void InitiateRopuProcessButtonVisibility() throws Exception {
		try {
		     softAssert.assertFalse(InitiateRopuProcessButton1.isEnabled());
			 softAssert.assertAll();
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
	public void SaveAndNotifyVisibility() throws Exception {
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
			softAssert.assertFalse(CompleteButton.isEnabled());
			softAssert.assertAll();
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
	
	public void ApplyChangesPopup_Visibility() throws Exception {
		try {
			action.explicitWait1(driver, Check_Mark2);
			Check_Mark2.click();
			softAssert.assertTrue(ApplyChangesPopup.isDisplayed());
            softAssert.assertTrue(CancelButton.isDisplayed());
			softAssert.assertTrue(ContinueButton.isDisplayed());
			CancelButton.click();
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
	
	public void SubmissionCheckMark_Cancel() throws Exception {
		try {
			Thread.sleep(3000);
			action.explicitWait(driver, Check_Mark1);
			Check_Mark1.click();
			CancelButton.click();
			//WebElement best=driver.findElement(By.xpath("//img[@class='inactvIcon']"));
			softAssert.assertTrue(SubmissionDate_Best.isEnabled());
			softAssert.assertAll();
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
	public void SubmissionCheckMark_Continue() throws Exception {
		try {
			Thread.sleep(3000);
			action.explicitWait(driver, Check_Mark1);
			Check_Mark1.click();
            //WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
			ContinueButton.click();
			Thread.sleep(2000);
			Assert.assertFalse(SubmissionDate_Best.isEnabled());
			Thread.sleep(2000);
			Check_Mark11.click();
			Thread.sleep(2000);
			Assert.assertTrue(SubmissionDate_Best.isEnabled());
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
	
	public void ApprovalCheckMark_Cancel() throws Exception {
		try {
			Thread.sleep(3000);
			action.explicitWait(driver, Check_Mark2);
			Check_Mark2.click();
			Thread.sleep(3000);
			CancelButton.click();
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
	public void ApprovalCheckMark_Continue() throws Exception {
		try {
			Thread.sleep(3200);
			action.explicitWait(driver, Check_Mark2);
			Check_Mark2.click();
		    ContinueButton.click();
			Thread.sleep(2000);
			Assert.assertFalse(ApprovalDate_Best.isEnabled());
			Thread.sleep(2000);
			Check_Mark21.click();
			Thread.sleep(2000);
			Assert.assertTrue(ApprovalDate_Best.isEnabled());
			} catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
				jira_ticketPage.Create_JiraTicket(currentMethod);
			
			}

		}
	
}
